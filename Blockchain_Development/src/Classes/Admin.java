package Classes;

import HelperClass.Asymmetric;
import HelperClass.FileHandler;
import HelperClass.FileMethods;
import HelperClass.KeyAccess;
import HelperClass.MyKeyPair;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;
import javax.swing.JOptionPane;

public class Admin extends Registration implements FileMethods{
    final private static String filePath = System.getProperty("user.dir") + System.getProperty("file.separator") + "src" + System.getProperty("file.separator") + "Database";
    
    private String userRole, password;
    
    public Admin(String userId, String name, String icOrPassportNumber, String email, String userRole, String password) {
        super(userId, name, icOrPassportNumber, email);
        this.userRole = userRole;
        this.password = password;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    // generate random combination of number and alphabet for admin Id
    public static String generateAdminId(){
        String userId = "AD" + UUID.randomUUID().toString();
        return userId;
    }
    
    // retreive all admin accounts
    public static ArrayList<Admin> getAllAdminAccounts(){
        // retrive from folder
        File adminFolder = FileHandler.retrievePath("Admin", "null");
        File[] adminFiles = adminFolder.listFiles();
        ArrayList<Admin> allAdmins = new ArrayList<>();
        for (File adminFile : adminFiles){
            try (Scanner readFile = new Scanner(adminFile)) {
                while(readFile.hasNext()){
                    allAdmins.add(new Admin(
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
        
        return allAdmins;
    }
    
    // save new registration into file
    public static void saveAdminRegistration(Admin admin) throws Exception {
        // generate public and private key for each user
        String pubFilePath = filePath + "/KeyPair/Admin/PublicKey/" + admin.getUserId();
        String priFilePath = filePath + "/KeyPair/Admin/PrivateKey/" + admin.getUserId();

        Asymmetric asymm = new Asymmetric();
        MyKeyPair.create();
        byte[] publicKey = MyKeyPair.getPublicKey().getEncoded();
        byte[] privateKey = MyKeyPair.getPrivateKey().getEncoded();
        
        MyKeyPair.put(publicKey, pubFilePath);
        MyKeyPair.put(privateKey, priFilePath);
        
        // write data into database
        PublicKey pubKey = KeyAccess.getPublicKey(pubFilePath);
        
        String fileName = admin.setFileName() + ".txt";
        
        File myFile = FileHandler.createFilePath("Admin", fileName);
        try (FileWriter fw = new FileWriter(myFile); BufferedWriter bw = new BufferedWriter(fw);) {
            bw.write(admin.getUserId());
            bw.newLine();
            bw.write(admin.getName());
            bw.newLine();
            bw.write(admin.getIcOrPassportNumber());
            bw.newLine();
            bw.write(admin.getEmail());
            bw.newLine();
            bw.write(admin.getUserRole());
            bw.newLine();
            bw.write(asymm.publicKey(admin.getPassword(), pubKey));   
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Failed to save registration. Please try again.", "Register Admin Account Failed", JOptionPane.ERROR_MESSAGE);
            System.out.println("Error occurred: " + e);
        }
        
        JOptionPane.showMessageDialog(null, "Admin Registration successfully saved.", "Register Admin Account Success!", JOptionPane.INFORMATION_MESSAGE);
    }
        

    @Override
    public String setFileName() {
        return userId;
    }

    @Override
    public String getFileName() {
        return "Admin/" + userId + ".txt";
    }
}
