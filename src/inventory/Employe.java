/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaa;

import static java.lang.Character.UnicodeBlock.forName;
import static java.lang.Class.forName;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Hashini Lenox
 */
public class Employe extends javax.swing.JFrame {

  private static final String usename="root";
  private static final String Password="";
  private static final String dataConn="jdbc:mysql://localhost:3306/java";
   Connection sqlConn=null;
   PreparedStatement pst=null;  
   ResultSet rs=null;
   int q,i,id,deleteItem;
    public Employe() {
        initComponents();
         populateSupplierComboBox();
        upDateDB();
    }

  
    public void upDateDB(){
       try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/java";
            java.sql.Connection conn = DriverManager.getConnection(url, "root", "");
            sqlConn = DriverManager.getConnection(dataConn, usename, Password);
            pst = sqlConn.prepareStatement("select * from product");

            rs = pst.executeQuery();
            ResultSetMetaData stData = rs.getMetaData();
            q = stData.getColumnCount();
            DefaultTableModel RecordTable = (DefaultTableModel) jTable2.getModel();
            RecordTable.setRowCount(0);
            while (rs.next()) {
                Vector columnData = new Vector();
                for (i = 1; i <= q; i++) {
                    columnData.add(rs.getInt("ProductID"));
                    columnData.add(rs.getString("ProductName"));
                    columnData.add(rs.getInt("Quntity"));
                    columnData.add(rs.getString("ProductCatgory"));
                    columnData.add(rs.getBigDecimal("Price"));
                    columnData.add(rs.getString("suppliername"));

                }
                RecordTable.addRow(columnData);
            }
        } catch (Exception ex) {
            JOptionPane.showConfirmDialog(null, ex);
        }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        add = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        dele = new javax.swing.JButton();
        res = new javax.swing.JButton();
        lg = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        usen = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        psw = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        nam1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        usen22 = new javax.swing.JTextField();
        nm = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        gg = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setText("Employee Dashboard");

        add.setText("ADD Product");
        add.setEnabled(false);
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        edit.setText("UPDATE");
        edit.setActionCommand("UPDATE USER");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });

        dele.setText("DELETE");
        dele.setEnabled(false);
        dele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleActionPerformed(evt);
            }
        });

        res.setText("RESET");
        res.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resActionPerformed(evt);
            }
        });

        lg.setForeground(new java.awt.Color(255, 51, 51));
        lg.setText("LOGOUT");
        lg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lgActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Product ID");

        usen.setEnabled(false);
        usen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usenActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Quntity");

        psw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pswActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Price");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Product Catgory");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product ID", "Product Name", "Quntity", "Product Catgory", "Price", "Supplier Name"
            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        nam1.setEnabled(false);
        nam1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nam1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Product Name");

        usen22.setEnabled(false);
        usen22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usen22ActionPerformed(evt);
            }
        });

        nm.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Home & Garden", "Clothing", "Food", "Electronic" }));
        nm.setEnabled(false);
        nm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nmActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Supplier Name");

        gg.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lg, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(56, 56, 56)
                                        .addComponent(usen22, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel7))
                                        .addGap(34, 34, 34)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(gg, 0, 312, Short.MAX_VALUE)
                                            .addComponent(psw))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel6)
                                            .addGap(32, 32, 32))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel5)
                                            .addGap(19, 19, 19)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(nam1)
                                    .addComponent(usen)
                                    .addComponent(nm, 0, 255, Short.MAX_VALUE))
                                .addGap(42, 42, 42))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(104, 104, 104)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(edit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(add, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(res, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dele, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(usen22, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(usen, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(psw, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(nam1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jLabel7))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(gg, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)
                                    .addComponent(nm, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8))
                            .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(edit, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(res, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dele, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lg, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
private void populateSupplierComboBox() {
    try {
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/java";
        java.sql.Connection conn = DriverManager.getConnection(url, "root", "");
        sqlConn = DriverManager.getConnection(dataConn, usename, Password);
        pst = sqlConn.prepareStatement("SELECT name FROM supplier");

        rs = pst.executeQuery();
        gg.removeAllItems(); // Clear existing items
        while (rs.next()) {
            String supplierName = rs.getString("name");
            gg.addItem(supplierName);
        }
    } catch (Exception ex) {
        JOptionPane.showConfirmDialog(null, ex);
    }
}
    private void usenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usenActionPerformed
    
    }//GEN-LAST:event_usenActionPerformed

    private void pswActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pswActionPerformed
       
    }//GEN-LAST:event_pswActionPerformed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
  String selectedSupplier = gg.getSelectedItem().toString();
        String role=nm.getSelectedItem().toString();
      
        try {
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/java";
        Connection conn = DriverManager.getConnection(url, "root", "");

        String checkSql = "SELECT * FROM product WHERE ProductID = ?";
        try (PreparedStatement checkStmt = conn.prepareStatement(checkSql)) {
            String userIdText = usen22.getText();
            if (userIdText.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please enter a valid Product ID", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            int userId = Integer.parseInt(userIdText);
            checkStmt.setInt(1, userId);

            try (ResultSet checkResult = checkStmt.executeQuery()) {
                if (checkResult.next()) {
                    
                  pst = conn.prepareStatement("UPDATE product SET ProductName=?, Quntity=?, ProductCatgory=?, Price=?,suppliername=? WHERE ProductID=?");

    pst.setString(1, usen.getText());
    pst.setInt(2, Integer.parseInt(psw.getText()));
    pst.setString(3, role);
    pst.setBigDecimal(4, new BigDecimal(nam1.getText()));
    pst.setString(5, selectedSupplier);
    pst.setInt(6, userId);

                    int rowsUpdated = pst.executeUpdate();

                    if (rowsUpdated > 0) {
                        JOptionPane.showMessageDialog(this, "User Edited Successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
                        upDateDB();
                    } else {
                        JOptionPane.showMessageDialog(this, "No changes made. Make sure the values are different.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Can't find the user.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Invalid User ID format", "Error", JOptionPane.ERROR_MESSAGE);
    } catch (SQLException | ClassNotFoundException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_editActionPerformed
private JFrame frame;
    private void lgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lgActionPerformed
       Login ui = new Login();
       ui.show();
       dispose();
          
    }//GEN-LAST:event_lgActionPerformed

    private void resActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resActionPerformed
        usen22.setText("");
        usen.setText("");
        psw.setText("");
        nam1.setText(""); 
      
    }//GEN-LAST:event_resActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
  String selectedSupplier = gg.getSelectedItem().toString();

        String role = nm.getSelectedItem().toString();

      try {
            if (usen22.getText().isEmpty() || usen.getText().isEmpty() || psw.getText().isEmpty()
                    || role.isEmpty() || nam1.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please fill in all fields", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/java";
            java.sql.Connection conn = DriverManager.getConnection(url, "root", "");
            sqlConn = DriverManager.getConnection(dataConn, usename, Password);

            if (isProductIDExists(usen22.getText())) {
                JOptionPane.showMessageDialog(this, "Product ID already exists", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            pst = sqlConn.prepareStatement("INSERT INTO product(ProductID, ProductName, Quntity, ProductCatgory, Price, suppliername) VALUES (?, ?, ?, ?, ?, ?)");

            String usenText = usen22.getText();
            int pswValue;
            try {
                pswValue = Integer.parseInt(psw.getText());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Invalid Quantity format", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            float nam1Value;
            try {
                nam1Value = Float.parseFloat(nam1.getText());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Invalid Price format", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            pst.setString(1, usenText);
            pst.setString(2, usen.getText());
            pst.setInt(3, pswValue);
            pst.setString(4, role);
            pst.setFloat(5, nam1Value);
            pst.setString(6, selectedSupplier);

            int rowsAffected = pst.executeUpdate();

            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(this, "Record Added");
                upDateDB();
            } else {
                JOptionPane.showMessageDialog(this, "Failed to add record", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }


 private boolean isProductIDExists(String productID) throws SQLException {
        String query = "SELECT COUNT(*) FROM product WHERE ProductID= ?";
        try (PreparedStatement checkProductIDStmt = sqlConn.prepareStatement(query)) {
            checkProductIDStmt.setString(1, productID);
            ResultSet resultSet = checkProductIDStmt.executeQuery();
            resultSet.next();
            int count = resultSet.getInt(1);
            return count > 0;
        }
    }//GEN-LAST:event_addActionPerformed

    private void nam1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nam1ActionPerformed
       
    }//GEN-LAST:event_nam1ActionPerformed

    private void usen22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usen22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usen22ActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
      int selectedRow = jTable2.getSelectedRow();
    if (selectedRow != -1) {
       
        usen22.setText(jTable2.getValueAt(selectedRow, 0).toString()); 
        usen.setText(jTable2.getValueAt(selectedRow, 1).toString());
        psw.setText(jTable2.getValueAt(selectedRow, 2).toString());
        nm.setSelectedItem(jTable2.getValueAt(selectedRow,3).toString());
        nam1.setText(jTable2.getValueAt(selectedRow, 4).toString());
        gg.setSelectedItem(jTable2.getValueAt(selectedRow,5).toString());
    
    }
    jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
    public void mouseClicked(java.awt.event.MouseEvent evt) {
        jTable2MouseClicked(evt);
    }
});
    }//GEN-LAST:event_jTable2MouseClicked

    private void deleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleActionPerformed
         try {
        String userIdText = usen22.getText();
        if (userIdText.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter a valid User ID", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        int userId = Integer.parseInt(userIdText);
        int dialogResult = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this user?", "Confirmation", JOptionPane.YES_NO_OPTION);
        if (dialogResult == JOptionPane.YES_OPTION) {
          
            try (PreparedStatement deleteStmt = sqlConn.prepareStatement("DELETE FROM product WHERE ProductID = ?")) {
                deleteStmt.setInt(1, userId);
                int rowsDeleted = deleteStmt.executeUpdate();

                if (rowsDeleted > 0) {
                    JOptionPane.showMessageDialog(this, "User Deleted Successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
                    upDateDB();
                } else {
                    JOptionPane.showMessageDialog(this, "Failed to delete user.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Invalid User ID format", "Error", JOptionPane.ERROR_MESSAGE);
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_deleActionPerformed

    private void nmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nmActionPerformed

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
            java.util.logging.Logger.getLogger(Employe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Employe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Employe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Employe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Employe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton dele;
    private javax.swing.JButton edit;
    private javax.swing.JComboBox<String> gg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JButton lg;
    private javax.swing.JTextField nam1;
    private javax.swing.JComboBox<String> nm;
    private javax.swing.JTextField psw;
    private javax.swing.JButton res;
    private javax.swing.JTextField usen;
    private javax.swing.JTextField usen22;
    // End of variables declaration//GEN-END:variables
}
