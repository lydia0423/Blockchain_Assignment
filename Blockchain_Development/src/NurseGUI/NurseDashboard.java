package NurseGUI;

import Classes.Admin;
import Classes.Appointment;
import Classes.Doctor;
import Classes.Patient;
import com.github.lgooddatepicker.components.DatePicker;
import com.github.lgooddatepicker.components.DatePickerSettings;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class NurseDashboard extends javax.swing.JFrame {
    public NurseDashboard() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnLogout = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnRegisterNewPatient = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnBookAppointment = new javax.swing.JButton();
        txtUserId = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtICPassport = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        cmbDoctorName = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        DatePickerSettings dateSettings = new DatePickerSettings();
        dpAppointmentDate = new DatePicker(dateSettings); dateSettings.setDateRangeLimits(LocalDate.now(), LocalDate.now().plusMonths(12));
        cmbAppointmentTime = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(700, 400));

        btnLogout.setText("Logout");
        btnLogout.setBackground(new java.awt.Color(102, 153, 255));
        btnLogout.setFont(new java.awt.Font("Segoe UI Semibold", 2, 14)); // NOI18N
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        jLabel2.setText("NFC bar-code");
        jLabel2.setFont(new java.awt.Font("Sitka Subheading", 1, 14)); // NOI18N

        jLabel5.setText("Date");
        jLabel5.setFont(new java.awt.Font("Sitka Subheading", 1, 14)); // NOI18N

        btnRegisterNewPatient.setText("Sign Up New Patient Account");
        btnRegisterNewPatient.setBackground(new java.awt.Color(102, 153, 255));
        btnRegisterNewPatient.setFont(new java.awt.Font("Segoe UI Semibold", 2, 14)); // NOI18N
        btnRegisterNewPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterNewPatientActionPerformed(evt);
            }
        });

        jLabel1.setText("Nurse (Admin Dashboard)");
        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N

        jLabel4.setText("IC Number / Passport");
        jLabel4.setFont(new java.awt.Font("Sitka Subheading", 1, 14)); // NOI18N

        jLabel3.setText("Full Name");
        jLabel3.setFont(new java.awt.Font("Sitka Subheading", 1, 14)); // NOI18N

        btnBookAppointment.setText("Book Appointment");
        btnBookAppointment.setBackground(new java.awt.Color(102, 153, 255));
        btnBookAppointment.setFont(new java.awt.Font("Segoe UI Semibold", 2, 14)); // NOI18N
        btnBookAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookAppointmentActionPerformed(evt);
            }
        });

        txtUserId.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txtUserId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUserIdKeyReleased(evt);
            }
        });

        jLabel6.setText("Doctor's Name");
        jLabel6.setFont(new java.awt.Font("Sitka Subheading", 1, 14)); // NOI18N

        txtICPassport.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txtICPassport.setBackground(new java.awt.Color(153, 153, 153));

        txtName.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txtName.setBackground(new java.awt.Color(153, 153, 153));

        cmbDoctorName.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        cmbDoctorName.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                cmbDoctorNamePopupMenuWillBecomeVisible(evt);
            }
        });

        jLabel7.setText("Time");
        jLabel7.setFont(new java.awt.Font("Sitka Subheading", 1, 14)); // NOI18N

        dpAppointmentDate.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        cmbAppointmentTime.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Time--", "7.00", "7.15", "7.30", "7.45", "8.00", "8.15", "8.30", "8.45", "9.00", "9.15", "9.30", "9.45", "10.00", "10.15", "10.30", "10.45", "11.00" }));
        cmbAppointmentTime.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(txtUserId)
                    .addComponent(txtName)
                    .addComponent(txtICPassport, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7)
                    .addComponent(jLabel5)
                    .addComponent(cmbDoctorName, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(dpAppointmentDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbAppointmentTime, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(159, 159, 159))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(254, 254, 254)
                .addComponent(btnBookAppointment)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(btnRegisterNewPatient)
                .addGap(35, 35, 35))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(193, 193, 193)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap(597, Short.MAX_VALUE)
                    .addComponent(btnLogout)
                    .addGap(30, 30, 30)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUserId, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dpAppointmentDate, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(1, 1, 1)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(jLabel4)
                        .addGap(12, 12, 12)
                        .addComponent(txtICPassport, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmbAppointmentTime, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbDoctorName, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBookAppointment, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegisterNewPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(15, 15, 15)
                    .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(354, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBookAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookAppointmentActionPerformed
        String appointmentId, userId, name, icOrPassportNumber, appointmentDateString, appointmentTime, doctorName;
        LocalDate appointmentDate;
        
        appointmentId = Appointment.generateAppointmentId();        
        userId = txtUserId.getText();
        name = txtName.getText();
        icOrPassportNumber = txtICPassport.getText();
        appointmentDate = dpAppointmentDate.getDate();
        appointmentTime = cmbAppointmentTime.getSelectedItem().toString();
        doctorName = cmbDoctorName.getSelectedItem().toString();
        
        if (userId.isEmpty() || name.isEmpty() || icOrPassportNumber.isEmpty() || appointmentDate == null || doctorName.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please ensure that all fields have been filled in", "Invalid Data Entered", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        appointmentDateString = appointmentDate.format(DateTimeFormatter.ISO_DATE);
        
        Appointment appointment = new Appointment(appointmentId, userId, name, icOrPassportNumber, appointmentDateString, appointmentTime, doctorName);
        Appointment.saveAppointment(appointment);
        
        int n = JOptionPane.showConfirmDialog(null, "Appointment has been saved. Add another appointment?", "Appointment created", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        
        if (n == JOptionPane.YES_NO_OPTION) {
            // if yes, reset the form
            txtName.setText("");
            txtICPassport.setText("");
            dpAppointmentDate.setDateToToday();
            cmbAppointmentTime.setSelectedIndex(-1);
            cmbDoctorName.setSelectedIndex(-1);
            txtUserId.setText(Admin.generateAdminId());
        }
    }//GEN-LAST:event_btnBookAppointmentActionPerformed

    private void btnRegisterNewPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterNewPatientActionPerformed
        new NewAccountRegistration().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnRegisterNewPatientActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        int dialog = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit this application?", "Exit System", JOptionPane.YES_NO_OPTION);
        if (dialog == JOptionPane.YES_OPTION) {
            System.exit(0);            
        }
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void cmbDoctorNamePopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cmbDoctorNamePopupMenuWillBecomeVisible
        ArrayList<Doctor> allDoctors = new ArrayList<>();
        ArrayList<String> doctorList = new ArrayList<>();
        Collection<String> availableDoctor;

        // retrieve all the doctor files
        allDoctors = Doctor.getAllDoctorAccounts();
        for (Doctor doctor : allDoctors) {
            // add all doctor accounts into array list
            doctorList.add(doctor.getName());
        }
        
        availableDoctor = doctorList;

        // add doctor name list into combo box
        DefaultComboBoxModel<String> doctorSelector = new DefaultComboBoxModel();
        doctorSelector.addAll(availableDoctor);
        cmbDoctorName.setModel(doctorSelector);
    }//GEN-LAST:event_cmbDoctorNamePopupMenuWillBecomeVisible

    private void txtUserIdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserIdKeyReleased
        ArrayList<Patient> allPatients = new ArrayList<>();
        for(Patient patient : allPatients) {
            if(txtUserId.getText() == patient.getUserId()) {
                txtName.setText(patient.getName());
                txtICPassport.setText(patient.getIcOrPassportNumber());
            }
        }
    }//GEN-LAST:event_txtUserIdKeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NurseDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NurseDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NurseDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NurseDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NurseDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBookAppointment;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnRegisterNewPatient;
    private javax.swing.JComboBox<String> cmbAppointmentTime;
    private javax.swing.JComboBox<String> cmbDoctorName;
    private com.github.lgooddatepicker.components.DatePicker dpAppointmentDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtICPassport;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtUserId;
    // End of variables declaration//GEN-END:variables
}
