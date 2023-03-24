package Classes;

import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class LoginVerification {
    protected String userName, userPassword, userRole;

    public LoginVerification(String userName, String userPassword, String userRole) {
        this.userName = userName;
        this.userPassword = userPassword;
        this.userRole = userRole;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }
    
    public static void verifyLogin(String userName, String password, String userRole, JFrame jframe) throws SecurityException, IOException{
        ArrayList<Admin> allAdminAccounts = new ArrayList<>();
        ArrayList<Doctor> allDoctorAccounts = new ArrayList<>();

        if(userRole.equals("Admin")) {
            allAdminAccounts = Admin.getAllAdminAccounts();
            
            for(Admin adminAccount : allAdminAccounts){
                if(userName.equals(adminAccount.getEmail()) && password.equals(adminAccount.getPassword())){
                    JOptionPane.showMessageDialog(null, "Valid Credentials", "Login Success!", JOptionPane.INFORMATION_MESSAGE);
                }else{
                    JOptionPane.showMessageDialog(null, "Invalid Credentials", "Login Failed!", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else {
            allDoctorAccounts = Doctor.getAllDoctorAccounts();
            
            for(Doctor doctorAccount : allDoctorAccounts){
                if(userName.equals(doctorAccount.getEmail()) && password.equals(doctorAccount.getPassword())){
                    JOptionPane.showMessageDialog(null, "Valid Credentials", "Login Success!", JOptionPane.INFORMATION_MESSAGE);
                }else{
                    JOptionPane.showMessageDialog(null, "Invalid Credentials", "Login Failed!", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        
    }
    
}
