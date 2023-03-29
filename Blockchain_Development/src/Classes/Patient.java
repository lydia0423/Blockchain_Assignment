package Classes;

import HelperClass.Block;
import HelperClass.Blockchain;
import HelperClass.DigitalSignature;
import HelperClass.FileHandler;
import HelperClass.FileMethods;
import HelperClass.Hasher;
import HelperClass.MyKeyPair;
import HelperClass.Transaction;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.security.PrivateKey;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;
import javax.swing.JOptionPane;

public class Patient extends Registration implements FileMethods{
    final private static String filePath = System.getProperty("user.dir") + System.getProperty("file.separator") + "src" + System.getProperty("file.separator") + "Database";
    private static String blockchainFilePath = filePath + "/master/chain.bin";
    
    private String contactNumber, address, dob, emergencyRelatives, nationality;
    
    public Patient(String userId, String name, String icOrPassportNumber, String contactNumber, String email, String address, String dob, String emergencyRelatives, String nationality){
        super(userId, name, icOrPassportNumber, email);
        this.contactNumber = contactNumber;
        this.address = address;
        this.dob = dob;
        this.emergencyRelatives = emergencyRelatives;
        this.nationality = nationality;
    }
    
    public Patient(String userId){
        super(userId);
    }
    
//    public Patient(String userId, String contactNumber, String email, String address, String dob, String emergencyRelatives, String nationality){
//        super(userId, email);
//        this.contactNumber = contactNumber;
//        this.email = email;
//        this.address = address;
//        this.dob = dob;
//        this.emergencyRelatives = emergencyRelatives;
//        this.nationality = nationality;
//    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getEmergencyRelatives() {
        return emergencyRelatives;
    }

    public void setEmergencyRelatives(String emergencyRelatives) {
        this.emergencyRelatives = emergencyRelatives;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
    
    // generate random combination of number and alphabet for patient Id
    public static String generatePatientId(){
        String userId = "PT" + UUID.randomUUID().toString();
        return userId;
    }
    
    // retreive all patients accounts
    public static ArrayList<Patient> getAllPatientAccounts(){
        // retrive from folder
        File patientFolder = FileHandler.retrievePath("Patient", "null");
        File[] patientFiles = patientFolder.listFiles();
        ArrayList<Patient> allPatients = new ArrayList<>();
        for (File patientFile : patientFiles){
            try (Scanner readFile = new Scanner(patientFile)) {
                while(readFile.hasNext()){
                    allPatients.add(new Patient(
                        readFile.nextLine(),
                        readFile.nextLine(),
                        readFile.nextLine(),
                        readFile.nextLine(),
                        readFile.nextLine(),
                        readFile.nextLine(),
                        readFile.nextLine(),
                        readFile.nextLine(),
                        readFile.nextLine()
                    ));
                }
            } catch (FileNotFoundException e) {
                System.err.println(e);
            }
        }
        
        return allPatients;
    }
    
    // save new registration into file
    public static void savePatientRegistration(Patient patient) throws Exception {
        // generate public and private key for each user
        String pubFilePath = filePath + "/KeyPair/Patient/PublicKey/" + patient.getUserId();
        String priFilePath = filePath + "/KeyPair/Patient/PrivateKey/" + patient.getUserId();
        MyKeyPair.create();
        byte[] publicKey = MyKeyPair.getPublicKey().getEncoded();
        byte[] privateKey = MyKeyPair.getPrivateKey().getEncoded();
        
        MyKeyPair.put(publicKey, pubFilePath);
        MyKeyPair.put(privateKey, priFilePath);
        
        // write data into database
        String fileName = patient.setFileName() + ".txt";
        
        File myFile = FileHandler.createFilePath("Patient", fileName);
        try (FileWriter fw = new FileWriter(myFile); BufferedWriter bw = new BufferedWriter(fw);) {
            bw.write(patient.getUserId());
            bw.newLine();
            bw.write(patient.getName());
            bw.newLine();
            bw.write(patient.getIcOrPassportNumber());
            bw.newLine();
            bw.write(patient.getContactNumber());
            bw.newLine();
            bw.write(patient.getEmail());
            bw.newLine();
            bw.write(patient.getAddress());
            bw.newLine();
            bw.write(patient.getDob());
            bw.newLine();
            bw.write(patient.getEmergencyRelatives());
            bw.newLine();
            bw.write(patient.getNationality());
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Failed to save registration. Please try again.", "Register Patient Account Failed", JOptionPane.ERROR_MESSAGE);
            System.out.println("Error occurred: " + e);
        }
        
        JOptionPane.showMessageDialog(null, "Patient Registration successfully saved.", "Register Patient Account Success!", JOptionPane.INFORMATION_MESSAGE);
    }
    
    // save new registration into blockchain
    public static void savePatientRegistrationIntoBlockchain(Patient patient, PrivateKey patientPrivateKey) throws Exception {
        Blockchain bc = Blockchain.getInstance(blockchainFilePath);
        Transaction tranxList = new Transaction();
        DigitalSignature sig = new DigitalSignature();
        
        String tranxInformation = "Create new patient account";
        String signature = sig.sign(tranxInformation, patientPrivateKey);
        tranxList.add(tranxInformation + "|" + signature);
        
        String previousHash = bc.get().getLast().getBlockHeader().getCurrentHash();
        int currentLength = bc.get().size();
        Block block = new Block(previousHash, tranxList.getMerkleRoot(), Hasher.sha256(patient.getUserId()));
        block.blockHeader.setIndex(currentLength);
        block.setTranxList(tranxList);
        bc.nextBlock(block);
        System.out.println(block);
        bc.distribute();
    }
    
    @Override
    public String setFileName() {
        return userId;
    }
    
    @Override
    public String getFileName() {
        return "Patient/" + userId + ".txt";
    }
}
