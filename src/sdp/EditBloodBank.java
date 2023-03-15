package sdp;


import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class EditBloodBank extends javax.swing.JFrame {

    private Connection connection;
    BloodBank bloodbank;
    
    public static String getBloodGroup(int index) {
        switch (index) {
            case 1:
                return "A+";
            case 2:
                return "A-";
            case 3:
                return "B+";
            case 4:
                return "B-";
            case 5:
                return "O+";
            case 6:
                return "O-";
            case 7:
                return "AB+";
            case 8:
                return "AB-";
            default:
                throw new IllegalArgumentException("Invalid blood group index: " + index);
        }
    }
    
    public EditBloodBank(BloodBank bloodbank) {
        initComponents();
        this.bloodbank = bloodbank;
        bankName.setText(bloodbank.getBloodbankName());
        displayRecord();
    }
    
    private void displayRecord() {
        String bloodBankName = bankName.getText();
        try {
            
            String url = new DatabaseURL().getURL();
            
            connection = DriverManager.getConnection(url);
            String sql = "SELECT * FROM BloodBank_Blood_Availability WHERE bloodbank_name =?";
            
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, bloodBankName);
            ResultSet resultSet = statement.executeQuery();

            DefaultTableModel model = (DefaultTableModel) inventoryTable.getModel();
            
            while (resultSet.next()) {
                // Get quantities for each blood group from remaining columns of result set
                for (int col = 2; col <= 9; col++) {
                    // Retrieve from database
                    String bloodGroup = getBloodGroup(col - 1); // Get blood group label
                    int quantity = resultSet.getInt(col); // Get quantity for current blood group

                    // Add to JTable
                    model.addRow(new Object[]{bloodGroup, quantity});
                }  
            }
            // Set model to JTable
            inventoryTable.setModel(model);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Error connecting to database");
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        bankName = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        inventoryTable = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(198, 44, 44));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sdp/Images/editbutton.png"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Raleway ExtraBold", 1, 24)); // NOI18N
        jLabel5.setText("Blood Avaliability");

        bankName.setFont(new java.awt.Font("Raleway ExtraBold", 1, 26)); // NOI18N
        bankName.setForeground(new java.awt.Color(0, 0, 0));
        bankName.setText("Hospital Kuala Lumpur");

        inventoryTable.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        inventoryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Type of Blood", "Units of Blood Avaliable"
            }
        ));
        inventoryTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        inventoryTable.setGridColor(new java.awt.Color(51, 51, 51));
        jScrollPane1.setViewportView(inventoryTable);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sdp/Images/delete.png"))); // NOI18N

        jButton1.setBackground(new java.awt.Color(198, 44, 44));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Update Table");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bankName)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(49, 49, 49)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(bankName, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(112, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Raleway ExtraBold", 1, 23)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sdp/Images/arrow return.png"))); // NOI18N
        jLabel1.setText("Manage Blood Bank");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sdp/Images/iPhone Status bar.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(0, 7, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        
    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        AdminManageBloodBank manageBloodBank = new AdminManageBloodBank(bloodbank);
        manageBloodBank.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DefaultTableModel model = (DefaultTableModel) inventoryTable.getModel();
        String bloodBankName = bankName.getText();

        try {
            String url = new DatabaseURL().getURL();
            connection = DriverManager.getConnection(url);

            String sql = "UPDATE BloodBank_Blood_Availability SET A_pos=?, A_neg=?, "
                    + "B_pos=?, B_neg=?, O_pos=?, O_neg=?, "
                    + "AB_pos=?, AB_neg=? WHERE bloodbank_name = ?";

            PreparedStatement statement = connection.prepareStatement(sql);

            // Loop through each row of the JTable
            for (int row = 0; row < model.getRowCount(); row++) {
                // Extract data for each blood group from the second column onward
                String bloodGroup = getBloodGroup(row + 1);
                int quantity = Integer.parseInt(model.getValueAt(row, 1).toString());

                switch (bloodGroup) {
                    case "A+":
                        statement.setInt(1, quantity);
                        break;
                    case "A-":
                        statement.setInt(2, quantity);
                        break;
                    case "B+":
                        statement.setInt(3, quantity);
                        break;
                    case "B-":
                        statement.setInt(4, quantity);
                        break;
                    case "O+":
                        statement.setInt(5, quantity);
                        break;
                    case "O-":
                        statement.setInt(6, quantity);
                        break;
                    case "AB+":
                        statement.setInt(7, quantity);
                        break;
                    case "AB-":
                        statement.setInt(8, quantity);
                        break;
                    default:
                        throw new IllegalArgumentException("Invalid blood group: " + bloodGroup);
                }
            }
            // Set the last parameter (bloodbank_name) and execute the statement
            statement.setString(9, bloodBankName);
            statement.executeUpdate();
            connection.close();
            JOptionPane.showMessageDialog(this, "Success!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error connecting to database");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bankName;
    private javax.swing.JTable inventoryTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
