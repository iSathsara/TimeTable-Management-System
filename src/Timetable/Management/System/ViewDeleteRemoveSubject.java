/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Timetable.Management.System;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author swpas
 */
public class ViewDeleteRemoveSubject extends javax.swing.JFrame {

    /**
     * Creates new form ViewDeleteRemoveSubject
     */
    public ViewDeleteRemoveSubject() {
        initComponents();
        getSubidCombo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        eval = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        selectidcombo = new javax.swing.JComboBox<>();
        removeSubBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        BackSubject = new javax.swing.JButton();
        year = new javax.swing.JTextField();
        sem = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        lec = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        lab = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tute = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        submitID = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Time Table Management System");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel8.setText("Lab Hours         :");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/viewSubject.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");

        eval.setEditable(false);
        eval.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 255));
        jLabel3.setText("Select Subject Code :");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel9.setText("Eval. Hours       :");

        removeSubBtn.setBackground(new java.awt.Color(204, 204, 204));
        removeSubBtn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        removeSubBtn.setText("Remove");
        removeSubBtn.setMaximumSize(new java.awt.Dimension(63, 29));
        removeSubBtn.setMinimumSize(new java.awt.Dimension(63, 29));
        removeSubBtn.setPreferredSize(new java.awt.Dimension(63, 29));
        removeSubBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeSubBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Offered Year      :");

        BackSubject.setBackground(new java.awt.Color(204, 204, 204));
        BackSubject.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        BackSubject.setText("Back");
        BackSubject.setMaximumSize(new java.awt.Dimension(63, 29));
        BackSubject.setMinimumSize(new java.awt.Dimension(63, 29));
        BackSubject.setPreferredSize(new java.awt.Dimension(63, 29));
        BackSubject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackSubjectActionPerformed(evt);
            }
        });

        year.setEditable(false);
        year.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        year.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        year.setDropMode(javax.swing.DropMode.INSERT);
        year.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearActionPerformed(evt);
            }
        });

        sem.setEditable(false);
        sem.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        sem.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        sem.setDropMode(javax.swing.DropMode.INSERT);
        sem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                semActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setText("Offered Sem       :");

        lec.setEditable(false);
        lec.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lec.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        lec.setDropMode(javax.swing.DropMode.INSERT);
        lec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lecActionPerformed(evt);
            }
        });

        name.setEditable(false);
        name.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        name.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        name.setDropMode(javax.swing.DropMode.INSERT);
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });

        lab.setEditable(false);
        lab.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lab.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        lab.setDropMode(javax.swing.DropMode.INSERT);
        lab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                labActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel7.setText("Subject Name    :");

        tute.setEditable(false);
        tute.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        tute.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tute.setDropMode(javax.swing.DropMode.INSERT);
        tute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tuteActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel6.setText("Lecture Hour    :");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setText("Tute Hours        :");

        submitID.setBackground(new java.awt.Color(204, 204, 204));
        submitID.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        submitID.setText("submit");
        submitID.setMaximumSize(new java.awt.Dimension(63, 29));
        submitID.setMinimumSize(new java.awt.Dimension(63, 29));
        submitID.setPreferredSize(new java.awt.Dimension(63, 29));
        submitID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitIDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1400, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(370, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addComponent(jLabel7)
                        .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(removeSubBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(BackSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(name)
                        .addComponent(eval)
                        .addComponent(year)
                        .addComponent(sem)
                        .addComponent(lec)
                        .addComponent(lab)
                        .addComponent(tute, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(343, 343, 343))
            .addGroup(layout.createSequentialGroup()
                .addGap(450, 450, 450)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(selectidcombo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(submitID, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectidcombo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(submitID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(sem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tute, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(lab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(eval, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(removeSubBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BackSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    Connection con;
    PreparedStatement show;
    
    //get id list to combo
    private void getSubidCombo(){
        try { 
             Class.forName("com.mysql.jdbc.Driver");

             Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/timetablems","root","1234");

             Statement statement = connection.createStatement();
             String query = "SELECT code FROM subject";
             ResultSet rs = statement.executeQuery(query);

             while (rs.next())
             {      
                String lid = rs.getString("code");         
                selectidcombo.addItem(rs.getString("code"));
             }//end while
             connection.close();
             } catch (Exception e) {
                  e.printStackTrace();
             }
    }
    
    private void removeSubBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeSubBtnActionPerformed
        // TODO add your handling code here:
       Connection con;
        PreparedStatement delete;
        
        String selectedIDs = (String)selectidcombo.getSelectedItem();
        

        try {
            
            int dialogres = JOptionPane.showConfirmDialog(null, "Do you want to remove "+selectedIDs+ " from the System?","Warning",JOptionPane.YES_NO_OPTION);
            if(dialogres == JOptionPane.YES_OPTION){
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/timetablems","root","1234");
            
            delete = con.prepareStatement("delete from subject where code= '"+selectedIDs+"'");
            delete.executeUpdate();
            
            JOptionPane.showMessageDialog(this, "Subject "+ selectedIDs +" deleted successfully!");

            new subjectlist().setVisible(true);
            dispose();
            
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AddLecturer.class.getName()).log(Level.SEVERE, null, ex);
        }catch (SQLException ex) {
            Logger.getLogger(AddLecturer.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_removeSubBtnActionPerformed

    private void BackSubjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackSubjectActionPerformed
        // TODO add your handling code here:
        new SystemSubject().setVisible(true);
        dispose();
    }//GEN-LAST:event_BackSubjectActionPerformed

    private void yearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yearActionPerformed

    private void semActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_semActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_semActionPerformed

    private void lecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lecActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lecActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void labActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_labActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_labActionPerformed

    private void tuteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tuteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tuteActionPerformed

    private void submitIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitIDActionPerformed
        // TODO add your handling code here:
        
        String selectedID = (String)selectidcombo.getSelectedItem();
               
             try {
            
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost/timetablems","root","1234");

                show = con.prepareStatement("select * from subject where code = '"+ selectedID+"'");
                ResultSet rs = show.executeQuery();
                               
                while (rs.next())
                {      
                   year.setText(rs.getString("year"));
                   sem.setText(rs.getString("semester"));
                   name.setText(rs.getString("name"));
                   lec.setText(rs.getString("lec"));
                   tute.setText(rs.getString("tute"));
                   lab.setText(rs.getString("lab"));
                   eval.setText(rs.getString("eval"));
                }//end while        
                
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(subjectlist.class.getName()).log(Level.SEVERE, null, ex);
            }catch (SQLException ex) {
                Logger.getLogger(subjectlist.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_submitIDActionPerformed

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
            java.util.logging.Logger.getLogger(ViewDeleteRemoveSubject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewDeleteRemoveSubject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewDeleteRemoveSubject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewDeleteRemoveSubject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewDeleteRemoveSubject().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackSubject;
    private javax.swing.JTextField eval;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField lab;
    private javax.swing.JTextField lec;
    private javax.swing.JTextField name;
    private javax.swing.JButton removeSubBtn;
    private javax.swing.JComboBox<String> selectidcombo;
    private javax.swing.JTextField sem;
    private javax.swing.JButton submitID;
    private javax.swing.JTextField tute;
    private javax.swing.JTextField year;
    // End of variables declaration//GEN-END:variables
}
