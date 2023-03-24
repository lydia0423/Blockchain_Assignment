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

public class Doctor extends Registration implements FileMethods {
    private String userRole, password;
    
    public Doctor(String userId, String name, String icOrPassportNumber, String email, String userRole, String password) {
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
    
    // generate random combination of number and alphabet for doctor Id
    public static String generateDoctorId(){
        String userId = "DC" + UUID.randomUUID().toString();
        return userId;
    }
    
    // retreive all doctor accounts
    public static ArrayList<Doctor> getAllDoctorAccounts(){
        // retrive from folder
        File doctorFolder = FileHandler.retrievePath("Doctor", "null");
        File[] doctorFiles = doctorFolder.listFiles();
        ArrayList<Doctor> allDoctors = new ArrayList<>();
        for (File doctorFile : doctorFiles){
            try (Scanner readFile = new Scanner(doctorFile)) {
                while(readFile.hasNext()){
                    allDoctors.add(new Doctor(
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
        
        return allDoctors;
    }
    
    // save new registration into file
    public static void saveDoctorRegistration(Doctor doctor) {
        String fileName = doctor.setFileName() + ".txt";
        
        File myFile = FileHandler.createFilePath("Doctor", fileName);
        try (FileWriter fw = new FileWriter(myFile); BufferedWriter bw = new BufferedWriter(fw);) {
            bw.write(doctor.getUserId());
            bw.newLine();
            bw.write(doctor.getName());
            bw.newLine();
            bw.write(doctor.getIcOrPassportNumber());
            bw.newLine();
            bw.write(doctor.getEmail());
            bw.newLine();
            bw.write(doctor.getUserRole());
            bw.newLine();
            bw.write(doctor.getPassword());
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Failed to save registration. Please try again.", "Register Doctor Account Failed", JOptionPane.ERROR_MESSAGE);
            System.out.println("Error occurred: " + e);
        }
        
        JOptionPane.showMessageDialog(null, "Doctor Registration successfully saved.", "Register Doctor Account Success!", JOptionPane.INFORMATION_MESSAGE);
    }

    @Override
    public String setFileName() {
        return userId;
    }
    
    @Override
    public String getFileName() {
        return "Doctor/" + userId + ".txt";
    }
    
}
