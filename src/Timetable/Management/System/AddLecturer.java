/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Timetable.Management.System;

import static Timetable.Management.System.AddRoom.DB_URL;
import static Timetable.Management.System.DeleteBuilding.sList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author swpas
 */
public class AddLecturer extends javax.swing.JFrame {
    /**
     * Creates new form AddLecturer
     */
    public AddLecturer() throws SQLException {
        initComponents();
        currentBuildings();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lecnametxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        lecidtxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        departmenttxt = new javax.swing.JTextField();
        facultycombo = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        centercombo = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        buildingcombo = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        levelcombo = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        ranktxt = new javax.swing.JTextField();
        AddLecturer = new javax.swing.JButton();
        BackLecturer = new javax.swing.JButton();
        AddLecturer1 = new javax.swing.JButton();

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane4.setViewportView(jTextArea3);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Time Table Management System");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/addLec.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Lecturer Name : ");

        lecnametxt.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lecnametxt.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        lecnametxt.setDropMode(javax.swing.DropMode.INSERT);
        lecnametxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lecnametxtActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setText("Lecturer ID      : ");

        lecidtxt.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lecidtxt.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        lecidtxt.setDropMode(javax.swing.DropMode.INSERT);
        lecidtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lecidtxtActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setText("Faculty              : ");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setText("Building            :");

        departmenttxt.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        departmenttxt.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        departmenttxt.setDropMode(javax.swing.DropMode.INSERT);
        departmenttxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                departmenttxtActionPerformed(evt);
            }
        });

        facultycombo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        facultycombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Computing", "Engineering", "Business", "Humanities & Sciences" }));
        facultycombo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel6.setText("Center               :");

        centercombo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        centercombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Malabe", "Metro", "Matara", "Kandy", "Kurunagala", "Jaffna" }));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel7.setText("Department      :");

        buildingcombo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel8.setText("Level                 :");

        levelcombo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        levelcombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1-Professor", "2-Assistant Professor", "3-Senior Lecturer(HG)", "4-Senior Lecturer", "5-Lecturer", "6-Assistant Lecturer", "7-Instructors" }));
        levelcombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                levelcomboActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel9.setText("Rank                 :");

        ranktxt.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        AddLecturer.setBackground(new java.awt.Color(204, 204, 204));
        AddLecturer.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        AddLecturer.setText("Submit");
        AddLecturer.setMaximumSize(new java.awt.Dimension(63, 29));
        AddLecturer.setMinimumSize(new java.awt.Dimension(63, 29));
        AddLecturer.setPreferredSize(new java.awt.Dimension(63, 29));
        AddLecturer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddLecturerActionPerformed(evt);
            }
        });

        BackLecturer.setBackground(new java.awt.Color(204, 204, 204));
        BackLecturer.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        BackLecturer.setText("Back");
        BackLecturer.setMaximumSize(new java.awt.Dimension(63, 29));
        BackLecturer.setMinimumSize(new java.awt.Dimension(63, 29));
        BackLecturer.setPreferredSize(new java.awt.Dimension(63, 29));
        BackLecturer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackLecturerActionPerformed(evt);
            }
        });

        AddLecturer1.setBackground(new java.awt.Color(204, 204, 204));
        AddLecturer1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        AddLecturer1.setText("Lecturer List");
        AddLecturer1.setMaximumSize(new java.awt.Dimension(63, 29));
        AddLecturer1.setMinimumSize(new java.awt.Dimension(63, 29));
        AddLecturer1.setPreferredSize(new java.awt.Dimension(63, 29));
        AddLecturer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddLecturer1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1400, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(336, 336, 336)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6)
                                .addComponent(jLabel7)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lecnametxt, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lecidtxt, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(departmenttxt)
                            .addComponent(centercombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buildingcombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(facultycombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(levelcombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ranktxt, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(429, 429, 429)
                        .addComponent(AddLecturer, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(AddLecturer1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(BackLecturer, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lecnametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lecidtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(facultycombo, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(departmenttxt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(centercombo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buildingcombo)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(levelcombo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ranktxt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddLecturer, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BackLecturer, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddLecturer1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    //create connection    
    Connection con;
    PreparedStatement insert;
    
    private Connection DoConnect() throws SQLException{
        Connection conn=null;
        try{
            Class.forName("com.mysql.jdbc.Driver");   
            conn = DriverManager.getConnection(DB_URL, "root", "1234");
        }catch (ClassNotFoundException ex) {
            Logger.getLogger(AddRoom.class.getName()).log(Level.SEVERE, null, ex);
        }          
        return conn;
    }
    
    private void currentBuildings() throws SQLException{
        Connection conn = DoConnect();    
        try {            
            ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM buildings");              
            while(rs.next()){     
                sList.add(rs.getString(1));
                buildingcombo.addItem(String.format("%s | (%s)",rs.getString(2),rs.getString(3)));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(DeleteBuilding.class.getName()).log(Level.SEVERE, null, ex);
        }    
    }
    
    private void lecnametxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lecnametxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lecnametxtActionPerformed

    private void lecidtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lecidtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lecidtxtActionPerformed

    private void departmenttxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_departmenttxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_departmenttxtActionPerformed

    private void AddLecturerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddLecturerActionPerformed
        // TODO add your handling code here:
        //get form details
        String name = lecnametxt.getText();
        String id = lecidtxt.getText();
        String faculty = (String)facultycombo.getSelectedItem( );
        String department = departmenttxt.getText();
        String center = (String)centercombo.getSelectedItem();
        String building = (String)buildingcombo.getSelectedItem();
        String level = (String)levelcombo.getSelectedItem();
        String rank = ranktxt.getText();

        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/timetablems","root","1234");
            
            insert = con.prepareStatement("insert into lecturer(name,lecid,faculty,department,center,building,level,rank) values(?,?,?,?,?,?,?,?)");
            insert.setString(1, name);
            insert.setString(2, id);
            insert.setString(3, faculty);
            insert.setString(4, department);
            insert.setString(5, center);
            insert.setString(6, building);
            insert.setString(7, level);
            insert.setString(8, rank);
            
            if(name.isEmpty() || id.isEmpty() || department.isEmpty() || rank.isEmpty()){
                JOptionPane.showMessageDialog(this, "Some Required Fields are Empty!");
            }else{
                insert.executeUpdate();            
                JOptionPane.showMessageDialog(this, "Lecturer Added to the System!");
                lecnametxt.setText("");
                lecidtxt.setText("");
                departmenttxt.setText("");
                ranktxt.setText("");
                lecnametxt.requestFocus();
            }
            
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AddLecturer.class.getName()).log(Level.SEVERE, null, ex);
        }catch (SQLException ex) {
            Logger.getLogger(AddLecturer.class.getName()).log(Level.SEVERE, null, ex);
        }        
        
    }//GEN-LAST:event_AddLecturerActionPerformed

    private void BackLecturerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackLecturerActionPerformed
        // TODO add your handling code here:
        new SystemLecturer().setVisible(true);
        dispose();
    }//GEN-LAST:event_BackLecturerActionPerformed

    private void AddLecturer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddLecturer1ActionPerformed
        // TODO add your handling code here:
        new Lecturerlist().setVisible(true);
        dispose();
    }//GEN-LAST:event_AddLecturer1ActionPerformed

    private void levelcomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_levelcomboActionPerformed
        // TODO add your handling code here:
        String levelLec = (String)levelcombo.getSelectedItem();
        char rankLec = levelLec.charAt(0);
        ranktxt.setText(rankLec+"."+lecidtxt.getText());
    }//GEN-LAST:event_levelcomboActionPerformed

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
            java.util.logging.Logger.getLogger(AddLecturer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddLecturer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddLecturer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddLecturer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new AddLecturer().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(AddLecturer.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddLecturer;
    private javax.swing.JButton AddLecturer1;
    private javax.swing.JButton BackLecturer;
    private javax.swing.JComboBox<String> buildingcombo;
    private javax.swing.JComboBox<String> centercombo;
    private javax.swing.JTextField departmenttxt;
    private javax.swing.JComboBox<String> facultycombo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextField lecidtxt;
    private javax.swing.JTextField lecnametxt;
    private javax.swing.JComboBox<String> levelcombo;
    private javax.swing.JTextField ranktxt;
    // End of variables declaration//GEN-END:variables
}
