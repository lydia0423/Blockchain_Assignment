package DoctorGUI;

import Classes.Appointment;
import Classes.Doctor;
import HelperClass.Block;
import HelperClass.Blockchain;
import HelperClass.Hasher;
import HelperClass.KeyAccess;
import java.security.PrivateKey;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class AddMedicalRecord extends javax.swing.JFrame {

    final private static String filePath = System.getProperty("user.dir") + System.getProperty("file.separator") + "src" + System.getProperty("file.separator") + "Database";
    private String doctorId;
    private boolean reset = false;

    public AddMedicalRecord() {
        initComponents();
    }

    public AddMedicalRecord(String doctorId) {
        initComponents();
        lblDoctorId.setText(doctorId);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtICPassport = new javax.swing.JTextField();
        txtUserId = new javax.swing.JTextField();
        btnAddMedicalRecord = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDoctorNote = new javax.swing.JTextArea();
        cmbAppointmentId = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        lblDoctorId = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMedicalRecord = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));

        jLabel3.setFont(new java.awt.Font("Sitka Subheading", 1, 14)); // NOI18N
        jLabel3.setText("IC Number / Passport");

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel1.setText("Manage Medical Records");

        btnLogout.setBackground(new java.awt.Color(102, 153, 255));
        btnLogout.setFont(new java.awt.Font("Segoe UI Semibold", 2, 14)); // NOI18N
        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Sitka Subheading", 1, 14)); // NOI18N
        jLabel2.setText("Full Name");

        jLabel11.setFont(new java.awt.Font("Sitka Subheading", 1, 14)); // NOI18N
        jLabel11.setText("Doctor's Note");

        jLabel9.setFont(new java.awt.Font("Sitka Subheading", 1, 14)); // NOI18N
        jLabel9.setText("NFC bar-code");

        jLabel10.setFont(new java.awt.Font("Sitka Subheading", 1, 14)); // NOI18N
        jLabel10.setText("History Medical Record");

        txtName.setBackground(new java.awt.Color(153, 153, 153));
        txtName.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        txtICPassport.setBackground(new java.awt.Color(153, 153, 153));
        txtICPassport.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txtICPassport.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        txtUserId.setEditable(false);
        txtUserId.setBackground(new java.awt.Color(153, 153, 153));
        txtUserId.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        btnAddMedicalRecord.setBackground(new java.awt.Color(102, 153, 255));
        btnAddMedicalRecord.setFont(new java.awt.Font("Segoe UI Semibold", 2, 14)); // NOI18N
        btnAddMedicalRecord.setText("Add Medical Record");
        btnAddMedicalRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddMedicalRecordActionPerformed(evt);
            }
        });

        txtDoctorNote.setColumns(20);
        txtDoctorNote.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txtDoctorNote.setRows(5);
        jScrollPane2.setViewportView(txtDoctorNote);

        cmbAppointmentId.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        cmbAppointmentId.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbAppointmentIdItemStateChanged(evt);
            }
        });
        cmbAppointmentId.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                cmbAppointmentIdPopupMenuWillBecomeVisible(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Sitka Subheading", 1, 14)); // NOI18N
        jLabel5.setText("Appointment ID");

        lblDoctorId.setForeground(new java.awt.Color(255, 255, 255));
        lblDoctorId.setText("jLabel4");

        txtMedicalRecord.setBackground(new java.awt.Color(153, 153, 153));
        txtMedicalRecord.setColumns(20);
        txtMedicalRecord.setRows(5);
        jScrollPane1.setViewportView(txtMedicalRecord);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(157, 157, 157)
                .addComponent(btnLogout)
                .addGap(29, 29, 29))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addComponent(cmbAppointmentId, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtUserId, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtICPassport, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtName, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel2)
                                                .addComponent(jLabel3))
                                            .addGap(53, 53, 53)))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(lblDoctorId)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
                            .addComponent(btnAddMedicalRecord, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1))))
                .addGap(63, 63, 63))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnLogout)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbAppointmentId, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtICPassport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUserId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(120, 120, 120)
                        .addComponent(lblDoctorId)
                        .addGap(40, 40, 40))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAddMedicalRecord)
                        .addGap(58, 58, 58))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddMedicalRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddMedicalRecordActionPerformed
        try {
            String appointmentId = null, patientId = null, name = null, icOrPassportNumber = null, 
                    appointmentDate = null, appointmentTime = null, doctorName = null, appointmentStatus = null;
            String userId, doctorNote;
            userId = txtUserId.getText();
            doctorNote = txtDoctorNote.getText();
            
            // update appointment status       
            ArrayList<Appointment> allAppointments = new ArrayList<>();
            allAppointments = Appointment.getAllAppointments();
            for(Appointment appointment : allAppointments) {
                if(cmbAppointmentId.getSelectedItem().toString().equals(appointment.getAppointmentId())){
                    appointmentId = appointment.getAppointmentId();
                    patientId = appointment.getUserId();
                    name = appointment.getName();
                    icOrPassportNumber = appointment.getIcOrPassportNumber();
                    appointmentDate = appointment.getAppointmentDate();
                    appointmentTime = appointment.getAppointmentTime();
                    doctorName = appointment.getDoctorName();
                    appointmentStatus = "Completed";
                }
            }
            Appointment appointment = new Appointment(appointmentId, patientId, name, icOrPassportNumber, appointmentDate, appointmentTime, doctorName, appointmentStatus);
            Appointment.saveAppointment(appointment);
            
            // save into blockchain
            String priFilePath = filePath + "/KeyPair/Doctor/PrivateKey/" + lblDoctorId.getText();
            PrivateKey doctorPrivateKey = KeyAccess.getPrivateKey(priFilePath);
            Doctor.saveMedicalRecordIntoBlockchain(userId, doctorNote, doctorName, doctorPrivateKey);
            
            
        } catch (Exception ex) {
            Logger.getLogger(AddMedicalRecord.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAddMedicalRecordActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        int dialog = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit this application?", "Exit System", JOptionPane.YES_NO_OPTION);
        if (dialog == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void cmbAppointmentIdItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbAppointmentIdItemStateChanged
        if (reset == false) {
            ArrayList<Appointment> allAppointments = new ArrayList<>();
            String selectedAppointmentId = cmbAppointmentId.getSelectedItem().toString();

            // retrieve all the doctor files
            allAppointments = Appointment.getAllAppointments();
            for (Appointment appointment : allAppointments) {
                if (appointment.getAppointmentId().equals(selectedAppointmentId)) {
                    txtName.setText(appointment.getName());
                    txtICPassport.setText(appointment.getIcOrPassportNumber());
                    txtUserId.setText(appointment.getUserId());
                }
            }
            
            Blockchain bc = Blockchain.getInstance(filePath + "/master/chain.bin");
            for(Block block : bc.get()){
                if(Hasher.sha256(txtUserId.getText()).equals(block.blockHeader.getUserIdHash())) {
                    String pastMedicalRecord = block.tranxList.toString();
                    String data = pastMedicalRecord.split("\\[")[2].split("\\|")[0];

                    if(!data.equals("Create new patient account")){
                        txtMedicalRecord.setText(data);
                    }
                }
            }
        }
        reset = true;
    }//GEN-LAST:event_cmbAppointmentIdItemStateChanged

    private void cmbAppointmentIdPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cmbAppointmentIdPopupMenuWillBecomeVisible
        LocalDate currentDate = LocalDate.now();
        ArrayList<Appointment> allAppointments = new ArrayList<>();
        ArrayList<String> appointmentList = new ArrayList<>();
        Collection<String> availableAppointment;

        // retrieve all the doctor files
        allAppointments = Appointment.getAllAppointments();
        for (Appointment appointment : allAppointments) {
            // add all doctor accounts into array list
            if (appointment.getAppointmentDate().equals(currentDate.toString()) && appointment.getAppointmentStatus().equals("Booked")) {
                appointmentList.add(appointment.getAppointmentId());
            }
        }

        availableAppointment = appointmentList;

        // add doctor name list into combo box
        DefaultComboBoxModel<String> appointmentSelector = new DefaultComboBoxModel();
        appointmentSelector.addAll(availableAppointment);
        cmbAppointmentId.setModel(appointmentSelector);
    }//GEN-LAST:event_cmbAppointmentIdPopupMenuWillBecomeVisible

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
            java.util.logging.Logger.getLogger(AddMedicalRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddMedicalRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddMedicalRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddMedicalRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddMedicalRecord().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddMedicalRecord;
    private javax.swing.JButton btnLogout;
    private javax.swing.JComboBox<String> cmbAppointmentId;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblDoctorId;
    private javax.swing.JTextArea txtDoctorNote;
    private javax.swing.JTextField txtICPassport;
    private javax.swing.JTextArea txtMedicalRecord;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtUserId;
    // End of variables declaration//GEN-END:variables
}
