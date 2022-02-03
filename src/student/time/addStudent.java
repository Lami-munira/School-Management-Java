package student.time;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class addStudent extends javax.swing.JFrame {

    private void resetF() {
        name.setText("");
        email.setText("");
        dbirth.setText("");
        emergencyC.setText("");
        address.setText("");
        cclass.setText("");
        fatherName.setText("");
        motherName.setText("");
    }

    private boolean validateF() {
        if (name.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(addStudent.this, "Enter Name!");
            name.grabFocus();
            return false;
        }
        if (email.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(addStudent.this, "Enter Email!");
            email.grabFocus();
            return false;
        }
        if (dbirth.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(addStudent.this, "Enter Date of Birth!");
            dbirth.grabFocus();
            return false;
        }
        if (emergencyC.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(addStudent.this, "Enter Emergency Contact!");
            emergencyC.grabFocus();
            return false;
        }
        if (address.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(addStudent.this, "Enter Address!");
            address.grabFocus();
            return false;
        }
        if (cclass.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(addStudent.this, "Enter Class!");
            cclass.grabFocus();
            return false;
        }
        if (fatherName.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(addStudent.this, "Enter Father's Name!");
            fatherName.grabFocus();
            return false;
        }
        if (motherName.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(addStudent.this, "Enter Mother's Name!");
            motherName.grabFocus();
            return false;
        }
        return true;
    }

    JTextField testField = new JTextField(10);

    public addStudent() {
        this.setTitle("Add Student");
        this.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\ADN Telecom\\Desktop\\logo\\student.png"));
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        dbirth = new javax.swing.JTextField();
        cclass = new javax.swing.JTextField();
        fatherName = new javax.swing.JTextField();
        motherName = new javax.swing.JTextField();
        emergencyC = new javax.swing.JTextField();
        gender = new javax.swing.JComboBox<>();
        submit = new javax.swing.JButton();
        back = new javax.swing.JButton();
        address = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Add Student", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 700));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Name");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 46, 50, 25));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Email");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 93, 50, 30));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Date of Birth");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 140, 100, 30));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Gender");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 80, 30));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Address");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 271, 80, 30));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Class");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 348, 80, 30));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Father's Name");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 419, -1, 30));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Mother's Name");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 480, 120, 30));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Emergency Contact");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 559, 150, 30));

        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        jPanel1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 45, 150, 30));
        jPanel1.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 95, 150, 30));
        jPanel1.add(dbirth, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 142, 150, 30));
        jPanel1.add(cclass, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, 150, 30));
        jPanel1.add(fatherName, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 419, 150, 30));
        jPanel1.add(motherName, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 482, 150, 30));
        jPanel1.add(emergencyC, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 559, 150, 30));

        gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Female", "Male" }));
        gender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderActionPerformed(evt);
            }
        });
        jPanel1.add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 150, 30));

        submit.setBackground(new java.awt.Color(255, 255, 255));
        submit.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        submit.setText("Add ");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        jPanel1.add(submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 610, 80, 30));

        back.setBackground(new java.awt.Color(255, 255, 255));
        back.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 610, 80, 30));

        address.setPreferredSize(new java.awt.Dimension(150, 30));
        jPanel1.add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void genderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        if (validateF()) {
            int id_n = 0;
            String n = name.getText();
            String S = "S2021S00" + (id_n + 1);
            File f = new File("C:\\Users\\ADN Telecom\\Desktop\\Student TIme\\StudentsInfo.txt");
            try {
                if (f.createNewFile()) {
                } else {
                }
            } catch (IOException e) {
            }
            // writing in a file --> appending 
            try {
                BufferedReader b = new BufferedReader(new FileReader(f));
                Object[] tablesLines = b.lines().toArray();
                String s = "S2021S000";
                for (int i = 0; i < tablesLines.length; i++) {
                    String ln = tablesLines[i].toString().trim();
                    String[] p = ln.split("@@@@");
                    if (p.length > 1) {
                        s = p[0];
                    }
                }
                s = s.substring(6);
                int c = Integer.parseInt(s);
                id_n = c;
            } catch (IOException ex) {
            }
            try { // opening a file and want to write in it
                FileWriter x = new FileWriter(f, true);
                S = "S2021S00" + (id_n + 1);
                String s = S + "@@@@" + name.getText() + "@@@@" + email.getText() + "@@@@" + emergencyC.getText() + "@@@@" + address.getText() + "@@@@" + dbirth.getText() + "@@@@" + cclass.getText() + "@@@@" + fatherName.getText() + "@@@@" + motherName.getText() + "@@@@" + gender.getSelectedItem();
                x.write(s + "\n");
                x.close();
            } catch (Exception e) {
            }
            JOptionPane.showMessageDialog(addStudent.this, "Successfully added a new student.\n\tName- " + name.getText() + "\nID - " + S);
            resetF();
        } else {
            name.setText(name.getText());
            email.setText(email.getText());
            dbirth.setText(dbirth.getText());
            emergencyC.setText(emergencyC.getText());
            address.setText(address.getText());
            cclass.setText(cclass.getText());
            fatherName.setText(fatherName.getText());
            motherName.setText(motherName.getText());
        }

    }//GEN-LAST:event_submitActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        setVisible(false);
        homepage m = new homepage();
        m.setVisible(true);
    }//GEN-LAST:event_backActionPerformed

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
            java.util.logging.Logger.getLogger(addStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address;
    private javax.swing.JButton back;
    private javax.swing.JTextField cclass;
    private javax.swing.JTextField dbirth;
    private javax.swing.JTextField email;
    private javax.swing.JTextField emergencyC;
    private javax.swing.JTextField fatherName;
    private javax.swing.JComboBox<String> gender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField motherName;
    private javax.swing.JTextField name;
    private javax.swing.JButton submit;
    // End of variables declaration//GEN-END:variables
}
