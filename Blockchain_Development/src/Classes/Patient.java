package Classes;

import HelperClass.FileHandler;
import HelperClass.FileMethods;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;
import javax.swing.JOptionPane;

public class Patient extends Registration implements FileMethods{
    private String contactNumber, address, dob, emergencyRelatives;
    
    public Patient(String userId, String name, String icOrPassportNumber, String contactNumber, String email, String address, String dob, String emergencyRelatives){
        super(userId, name, icOrPassportNumber, email);
        this.contactNumber = contactNumber;
        this.address = address;
        this.dob = dob;
        this.emergencyRelatives = emergencyRelatives;
    }
    
    public Patient(String userId, String name, String icOrPassportNumber){
        super(userId, name, icOrPassportNumber);
    }
    
    public Patient(String userId, String contactNumber, String email, String address, String dob, String emergencyRelatives){
        super(userId, email);
        this.contactNumber = contactNumber;
        this.address = address;
        this.dob = dob;
        this.emergencyRelatives = emergencyRelatives;
    }

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
    
    // generate random combination of number and alphabet for patient Id
    public static String generatePatientId(){
        String userId = "PT" + UUID.randomUUID().toString();
        return userId;
    }
    
    // retreive all patients accounts
    public static ArrayList<Patient> getAllDoctorAccounts(){
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
    public static void savePatientRegistration(Patient patient) {
        String fileName = patient.setFileName() + ".txt";
        
        File myFile = FileHandler.createFilePath("Patient", fileName);
        try (FileWriter fw = new FileWriter(myFile); BufferedWriter bw = new BufferedWriter(fw);) {
            bw.write(patient.getUserId());
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
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Failed to save registration. Please try again.", "Register Patient Account Failed", JOptionPane.ERROR_MESSAGE);
            System.out.println("Error occurred: " + e);
        }
        
        JOptionPane.showMessageDialog(null, "Patient Registration successfully saved.", "Register Patient Account Success!", JOptionPane.INFORMATION_MESSAGE);
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
