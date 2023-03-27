package Classes;

import DoctorGUI.AddMedicalRecord;
import DoctorGUI.DoctorDashboard;
import HelperClass.Asymmetric;
import HelperClass.KeyAccess;
import NurseGUI.NurseDashboard;
import java.io.IOException;
import java.security.PrivateKey;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class LoginVerification {
    final private static String filePath = System.getProperty("user.dir") + System.getProperty("file.separator") + "src" + System.getProperty("file.separator") + "Database";
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
    
    public static void verifyLogin(String userName, String password, String userRole, JFrame jframe) throws SecurityException, IOException, Exception{
        ArrayList<Admin> allAdminAccounts = new ArrayList<>();
        ArrayList<Doctor> allDoctorAccounts = new ArrayList<>();

        if(userRole.equals("Admin")) {
            allAdminAccounts = Admin.getAllAdminAccounts();
            
            for(Admin adminAccount : allAdminAccounts){
                if(userName.equals(adminAccount.getEmail()) && password.equals(authenticatePassword("Admin", adminAccount.getUserId(), adminAccount.getPassword()))){
                    JOptionPane.showMessageDialog(null, "Valid Credentials", "Login Success!", JOptionPane.INFORMATION_MESSAGE);
                    new NurseDashboard().setVisible(true);
                    jframe.dispose();
                }else{
                    JOptionPane.showMessageDialog(null, "Invalid Credentials", "Login Failed!", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else {
            allDoctorAccounts = Doctor.getAllDoctorAccounts();
            
            for(Doctor doctorAccount : allDoctorAccounts){
                if(userName.equals(doctorAccount.getEmail()) && password.equals(authenticatePassword("Doctor", doctorAccount.getUserId(), doctorAccount.getPassword()))){
                    JOptionPane.showMessageDialog(null, "Valid Credentials", "Login Success!", JOptionPane.INFORMATION_MESSAGE);
                    new AddMedicalRecord().setVisible(true);
                    jframe.dispose();
                }else{
                    JOptionPane.showMessageDialog(null, "Invalid Credentials", "Login Failed!", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        
    }
    
    public static String authenticatePassword(String userRole, String userId, String password) throws Exception {
       String priFilePath = filePath + "/KeyPair/" + userRole + "/PrivateKey/" + userId;
        
        Asymmetric asymm = new Asymmetric();
        
        PrivateKey priKey = KeyAccess.getPrivateKey(priFilePath);
        String decrypted = asymm.privateKey(password, priKey);
        return decrypted;
    }
    
}
