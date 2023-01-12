package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MainFrame extends javax.swing.JFrame {

    // Connect Database
    DatabaseConnector databaseConnector = new DatabaseConnector();
    Connection con = databaseConnector.databaseConnection();

    // Another Method For Call Data Database (ez)
    // Connection con = new DatabaseConnector().databaseConnection();
    DefaultTableModel model1 = new DefaultTableModel(new String[]{"ID", "Name", "Telephone", "Email", "Password"}, 0);
    
    DefaultTableModel model2 = new DefaultTableModel(new String[]{"ID", "Name", "Subject 1", "Subject 2", "Subject 3"}, 0);

    public MainFrame() {
        initComponents();
        jTable1.setModel(model2);
        btn_refreshActionPerformed(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_name = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_telephone = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_email = new javax.swing.JTextField();
        txt_password = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btn_insert = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        btn_refresh = new javax.swing.JButton();
        btn_clear = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable(){
            public boolean editCellAt(int row, int column, java.util.EventObject e){
                return false;
            }
        };

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Simple Database Application");

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel2.setText("User ID");

        txt_id.setEditable(false);
        txt_id.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txt_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_idActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel3.setText("User Name");

        txt_name.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel4.setText("User Telephone No");

        txt_telephone.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel5.setText("User Email");

        txt_email.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        txt_password.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel6.setText("User Password");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_password, javax.swing.GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE)
                    .addComponent(txt_email)
                    .addComponent(txt_id)
                    .addComponent(txt_name)
                    .addComponent(txt_telephone))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_telephone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_insert.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btn_insert.setText("Insert Data");
        btn_insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_insertActionPerformed(evt);
            }
        });

        btn_update.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btn_update.setText("Update Data");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });

        btn_delete.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btn_delete.setText("Delete Data");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        btn_refresh.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btn_refresh.setText("Refesh Data");
        btn_refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_refreshActionPerformed(evt);
            }
        });

        btn_clear.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btn_clear.setText("Clear Data");
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_insert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_update, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                    .addComponent(btn_delete, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                    .addComponent(btn_refresh, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                    .addComponent(btn_clear, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_insert)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_update)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_delete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_refresh)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_clear)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTable1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        jTable1.getTableHeader().setFont(new java.awt.Font("Calibri", 0, 14));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_idActionPerformed

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        // Empty Text Fields
        txt_id.setText("");
        txt_name.setText("");
        txt_telephone.setText("");
        txt_email.setText("");
        txt_password.setText("");
    }//GEN-LAST:event_btn_clearActionPerformed

    private void btn_refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_refreshActionPerformed
        // Get Data From Database To ArrayList
        ArrayList<SubjectDetails> data = getDataForList("SELECT a.ID, a.Name, b.sub_1, b.sub_2, b.sub_3 FROM subject b INNER JOIN user a on a.ID = b.st_id");
        // Stopped Duplicate Data Rows
        model2.setRowCount(0);
        // Condition To Show Data In jTabel
        for (int i = 0; i < data.size(); i++) {
            // Setting Condition
            String a = data.get(i).getSt_id();
            String b = data.get(i).getSt_name();
            String c = data.get(i).getSub1();
            String d = data.get(i).getSub2();
            String e = data.get(i).getSub3();

            // String To Int methods,
            // 1. 'String' Change To 'Object'
            // 2. Int Variable + "" (empty space)
            model2.addRow(new String[]{a, b, c, d, e});
        }
    }//GEN-LAST:event_btn_refreshActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        // TODO add your handling code here:

        if (jTable1.getSelectedRowCount() == 1) {
            int row = jTable1.getSelectedRow();
            String data = jTable1.getValueAt(row, 0).toString();

            Statement st;

            try {
                // Create Statement
                st = con.createStatement();
                // Query For Delete
                st.executeUpdate("DELETE FROM `user` WHERE ID =" + data);
                // Show Message
                JOptionPane.showMessageDialog(MainFrame.this, "Data Deleted");
                // Refresh jTable View
                btn_refreshActionPerformed(null);
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(MainFrame.this, e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(this, "You Have To Select One Row To Delete Data");
        }
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void btn_insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_insertActionPerformed
        // Validate For ID Field
        if (txt_id.getText().isEmpty()) {
            // Call Validation Method
            if (validateData()) {
                try {
                    // Query For Insert
                    String query = "INSERT INTO `user` VALUES (null,?,?,?,?)";
                    // Create Statement
                    PreparedStatement pst = con.prepareStatement(query);
                    // Setting Statement
                    pst.setString(1, txt_name.getText());
                    pst.setString(2, txt_telephone.getText());
                    pst.setString(3, txt_email.getText());
                    pst.setString(4, txt_password.getText());
                    pst.execute();
                    // Show Message
                    JOptionPane.showMessageDialog(MainFrame.this, "Details Inserted SuccessFully");
                    // Refresh jTable View
                    btn_refreshActionPerformed(null);
                    // Clear Text Fields
                    btn_clearActionPerformed(null);
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(MainFrame.this, e.getMessage());
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "You Can't Insert This Data");
        }
    }//GEN-LAST:event_btn_insertActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        if (jTable1.getSelectedRowCount() == 1) {
            txt_id.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
            txt_name.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString());
            txt_telephone.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString());
            txt_email.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 3).toString());
            txt_password.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 4).toString());
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        // Validate For ID Field
        if (!txt_id.getText().isEmpty()) {
            // Call Validation Method
            if (validateData()) {
                try {
                    // Query For Update
                    String query = "UPDATE `user` SET `Name`= ?,`Telephone`= ?,`Email`= ?,`Password`= ? WHERE `ID`= ?";
                    // Create Statement
                    PreparedStatement pst = con.prepareStatement(query);
                    // Setting Statement
                    pst.setString(1, txt_name.getText());
                    pst.setString(2, txt_telephone.getText());
                    pst.setString(3, txt_email.getText());
                    pst.setString(4, txt_password.getText());
                    pst.setString(5, txt_id.getText());
                    pst.execute();
                    // Show Message
                    JOptionPane.showMessageDialog(MainFrame.this, "Details Updated SuccessFully");
                    // Refresh jTable View
                    btn_refreshActionPerformed(null);
                    // Clear Text Fields
                    btn_clearActionPerformed(null);
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(MainFrame.this, e.getMessage());
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "You Can't Update Data Without ID");
        }
    }//GEN-LAST:event_btn_updateActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    public ArrayList<AccessUserData> getDataList(String query) {
        // Create AccessData ArrayList
        ArrayList<AccessUserData> dataList = new ArrayList();

        // Create Required Variables
        Statement st;
        ResultSet rs;

        try {
            st = con.createStatement();
            rs = st.executeQuery(query);
            AccessUserData data;
            while (rs.next()) {
                data = new AccessUserData(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
                dataList.add(data);
            }
        } catch (SQLException e) {
            // Show Message
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return dataList;
    }
    
    public ArrayList<SubjectDetails> getDataForList(String query) {
        // Create AccessData ArrayList
        ArrayList<SubjectDetails> dataList = new ArrayList();

        // Create Required Variables
        Statement st;
        ResultSet rs;

        try {
            st = con.createStatement();
            rs = st.executeQuery(query);
            SubjectDetails data;
            while (rs.next()) {
                data = new SubjectDetails(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
                dataList.add(data);
            }
        } catch (SQLException e) {
            // Show Message
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return dataList;
    }

    private boolean validateData() {
        // Name Validation
        if (txt_name.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "You Have To Fill The Name To Continue");
            txt_name.requestFocus();
            return false;
        }
        if (txt_name.getText().length() > 20) {
            JOptionPane.showMessageDialog(this, "Name Field Must Have Only 1-20 Characters");
            txt_name.requestFocus();
            return false;
        }
        if (!Pattern.matches("[A-Z a-z]+", txt_name.getText())) {
            JOptionPane.showMessageDialog(this, "Name Field Must Have Only ' A-Z ' ' a-z ' ' Space ' Characters");
            txt_name.requestFocus();
            return false;
        }

        // Telephone Validation
        if (txt_telephone.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "You Have To Fill The Telephone No. To Continue");
            txt_telephone.requestFocus();
            return false;
        }
        if (txt_telephone.getText().length() != 10) {
            JOptionPane.showMessageDialog(this, "Name Field Must Have 10 Characters");
            txt_telephone.requestFocus();
            return false;
        }
        if (!Pattern.matches("[0-9]+", txt_telephone.getText())) {
            JOptionPane.showMessageDialog(this, "Telephone No. Field Must Have Only Numbers");
            txt_telephone.requestFocus();
            return false;
        }

        // Email Validation
        if (txt_email.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "You Have To Fill The Email To Continue");
            txt_email.requestFocus();
            return false;
        }
        if (txt_email.getText().length() > 20) {
            JOptionPane.showMessageDialog(this, "Email Field Must Have 1-20 Characters");
            txt_email.requestFocus();
            return false;
        }
        // Example - 'Hemath.Perera@gmail.com'
        // ^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$+
        if (!Pattern.matches("^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$", txt_email.getText())) {
            JOptionPane.showMessageDialog(this, "You Have Entered An Invalid Email Address!");
            txt_email.requestFocus();
            return false;
        }

        // Password Validation
        if (txt_password.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "You Have To Fill The Password To Continue");
            txt_password.requestFocus();
            return false;
        }
        if (txt_password.getText().length() > 20 | txt_password.getText().length() < 8) {
            JOptionPane.showMessageDialog(this, "Password Field Must Have 8-20 Characters");
            txt_password.requestFocus();
            return false;
        }
        /*if (!Pattern.matches("[]", txt_telephone.getText())) {
            JOptionPane.showMessageDialog(this, "Telephone No. Field Must Have Only Numbers");
            return false;
        }*/
        return true;
    }

    // Validation
    // Database Data Is Displayed By jTable When The Software Is Run
    /*private void showData() {
        ArrayList<AccessUserData> data = getDataList("SELECT * FROM user");
        model1.setRowCount(0);
        for (int i = 0; i < data.size(); i++) {
            int a = data.get(i).getId();
            String b = data.get(i).getName();
            String c = data.get(i).getTelephone();
            String d = data.get(i).getEmail();
            String e = data.get(i).getPassword();

            // String To Int methods,
            // 1. 'String' Change To 'Object'
            // 2. Int Variable + "" (empty space)
            model1.addRow(new String[]{a + "", b, c, d, e});
        }
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_insert;
    private javax.swing.JButton btn_refresh;
    private javax.swing.JButton btn_update;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_password;
    private javax.swing.JTextField txt_telephone;
    // End of variables declaration//GEN-END:variables
}
