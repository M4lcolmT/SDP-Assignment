package sdp;

import java.sql.*;
import javax.swing.JOptionPane;

public class AdminAppointmentList extends javax.swing.JFrame {

    BloodBank bloodbank;
    private Connection connection;
    
    public AdminAppointmentList(BloodBank bloodbank) {
        initComponents();
        setAppointment();
        this.bloodbank = bloodbank;
    }
    
    private void setAppointment() {
        try {
            String url = new DatabaseURL().getURL();
            
            Connection connection = DriverManager.getConnection(url);
            String sql = "SELECT * FROM Pending_Appointment";
            
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(sql);
            ResultSetMetaData rsmd = rs.getMetaData();
            int columnsNumber = rsmd.getColumnCount();

            while (rs.next()) {     
                for(int i = 1 ; i <= columnsNumber; i++){
                    name.setText(rs.getString(1));
                    bloodbankName.setText(rs.getString(2));
                    date.setText(rs.getString(3));
                    time.setText(rs.getString(4));
                }
            }

            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FrameResult = new javax.swing.JFrame();
        jPanel9 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel15 = new javax.swing.JPanel();
        TFSearch1 = new javax.swing.JTextField();
        BSearch1 = new javax.swing.JButton();
        testAccept1 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        name1 = new javax.swing.JLabel();
        bloodbankName1 = new javax.swing.JLabel();
        dateTime1 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        TFSearch = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        rejectDate1 = new javax.swing.JLabel();
        rejectTime1 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        rejectPanel = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        rejectName = new javax.swing.JLabel();
        rejectBloodBankName = new javax.swing.JLabel();
        rejectDate = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        rejectBtn = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel19 = new javax.swing.JLabel();
        rejectTime = new javax.swing.JLabel();
        acceptPanel = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        bloodbankName = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        accept = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel29 = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        searchBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        FrameResult.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        FrameResult.setMinimumSize(new java.awt.Dimension(375, 710));

        jPanel9.setBackground(new java.awt.Color(198, 44, 44));
        jPanel9.setForeground(new java.awt.Color(255, 255, 255));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Return");

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setBorder(null);
        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 381, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 721, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(jPanel15);

        TFSearch1.setBackground(new java.awt.Color(244, 211, 211));
        TFSearch1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFSearch1ActionPerformed(evt);
            }
        });

        BSearch1.setText("Search");
        BSearch1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSearch1ActionPerformed(evt);
            }
        });

        testAccept1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel26.setBackground(new java.awt.Color(255, 255, 255));
        jLabel26.setFont(new java.awt.Font("Segoe UI Semibold", 0, 11)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(193, 193, 193));
        jLabel26.setText("Username");

        jLabel27.setBackground(new java.awt.Color(255, 255, 255));
        jLabel27.setFont(new java.awt.Font("Segoe UI Semibold", 0, 11)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(193, 193, 193));
        jLabel27.setText("BloodBank Name");

        jLabel28.setBackground(new java.awt.Color(255, 255, 255));
        jLabel28.setFont(new java.awt.Font("Segoe UI Semibold", 0, 11)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(193, 193, 193));
        jLabel28.setText("Date and Time");

        name1.setFont(new java.awt.Font("Raleway ExtraBold", 0, 12)); // NOI18N
        name1.setText("jLabel13");

        bloodbankName1.setFont(new java.awt.Font("Raleway ExtraBold", 0, 12)); // NOI18N
        bloodbankName1.setText("jLabel14");

        dateTime1.setFont(new java.awt.Font("Raleway ExtraBold", 0, 12)); // NOI18N
        dateTime1.setText("jLabel15");

        jButton7.setBackground(new java.awt.Color(222, 10, 30));
        jButton7.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Accept");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        jButton8.setForeground(new java.awt.Color(222, 10, 30));
        jButton8.setText("Reject");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout testAccept1Layout = new javax.swing.GroupLayout(testAccept1);
        testAccept1.setLayout(testAccept1Layout);
        testAccept1Layout.setHorizontalGroup(
            testAccept1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(testAccept1Layout.createSequentialGroup()
                .addGroup(testAccept1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(testAccept1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(testAccept1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel27)
                            .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(39, 39, 39)
                        .addGroup(testAccept1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dateTime1)
                            .addComponent(bloodbankName1)
                            .addComponent(name1)))
                    .addGroup(testAccept1Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jButton7)
                        .addGap(59, 59, 59)
                        .addComponent(jButton8)))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        testAccept1Layout.setVerticalGroup(
            testAccept1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(testAccept1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(testAccept1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(name1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(testAccept1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bloodbankName1)
                    .addComponent(jLabel27))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(testAccept1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateTime1)
                    .addComponent(jLabel28))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(testAccept1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7)
                    .addComponent(jButton8))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(325, 325, 325)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(testAccept1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(TFSearch1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BSearch1)
                        .addGap(0, 58, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TFSearch1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BSearch1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(testAccept1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel25)
                .addGap(18, 18, 18)
                .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout FrameResultLayout = new javax.swing.GroupLayout(FrameResult.getContentPane());
        FrameResult.getContentPane().setLayout(FrameResultLayout);
        FrameResultLayout.setHorizontalGroup(
            FrameResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        FrameResultLayout.setVerticalGroup(
            FrameResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(198, 44, 44));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel4MouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Raleway ExtraBold", 0, 12)); // NOI18N
        jLabel5.setText("PROFILE");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sdp/Images/profile.png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(21, 21, 21))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel5MouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Raleway ExtraBold", 0, 12)); // NOI18N
        jLabel4.setText("APPOINTMENT");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sdp/Images/appointments.png"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel7)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4))
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel6MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Raleway ExtraBold", 0, 12)); // NOI18N
        jLabel3.setText("HOME");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sdp/Images/home.png"))); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel6))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel3)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3))
        );

        jSeparator1.setBackground(new java.awt.Color(255, 153, 153));
        jSeparator1.setForeground(new java.awt.Color(255, 153, 153));
        jSeparator1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        TFSearch.setBackground(new java.awt.Color(244, 211, 211));
        TFSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFSearchActionPerformed(evt);
            }
        });

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Segoe UI Semibold", 0, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(193, 193, 193));
        jLabel10.setText("Username");

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Segoe UI Semibold", 0, 11)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(193, 193, 193));
        jLabel11.setText("BloodBank Name");

        jLabel13.setFont(new java.awt.Font("Raleway ExtraBold", 0, 12)); // NOI18N
        jLabel13.setText("Johnny papa");

        jLabel14.setFont(new java.awt.Font("Raleway ExtraBold", 0, 12)); // NOI18N
        jLabel14.setText("Hospital Serdang");

        jButton1.setBackground(new java.awt.Color(222, 10, 30));
        jButton1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Accept");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        jButton2.setForeground(new java.awt.Color(222, 10, 30));
        jButton2.setText("Reject");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        rejectDate1.setFont(new java.awt.Font("Raleway ExtraBold", 0, 12)); // NOI18N
        rejectDate1.setText("2023-04-14");

        rejectTime1.setFont(new java.awt.Font("Raleway ExtraBold", 0, 12)); // NOI18N
        rejectTime1.setText("9am - 5pm");

        jLabel21.setBackground(new java.awt.Color(255, 255, 255));
        jLabel21.setFont(new java.awt.Font("Segoe UI Semibold", 0, 11)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(193, 193, 193));
        jLabel21.setText("Time");

        jLabel20.setBackground(new java.awt.Color(255, 255, 255));
        jLabel20.setFont(new java.awt.Font("Segoe UI Semibold", 0, 11)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(193, 193, 193));
        jLabel20.setText("Date");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel13)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jButton1)
                        .addGap(61, 61, 61)
                        .addComponent(jButton2))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel21)
                            .addComponent(jLabel20))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rejectDate1)
                            .addComponent(rejectTime1))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addComponent(rejectDate1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rejectTime1)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1))
        );

        rejectPanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Segoe UI Semibold", 0, 11)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(193, 193, 193));
        jLabel16.setText("Username");

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("Segoe UI Semibold", 0, 11)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(193, 193, 193));
        jLabel17.setText("BloodBank Name");

        jLabel18.setBackground(new java.awt.Color(255, 255, 255));
        jLabel18.setFont(new java.awt.Font("Segoe UI Semibold", 0, 11)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(193, 193, 193));
        jLabel18.setText("Date");

        rejectName.setFont(new java.awt.Font("Raleway ExtraBold", 0, 12)); // NOI18N
        rejectName.setText("Jake Henderson ");

        rejectBloodBankName.setFont(new java.awt.Font("Raleway ExtraBold", 0, 12)); // NOI18N
        rejectBloodBankName.setText("Hospital Bintulu");

        rejectDate.setFont(new java.awt.Font("Raleway ExtraBold", 0, 12)); // NOI18N
        rejectDate.setText("2023-04-14");

        jButton3.setBackground(new java.awt.Color(222, 10, 30));
        jButton3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Accept");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        rejectBtn.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        rejectBtn.setForeground(new java.awt.Color(222, 10, 30));
        rejectBtn.setText("Reject");
        rejectBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rejectBtnActionPerformed(evt);
            }
        });

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setFont(new java.awt.Font("Segoe UI Semibold", 0, 11)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(193, 193, 193));
        jLabel19.setText("Time");

        rejectTime.setFont(new java.awt.Font("Raleway ExtraBold", 0, 12)); // NOI18N
        rejectTime.setText("9am - 5pm");

        javax.swing.GroupLayout rejectPanelLayout = new javax.swing.GroupLayout(rejectPanel);
        rejectPanel.setLayout(rejectPanelLayout);
        rejectPanelLayout.setHorizontalGroup(
            rejectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rejectPanelLayout.createSequentialGroup()
                .addGroup(rejectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rejectPanelLayout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jButton3)
                        .addGap(59, 59, 59)
                        .addComponent(rejectBtn))
                    .addGroup(rejectPanelLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(rejectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel19)
                            .addComponent(jLabel16)
                            .addComponent(jLabel18)
                            .addComponent(jLabel17))
                        .addGap(41, 41, 41)
                        .addGroup(rejectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rejectBloodBankName)
                            .addComponent(rejectName)
                            .addComponent(rejectDate)
                            .addComponent(rejectTime))))
                .addContainerGap(101, Short.MAX_VALUE))
            .addComponent(jSeparator3)
        );
        rejectPanelLayout.setVerticalGroup(
            rejectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rejectPanelLayout.createSequentialGroup()
                .addGroup(rejectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(rejectName, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(rejectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(rejectBloodBankName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(rejectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(rejectDate, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(rejectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(rejectTime))
                .addGap(24, 24, 24)
                .addGroup(rejectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(rejectBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1))
        );

        acceptPanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel22.setBackground(new java.awt.Color(255, 255, 255));
        jLabel22.setFont(new java.awt.Font("Segoe UI Semibold", 0, 11)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(193, 193, 193));
        jLabel22.setText("Username");

        jLabel23.setBackground(new java.awt.Color(255, 255, 255));
        jLabel23.setFont(new java.awt.Font("Segoe UI Semibold", 0, 11)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(193, 193, 193));
        jLabel23.setText("BloodBank Name");

        jLabel24.setBackground(new java.awt.Color(255, 255, 255));
        jLabel24.setFont(new java.awt.Font("Segoe UI Semibold", 0, 11)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(193, 193, 193));
        jLabel24.setText("Date");

        name.setFont(new java.awt.Font("Raleway ExtraBold", 0, 12)); // NOI18N
        name.setText("jLabel13");

        bloodbankName.setFont(new java.awt.Font("Raleway ExtraBold", 0, 12)); // NOI18N
        bloodbankName.setText("jLabel14");

        date.setFont(new java.awt.Font("Raleway ExtraBold", 0, 12)); // NOI18N
        date.setText("jLabel15");

        accept.setBackground(new java.awt.Color(222, 10, 30));
        accept.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        accept.setForeground(new java.awt.Color(255, 255, 255));
        accept.setText("Accept");
        accept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceptActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        jButton6.setForeground(new java.awt.Color(222, 10, 30));
        jButton6.setText("Reject");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));

        jLabel29.setBackground(new java.awt.Color(255, 255, 255));
        jLabel29.setFont(new java.awt.Font("Segoe UI Semibold", 0, 11)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(193, 193, 193));
        jLabel29.setText(" Time");

        time.setFont(new java.awt.Font("Raleway ExtraBold", 0, 12)); // NOI18N
        time.setText("jLabel15");

        javax.swing.GroupLayout acceptPanelLayout = new javax.swing.GroupLayout(acceptPanel);
        acceptPanel.setLayout(acceptPanelLayout);
        acceptPanelLayout.setHorizontalGroup(
            acceptPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(acceptPanelLayout.createSequentialGroup()
                .addGroup(acceptPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(acceptPanelLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(acceptPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(acceptPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel23)
                                .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(jLabel29))
                        .addGap(39, 39, 39)
                        .addGroup(acceptPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(time)
                            .addComponent(date)
                            .addComponent(bloodbankName)
                            .addComponent(name)))
                    .addGroup(acceptPanelLayout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(accept)
                        .addGap(59, 59, 59)
                        .addComponent(jButton6)))
                .addContainerGap(101, Short.MAX_VALUE))
            .addComponent(jSeparator4)
        );
        acceptPanelLayout.setVerticalGroup(
            acceptPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(acceptPanelLayout.createSequentialGroup()
                .addGroup(acceptPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(name))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(acceptPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(bloodbankName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(acceptPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(date))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(acceptPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(time))
                .addGap(24, 24, 24)
                .addGroup(acceptPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(accept)
                    .addComponent(jButton6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1))
        );

        searchBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sdp/Images/search_32px.png"))); // NOI18N
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(TFSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(searchBtn)
                .addGap(32, 32, 32))
            .addComponent(acceptPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(rejectPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TFSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rejectPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(acceptPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sdp/Images/iPhone Status bar.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Raleway ExtraBold", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sdp/Images/arrow return.png"))); // NOI18N
        jLabel2.setText(" Appointment");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void jPanel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseClicked
        new AdminMainMenu(bloodbank).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jPanel6MouseClicked

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked
        
    }//GEN-LAST:event_jPanel4MouseClicked

    private void jPanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseClicked
     
    }//GEN-LAST:event_jPanel5MouseClicked

    private void TFSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFSearchActionPerformed

    }//GEN-LAST:event_TFSearchActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        acceptPanel.setVisible(true);
        int response = JOptionPane.showConfirmDialog(this, 
                "Do you want to confirm this appointment?", 
                "Confirm", JOptionPane.YES_NO_OPTION, 
                JOptionPane.QUESTION_MESSAGE);
        if (response == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null,
                "Appointment Successfully Confirmed!", "Exit",
                JOptionPane.INFORMATION_MESSAGE);
            String username = name.getText();
            String bloodbankname = bloodbankName.getText();
            String appointmentDate = date.getText();
            String appointmentTime = time.getText();
            
            try {
            
            // Set up a connection to MSSQL
            connection = DriverManager.getConnection(new DatabaseURL().getURL());

            // Prepare and execute a SQL query to insert the new user data into the table
            String query = "INSERT INTO Appointment (username, bloodbank_name, date, time) VALUES (?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1,  username);
            statement.setString(2, bloodbankname);
            statement.setString(3, appointmentDate);
            statement.setString(4, appointmentTime);
            int rowsInserted = statement.executeUpdate();

            // Check if the query was successful and print a message to the console
            if (rowsInserted > 0) {
                System.out.println("New blood donation campaign inserted successfully.");
            }
        } catch (SQLException e) {
            System.out.println("Error connecting to database: " + e.getMessage());
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                System.out.println("Error closing connection: " + e.getMessage());
            }
        }  
            acceptPanel.setVisible(false);
        }
        else if (response == JOptionPane.NO_OPTION)
        {
            JOptionPane.showMessageDialog(null,
                "Action cancelled!", "Error",JOptionPane.WARNING_MESSAGE);
        }   
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jPanel7.setVisible(true);
        int response = JOptionPane.showConfirmDialog(this, 
                "Do you want to reject this appointment?", 
                "Reject", JOptionPane.YES_NO_OPTION, 
                JOptionPane.QUESTION_MESSAGE);
        if (response == JOptionPane.YES_OPTION) {
            String username = rejectName.getText();
            String bloodbankname = rejectBloodBankName.getText();
            String appointmentDate = rejectDate.getText();
            String appointmentTime = rejectTime.getText();
            try {
                Connection con = DriverManager.getConnection(new DatabaseURL().getURL());
                PreparedStatement pst = con.prepareStatement("DELETE FROM Pending_Appointment WHERE username=? "
                        + "AND bloodbank_name=? AND date = ? AND time=?");
                pst.setString(1, username);
                pst.setString(2, bloodbankname);
                pst.setString(3, appointmentDate);
                pst.setString(4, appointmentTime);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, 
                        "Appointment Successfully Rejected", 
                        "Exit", 
                        JOptionPane.INFORMATION_MESSAGE);
                jPanel7.setVisible(false);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, 
                        "Error: " + ex.getMessage(), "Error", 
                        JOptionPane.ERROR_MESSAGE);
            }   
        }
        else if (response == JOptionPane.NO_OPTION)
        {
            JOptionPane.showMessageDialog(null,
                "Action cancelled!", "Error",
                JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        rejectPanel.setVisible(true);
        int response = JOptionPane.showConfirmDialog(this, "Do you want to confirm this appointment?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (response == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null,
                "Appointment Successfully Confirmed!", "Exit",
                JOptionPane.INFORMATION_MESSAGE);
            String username = name.getText();
            String bloodbankname = bloodbankName.getText();
            String appointmentDate = date.getText();
            String appointmentTime = time.getText();
            
            try {
            
            // Set up a connection to MSSQL
            connection = DriverManager.getConnection(new DatabaseURL().getURL());

            // Prepare and execute a SQL query to insert the new user data into the table
            String query = "INSERT INTO Appointment (username, bloodbank_name, date, time) VALUES (?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1,  username);
            statement.setString(2, bloodbankname);
            statement.setString(3, appointmentDate);
            statement.setString(4, appointmentTime);
            int rowsInserted = statement.executeUpdate();

            // Check if the query was successful and print a message to the console
            if (rowsInserted > 0) {
                System.out.println("New blood donation campaign inserted successfully.");
            }
        } catch (SQLException e) {
            System.out.println("Error connecting to database: " + e.getMessage());
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                System.out.println("Error closing connection: " + e.getMessage());
            }
        }  
            rejectPanel.setVisible(false);
        }
        else if (response == JOptionPane.NO_OPTION)
        {
            JOptionPane.showMessageDialog(null,
                "Action cancelled!", "Error",JOptionPane.WARNING_MESSAGE);
        }   
    }//GEN-LAST:event_jButton3ActionPerformed

    private void rejectBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rejectBtnActionPerformed
        rejectPanel.setVisible(true);
        int response = JOptionPane.showConfirmDialog(this, 
                "Do you want to reject this appointment?", 
                "Reject", JOptionPane.YES_NO_OPTION, 
                JOptionPane.QUESTION_MESSAGE);
        if (response == JOptionPane.YES_OPTION) {
            String username = rejectName.getText();
            String bloodbankname = rejectBloodBankName.getText();
            String appointmentDate = rejectDate.getText();
            String appointmentTime = rejectTime.getText();
            try {
                Connection con = DriverManager.getConnection(new DatabaseURL().getURL());
                PreparedStatement pst = con.prepareStatement("DELETE FROM Pending_Appointment "
                        + "WHERE username=? AND bloodbank_name=? AND date = ? AND time=?");
                pst.setString(1, username);
                pst.setString(2, bloodbankname);
                pst.setString(3, appointmentDate);
                pst.setString(4, appointmentTime);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, 
                        "Appointment Successfully Rejected", 
                        "Exit", JOptionPane.INFORMATION_MESSAGE);
                rejectPanel.setVisible(false);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, 
                        "Error: " + ex.getMessage(), 
                        "Error", JOptionPane.ERROR_MESSAGE);
            }   
        }
        else if (response == JOptionPane.NO_OPTION)
        {
            JOptionPane.showMessageDialog(null,
                "Action cancelled!", "Error",
                JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_rejectBtnActionPerformed

    private void acceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceptActionPerformed
        acceptPanel.setVisible(true);
        int response = JOptionPane.showConfirmDialog(this, 
                "Do you want to confirm this appointment?", 
                "Confirm", JOptionPane.YES_NO_OPTION, 
                JOptionPane.QUESTION_MESSAGE);
        if (response == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null,
                "Appointment Successfully Confirmed!", "Exit",
                JOptionPane.INFORMATION_MESSAGE);
            String username = name.getText();
            String bloodbankname = bloodbankName.getText();
            String appointmentDate = date.getText();
            String appointmentTime = time.getText();
            
            try {
            
            // Set up a connection to MSSQL
            connection = DriverManager.getConnection(new DatabaseURL().getURL());

            // Prepare and execute a SQL query to insert the new user data into the table
            String query = "INSERT INTO Appointment (username, bloodbank_name, date, time) VALUES (?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1,  username);
            statement.setString(2, bloodbankname);
            statement.setString(3, appointmentDate);
            statement.setString(4, appointmentTime);
            int rowsInserted = statement.executeUpdate();

            // Check if the query was successful and print a message to the console
            if (rowsInserted > 0) {
                System.out.println("Appointment accepted successfully.");
            }
        } catch (SQLException e) {
            System.out.println("Error connecting to database: " + e.getMessage());
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                System.out.println("Error closing connection: " + e.getMessage());
            }
        }  
            acceptPanel.setVisible(false);
        }
        else if (response == JOptionPane.NO_OPTION)
        {
            JOptionPane.showMessageDialog(null,
                "Action cancelled!", "Error",JOptionPane.WARNING_MESSAGE);
        }    
    }//GEN-LAST:event_acceptActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        acceptPanel.setVisible(true);
        int response = JOptionPane.showConfirmDialog(this, "Do you want to reject this appointment?", "Reject", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (response == JOptionPane.YES_OPTION) {
            String username = rejectName.getText();
            String bloodbankname = rejectBloodBankName.getText();
            String appointmentDate = rejectDate.getText();
            String appointmentTime = rejectTime.getText();
            try {
                Connection con = DriverManager.getConnection(new DatabaseURL().getURL());
                PreparedStatement pst = con.prepareStatement("DELETE FROM Pending_Appointment WHERE username=? AND bloodbank_name=? AND date = ? AND time=?");
                pst.setString(1, username);
                pst.setString(2, bloodbankname);
                pst.setString(3, appointmentDate);
                pst.setString(4, appointmentTime);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Appointment Successfully Rejected", "Exit", JOptionPane.INFORMATION_MESSAGE);
                acceptPanel.setVisible(false);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }   
        }
        else if (response == JOptionPane.NO_OPTION)
        {
            JOptionPane.showMessageDialog(null,
                "Action cancelled!", "Error",
                JOptionPane.WARNING_MESSAGE);
        }        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        new AdminMainMenu(bloodbank).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void TFSearch1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFSearch1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFSearch1ActionPerformed

    private void BSearch1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSearch1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BSearch1ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        
    }//GEN-LAST:event_jButton8ActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        String getSearch = TFSearch.getText();

        try {
            String url = new DatabaseURL().getURL();

            Connection connection = DriverManager.getConnection(url);
            String sql = "SELECT * FROM Appointment WHERE username=?";

            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, getSearch);
            ResultSet result = statement.executeQuery();
            
            if (result.next()) {
                FrameResult.setVisible(true);
                name1.setText(result.getString("username"));
                bloodbankName1.setText(result.getString("bloodbank_name"));
                dateTime1.setText(result.getString("time"));
            } else {
                JOptionPane.showMessageDialog(this, "Username not found. Please try again");
            }
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_searchBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BSearch1;
    private javax.swing.JFrame FrameResult;
    private javax.swing.JTextField TFSearch;
    private javax.swing.JTextField TFSearch1;
    private javax.swing.JButton accept;
    private javax.swing.JPanel acceptPanel;
    private javax.swing.JLabel bloodbankName;
    private javax.swing.JLabel bloodbankName1;
    private javax.swing.JLabel date;
    private javax.swing.JLabel dateTime1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel name;
    private javax.swing.JLabel name1;
    private javax.swing.JLabel rejectBloodBankName;
    private javax.swing.JButton rejectBtn;
    private javax.swing.JLabel rejectDate;
    private javax.swing.JLabel rejectDate1;
    private javax.swing.JLabel rejectName;
    private javax.swing.JPanel rejectPanel;
    private javax.swing.JLabel rejectTime;
    private javax.swing.JLabel rejectTime1;
    private javax.swing.JButton searchBtn;
    private javax.swing.JPanel testAccept1;
    private javax.swing.JLabel time;
    // End of variables declaration//GEN-END:variables
}
