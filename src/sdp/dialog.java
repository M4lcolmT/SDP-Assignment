package sdp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class dialog extends javax.swing.JFrame {

    String name = "Lee Wei Han";
    
    public dialog(String bloodBank_Name, String date, String time, String bloodBank_Address) {
        initComponents();
        
        username.setText(name);
        bloodbank_name.setText(bloodBank_Name);
        datelabel.setText(date);
        timelabel.setText(time);
        bloodbank_address.setText(bloodBank_Address);
        
        setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        username = new javax.swing.JLabel();
        bloodbank_name = new javax.swing.JLabel();
        bloodbank_address = new javax.swing.JLabel();
        datelabel = new javax.swing.JLabel();
        timelabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jButton1.setText("confirm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        username.setText("jLabel1");

        bloodbank_name.setText("jLabel1");

        bloodbank_address.setText("jLabel1");

        datelabel.setText("jLabel1");

        timelabel.setText("jLabel1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(timelabel)
                    .addComponent(datelabel)
                    .addComponent(bloodbank_address)
                    .addComponent(bloodbank_name)
                    .addComponent(username))
                .addGap(190, 190, 190))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addComponent(jButton1)
                .addContainerGap(171, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(username)
                .addGap(18, 18, 18)
                .addComponent(bloodbank_name)
                .addGap(18, 18, 18)
                .addComponent(bloodbank_address)
                .addGap(18, 18, 18)
                .addComponent(datelabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(timelabel)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(38, 38, 38))
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //String name = username.getText();
        String bloodbankName = bloodbank_name.getText();
        String bloodbankAddress = bloodbank_address.getText();
        String date = datelabel.getText();
        String time = timelabel.getText();
        
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:sqlserver://DESKTOP-8G3PGVH\\SQLEXPRESS;databaseName=SDPAssignment;user=sa;password=password;encrypt=false");
        } catch (SQLException e) {
            e.printStackTrace();
            return;
        }
        // Create a SQL INSERT statement to insert the date and time into the MSSQL database
        PreparedStatement stmt = null;
        try {
            String sql = "INSERT INTO Pending_Appointment (username, bloodbank_name, date, time, address) VALUES (?,?,?,?,?)";
            stmt = conn.prepareStatement(sql);
            
            stmt.setString(1, name);
            stmt.setString(2, bloodbankName);
            stmt.setString(3, bloodbankAddress);
            stmt.setString(4, date);
            stmt.setString(5, time);
            // Execute the SQL INSERT statement
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Close the JDBC connection
            try {
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bloodbank_address;
    private javax.swing.JLabel bloodbank_name;
    private javax.swing.JLabel datelabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel timelabel;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
}
