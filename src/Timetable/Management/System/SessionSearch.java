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
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author swpas
 */
public class SessionSearch extends javax.swing.JFrame {

    /**
     * Creates new form SessionSearch
     */
    public SessionSearch() {
        initComponents();
        table_update();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        lecLabel = new javax.swing.JLabel();
        subcodeLabel = new javax.swing.JLabel();
        tagLabel = new javax.swing.JLabel();
        groupLabel = new javax.swing.JLabel();
        stdHourLabel = new javax.swing.JLabel();
        REsetBtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        catSelect = new javax.swing.JComboBox<>();
        catSetSelect = new javax.swing.JLabel();
        setSelect = new javax.swing.JComboBox<>();
        search = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Time Table Management System");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/searchsession.jpg"))); // NOI18N

        jTable1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Session ID", "Subject", "Subject Code", "Lecturers", "Tag", "Group ID", "Hours", "Student Count"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Session Preview ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(0, 204, 102));

        lecLabel.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N

        subcodeLabel.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N

        tagLabel.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N

        groupLabel.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N

        stdHourLabel.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lecLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(subcodeLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tagLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(groupLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stdHourLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lecLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(subcodeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tagLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(groupLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(stdHourLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        REsetBtn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        REsetBtn.setText("Reset");
        REsetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REsetBtnActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setText("Show Details");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton2.setText("Delete Session");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton3.setText("Close");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Select Search Category :");

        catSelect.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        catSelect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lecturers", "Group", "Tag", "Subject" }));
        catSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                catSelectActionPerformed(evt);
            }
        });

        catSetSelect.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        catSetSelect.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        catSetSelect.setText("Lecturer :");

        setSelect.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        search.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton4.setText("Show All");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 10, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(jButton2)
                        .addGap(50, 50, 50)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 865, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(catSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(catSetSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(setSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(REsetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(catSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(catSetSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(setSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(REsetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

        Connection con;
        PreparedStatement show;
        
        private void table_update(){
            
            int c;
                    
             try {
            
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost/timetablems","root","1234");

                show = con.prepareStatement("select * from session");
                ResultSet rs = show.executeQuery();
                ResultSetMetaData Rss = rs.getMetaData();
                c=Rss.getColumnCount();
                
                DefaultTableModel Df = (DefaultTableModel)jTable1.getModel();
                Df.setRowCount(0);
                
                while(rs.next()){
                    Vector v = new Vector();
                    
                    for(int a=1;a<=c;a++){
                        v.add(rs.getString("id"));
                        v.add(rs.getString("subject"));  
                        v.add(rs.getString("subcode")); 
                        v.add(rs.getString("lecturers"));
                        v.add(rs.getString("tags"));
                        v.add(rs.getString("groups"));    
                        v.add(rs.getString("hours"));
                        v.add(rs.getString("stdcount"));                     
                    }
                    
                    Df.addRow(v);
                }

            } catch (ClassNotFoundException ex) {
                Logger.getLogger(subjectlist.class.getName()).log(Level.SEVERE, null, ex);
            }catch (SQLException ex) {
                Logger.getLogger(subjectlist.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
           
    //get selection details        
        private void selection(){
             try { 
             Class.forName("com.mysql.jdbc.Driver");

             Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/timetablems","root","1234");

             Statement statement = connection.createStatement();
             String query = "SELECT lecturers,subject,groups,tags FROM session";
             ResultSet rs = statement.executeQuery(query);
             
             String getSelect = (String)catSelect.getSelectedItem();
             
             if("Lecturers".equals(getSelect)){
                 catSetSelect.setText("Lecturers");
                 while (rs.next())
                {
                   setSelect.addItem(rs.getString("lecturers"));
                }
             }else if("Group".equals(getSelect)){
                 catSetSelect.setText("Group");
                 while (rs.next())
                {
                   setSelect.addItem(rs.getString("groups"));
                }
             }else if("Tag".equals(getSelect)){
                 catSetSelect.setText("Tag");
                  setSelect.addItem("Lecture");
                  setSelect.addItem("Lab");
                  setSelect.addItem("Tute");
                
             }else if("Subject".equals(getSelect)){
                 catSetSelect.setText("Subject");
                 while (rs.next())
                {
                   setSelect.addItem(rs.getString("subject"));
                }
             }else{
                 //nothing
             }
             //end while
             connection.close();
             } catch (Exception e) {
                  e.printStackTrace();
             }
        }
        
    private void REsetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REsetBtnActionPerformed
        // TODO add your handling code here:
        lecLabel.setText("");
        subcodeLabel.setText("");
        tagLabel.setText("");
        groupLabel.setText("");
        stdHourLabel.setText("");
    }//GEN-LAST:event_REsetBtnActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int column = 0;
        int row = jTable1.getSelectedRow();
        String value = jTable1.getModel().getValueAt(row, column).toString();
        
        Connection con;
        PreparedStatement delete;
        

        try {
            
            int dialogres = JOptionPane.showConfirmDialog(null, "Do you want to remove Session?","Warning",JOptionPane.YES_NO_OPTION);
            if(dialogres == JOptionPane.YES_OPTION){
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost/timetablems","root","1234");

                delete = con.prepareStatement("delete from session where id= '"+value+"'");
                delete.executeUpdate();

                JOptionPane.showMessageDialog(this, "Session (ID: "+ value +") deleted successfully!");

                table_update();           
            }
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(AddLecturer.class.getName()).log(Level.SEVERE, null, ex);
        }catch(Exception e){
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int column = 0;
        int row = jTable1.getSelectedRow();
        String value = jTable1.getModel().getValueAt(row, column).toString();
        
        Connection con;
        PreparedStatement show;
        
        try {
            
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost/timetablems","root","1234");

                show = con.prepareStatement("select * from session where id= '"+value+"'");
                ResultSet rs = show.executeQuery();
                               
                while (rs.next())
                {      
                    lecLabel.setText(rs.getString("lecturers"));
                    subcodeLabel.setText(rs.getString("subject")+" ("+rs.getString("subcode")+")");
                    tagLabel.setText(rs.getString("tags"));
                    groupLabel.setText(rs.getString("groups"));
                    stdHourLabel.setText(rs.getString("stdcount")+" ("+ rs.getString("hours") + ")");
                }//end while        
                
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(subjectlist.class.getName()).log(Level.SEVERE, null, ex);
            }catch (SQLException ex) {
                Logger.getLogger(subjectlist.class.getName()).log(Level.SEVERE, null, ex);
            }    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        new SystemSession().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
            int c;
            
            String getSelect = (String)catSelect.getSelectedItem();
            String condition = (String)setSelect.getSelectedItem();
            String column="";
            
             if("Lecturers".equals(getSelect)){
                 column="lecturers";
             }else if("Group".equals(getSelect)){
                 column="groups";
             }else if("Tag".equals(getSelect)){
                 column="tags";
             }else if("Subject".equals(getSelect)){
                 column="subject";
             }else{
                 //nothing
             }
            
                    
             try {
            
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost/timetablems","root","1234");

                show = con.prepareStatement("select * from session where "+column+"= '"+condition+"'");
                
                ResultSet rs = show.executeQuery();
                ResultSetMetaData Rss = rs.getMetaData();
                c=Rss.getColumnCount();
                
                DefaultTableModel Df = (DefaultTableModel)jTable1.getModel();
                Df.setRowCount(0);
                
                while(rs.next()){
                    Vector v = new Vector();
                    
                    for(int a=1;a<=c;a++){
                        v.add(rs.getString("id"));
                        v.add(rs.getString("subject"));  
                        v.add(rs.getString("subcode")); 
                        v.add(rs.getString("lecturers"));
                        v.add(rs.getString("tags"));
                        v.add(rs.getString("groups"));    
                        v.add(rs.getString("hours"));
                        v.add(rs.getString("stdcount"));                     
                    }
                    
                    Df.addRow(v);
                }

            } catch (ClassNotFoundException ex) {
                Logger.getLogger(subjectlist.class.getName()).log(Level.SEVERE, null, ex);
            }catch (SQLException ex) {
                Logger.getLogger(subjectlist.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_searchActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        table_update();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void catSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_catSelectActionPerformed
        // TODO add your handling code here:
        setSelect.removeAllItems();
        selection();
        
    }//GEN-LAST:event_catSelectActionPerformed

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
            java.util.logging.Logger.getLogger(SessionSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SessionSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SessionSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SessionSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SessionSearch().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton REsetBtn;
    private javax.swing.JComboBox<String> catSelect;
    private javax.swing.JLabel catSetSelect;
    private javax.swing.JLabel groupLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lecLabel;
    private javax.swing.JButton search;
    private javax.swing.JComboBox<String> setSelect;
    private javax.swing.JLabel stdHourLabel;
    private javax.swing.JLabel subcodeLabel;
    private javax.swing.JLabel tagLabel;
    // End of variables declaration//GEN-END:variables
}
