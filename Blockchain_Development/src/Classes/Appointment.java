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

public class Appointment implements FileMethods{
    private String appointmentId, userId, name, icOrPassportNumber, appointmentDate, appointmentTime, doctorName, appointmentStatus;

    public Appointment(String appointmentId, String userId, String name, String icOrPassportNumber, String appointmentDate, String appointmentTime, String doctorName, String appointmentStatus) {
        this.appointmentId = appointmentId;
        this.userId = userId;
        this.name = name;
        this.icOrPassportNumber = icOrPassportNumber;
        this.appointmentDate = appointmentDate;
        this.appointmentTime = appointmentTime;
        this.doctorName = doctorName;
        this.appointmentStatus = appointmentStatus;
    }

    public String getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(String appointmentId) {
        this.appointmentId = appointmentId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIcOrPassportNumber() {
        return icOrPassportNumber;
    }

    public void setIcOrPassportNumber(String icOrPassportNumber) {
        this.icOrPassportNumber = icOrPassportNumber;
    }
    
    public String getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(String appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public String getAppointmentTime() {
        return appointmentTime;
    }

    public void setAppointmentTime(String appointmentTime) {
        this.appointmentTime = appointmentTime;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getAppointmentStatus() {
        return appointmentStatus;
    }

    public void setAppointmentStatus(String appointmentStatus) {
        this.appointmentStatus = appointmentStatus;
    }
    
    
    
    // generate random combination of number and alphabet for appointment Id
    public static String generateAppointmentId() {
        String appointmentId = "AP" + UUID.randomUUID().toString();
        return appointmentId;
    }
    
    // retrieve all appointments
    public static ArrayList<Appointment> getAllAppointments() {
        // retrive from folder
        File appointmentFolder = FileHandler.retrievePath("Appointment", "null");
        File[] appointmentFiles = appointmentFolder.listFiles();
        ArrayList<Appointment> allAppointments = new ArrayList<>();
        for (File appointmentFile : appointmentFiles){
            try (Scanner readFile = new Scanner(appointmentFile)) {
                while(readFile.hasNext()){
                    allAppointments.add(new Appointment(
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
        
        return allAppointments;
    }
    
    // save new appointment into file
    public static void saveAppointment(Appointment appointment){
        String fileName = appointment.setFileName() + ".txt";
        
        File myFile = FileHandler.createFilePath("Appointment", fileName);
        try (FileWriter fw = new FileWriter(myFile); BufferedWriter bw = new BufferedWriter(fw);) {
            bw.write(appointment.getAppointmentId());
            bw.newLine();
            bw.write(appointment.getUserId());
            bw.newLine();
            bw.write(appointment.getName());
            bw.newLine();
            bw.write(appointment.getIcOrPassportNumber());
            bw.newLine();
            bw.write(appointment.getAppointmentDate());
            bw.newLine();
            bw.write(appointment.getAppointmentTime());   
            bw.newLine();
            bw.write(appointment.getDoctorName()); 
            bw.newLine();
            bw.write(appointment.getAppointmentStatus()); 
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Failed to save appointment. Please try again.", "Create New Appointment Failed", JOptionPane.ERROR_MESSAGE);
            System.out.println("Error occurred: " + e);
        }
        
        JOptionPane.showMessageDialog(null, "Appointment successfully saved.", "Create New Appointment Success!", JOptionPane.INFORMATION_MESSAGE);
    }
    
    // save new appointment into file
    public static void updateAppointment(Appointment appointment){
        String fileName = appointment.setFileName() + ".txt";
        
        File myFile = FileHandler.createFilePath("Appointment", fileName);
        try (FileWriter fw = new FileWriter(myFile); BufferedWriter bw = new BufferedWriter(fw);) {
            bw.write(appointment.getAppointmentId());
            bw.newLine();
            bw.write(appointment.getUserId());
            bw.newLine();
            bw.write(appointment.getName());
            bw.newLine();
            bw.write(appointment.getIcOrPassportNumber());
            bw.newLine();
            bw.write(appointment.getAppointmentDate());
            bw.newLine();
            bw.write(appointment.getAppointmentTime());   
            bw.newLine();
            bw.write(appointment.getDoctorName()); 
            bw.newLine();
            bw.write(appointment.getAppointmentStatus()); 
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Failed to update appointment. Please try again.", "Update Appointment Failed", JOptionPane.ERROR_MESSAGE);
            System.out.println("Error occurred: " + e);
        }
        
        JOptionPane.showMessageDialog(null, "Appointment successfully saved.", "Update Appointment Success!", JOptionPane.INFORMATION_MESSAGE);
    }
    

    @Override
    public String setFileName() {
        return appointmentId;
    }
    
    @Override
    public String getFileName() {
        return "Appointment/" + appointmentId + ".txt";
    }
    
}
