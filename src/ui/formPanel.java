/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.JOptionPane;
import model.Patient;
import util.DatabaseConnector;

/**
 *
 * @author Akash Bahri
 */
public class formPanel extends javax.swing.JPanel {

    /**
     * Creates new form formPanel
     */
    public formPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ageLabelName = new javax.swing.JLabel();
        ageTextField = new javax.swing.JTextField();
        nameTextField = new javax.swing.JTextField();
        submitButton = new javax.swing.JButton();
        titleLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();

        ageLabelName.setFont(new java.awt.Font("Kailasa", 1, 13)); // NOI18N
        ageLabelName.setText("Age:");

        submitButton.setBackground(new java.awt.Color(102, 102, 102));
        submitButton.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 24)); // NOI18N
        submitButton.setForeground(new java.awt.Color(255, 255, 255));
        submitButton.setText("SUBMIT");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        titleLabel.setBackground(new java.awt.Color(0, 102, 204));
        titleLabel.setFont(new java.awt.Font("Kailasa", 1, 24)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("PATIENT REGISTRATION FORM");

        nameLabel.setFont(new java.awt.Font("Kailasa", 1, 13)); // NOI18N
        nameLabel.setText("Name:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(submitButton, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(99, 99, 99))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(184, 184, 184)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(nameLabel)
                                                        .addComponent(ageLabelName))
                                                .addGap(49, 49, 49)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(ageTextField,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 195,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(nameTextField,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 195,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(titleLabel))
                                .addContainerGap(200, Short.MAX_VALUE)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 76,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(nameLabel))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(ageLabelName)
                                        .addComponent(ageTextField, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(54, 54, 54)
                                .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(174, Short.MAX_VALUE)));
    }// </editor-fold>//GEN-END:initComponents

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_submitButtonActionPerformed
        // TODO add your handling code here:
        // Setting functionalities for First Name

        Patient newPatient = new Patient();

        try {
            newPatient.setAge(Integer.parseInt(ageTextField.getText()));
            newPatient.setName(nameTextField.getText());
            // insert into DB
            DatabaseConnector.addPatient(newPatient);
            JOptionPane.showMessageDialog(null, "User Registered Successfully", "Successful Registration",JOptionPane.INFORMATION_MESSAGE);
            nameTextField.setText("");
            ageTextField.setText("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }// GEN-LAST:event_submitButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ageLabelName;
    private javax.swing.JTextField ageTextField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JButton submitButton;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
