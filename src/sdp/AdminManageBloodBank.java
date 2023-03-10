/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sdp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class AdminManageBloodBank extends javax.swing.JFrame {

    BloodBank bloodbank;
    private String bloodbankName;
    private String unitOfBlood;
    
    
    public AdminManageBloodBank(BloodBank bloodbank) {
        initComponents();
        this.bloodbank = bloodbank;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FrameResult = new javax.swing.JFrame();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel15 = new javax.swing.JPanel();
        PanelSearch = new javax.swing.JPanel();
        LSearch = new javax.swing.JLabel();
        TFSearch2 = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane = new javax.swing.JScrollPane();
        jPanel8 = new javax.swing.JPanel();
        kualaLumpur = new javax.swing.JButton();
        seberangJaya = new javax.swing.JButton();
        putrajaya = new javax.swing.JButton();
        sibu = new javax.swing.JButton();
        bintulu = new javax.swing.JButton();
        serdang = new javax.swing.JButton();
        TFSearch = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        createBank = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        FrameResult.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        FrameResult.setMinimumSize(new java.awt.Dimension(392,690));
        FrameResult.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(198, 44, 44));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(375, 650));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setBorder(null);
        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));

        PanelSearch.setBackground(new java.awt.Color(255, 255, 254));
        PanelSearch.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        PanelSearch.setPreferredSize(new java.awt.Dimension(219, 81));
        PanelSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PanelSearchMouseClicked(evt);
            }
        });

        LSearch.setBackground(new java.awt.Color(255, 255, 255));
        LSearch.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        LSearch.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout PanelSearchLayout = new javax.swing.GroupLayout(PanelSearch);
        PanelSearch.setLayout(PanelSearchLayout);
        PanelSearchLayout.setHorizontalGroup(
            PanelSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE)
        );
        PanelSearchLayout.setVerticalGroup(
            PanelSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelSearchLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(LSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(PanelSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(PanelSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 632, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel15);

        TFSearch2.setBackground(new java.awt.Color(244, 211, 211));
        TFSearch2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFSearch2ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(255, 63, 63));
        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Create Blood Bank");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sdp/Images/search black.png"))); // NOI18N
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel9.setText("Search Donor");

        jLabel10.setFont(new java.awt.Font("Raleway ExtraBold", 1, 20)); // NOI18N
        jLabel10.setText("Blood Bank List");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(TFSearch2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton7))
                    .addComponent(jLabel9)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(7, 7, 7)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TFSearch2)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jLabel7.setFont(new java.awt.Font("Raleway ExtraBold", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sdp/Images/arrow return.png"))); // NOI18N
        jLabel7.setText("Manage Blood Bank");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sdp/Images/iPhone Status bar.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        FrameResult.getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(198, 44, 44));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Raleway ExtraBold", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sdp/Images/arrow return.png"))); // NOI18N
        jLabel1.setText("Manage Blood Bank");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(375, 575));

        jScrollPane.setBorder(null);
        jScrollPane.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setPreferredSize(new java.awt.Dimension(375, 700));

        kualaLumpur.setBackground(new java.awt.Color(255, 255, 254));
        kualaLumpur.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        kualaLumpur.setText("Hospital Kuala Lumpur");
        kualaLumpur.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        kualaLumpur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kualaLumpurActionPerformed(evt);
            }
        });

        seberangJaya.setBackground(new java.awt.Color(255, 255, 254));
        seberangJaya.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        seberangJaya.setText("Hospital Seberang Jaya");
        seberangJaya.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        seberangJaya.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seberangJayaActionPerformed(evt);
            }
        });

        putrajaya.setBackground(new java.awt.Color(255, 255, 254));
        putrajaya.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        putrajaya.setText("Hospital Putrajaya");
        putrajaya.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        putrajaya.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                putrajayaActionPerformed(evt);
            }
        });

        sibu.setBackground(new java.awt.Color(255, 255, 254));
        sibu.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        sibu.setText("Hospital Sibu");
        sibu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sibu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sibuActionPerformed(evt);
            }
        });

        bintulu.setBackground(new java.awt.Color(255, 255, 254));
        bintulu.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        bintulu.setText("Hospital Bintulu");
        bintulu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bintulu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bintuluActionPerformed(evt);
            }
        });

        serdang.setBackground(new java.awt.Color(255, 255, 254));
        serdang.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        serdang.setText("Hospital Serdang");
        serdang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        serdang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serdangActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bintulu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                    .addComponent(kualaLumpur, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(seberangJaya, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(putrajaya, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sibu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(serdang, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kualaLumpur, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(seberangJaya, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(putrajaya, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(sibu, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bintulu, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(serdang, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90))
        );

        jScrollPane.setViewportView(jPanel8);

        TFSearch.setBackground(new java.awt.Color(244, 211, 211));
        TFSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFSearchActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sdp/Images/search black.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Raleway ExtraBold", 1, 20)); // NOI18N
        jLabel4.setText("Blood Bank List");

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel6.setText("Search Donor");

        createBank.setBackground(new java.awt.Color(255, 63, 63));
        createBank.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        createBank.setForeground(new java.awt.Color(255, 255, 255));
        createBank.setText("Create Blood Bank");
        createBank.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBankActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(TFSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(createBank, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TFSearch)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(createBank, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sdp/Images/iPhone Status bar.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
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

    private void TFSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFSearchActionPerformed

    private void kualaLumpurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kualaLumpurActionPerformed
        bloodbankName = kualaLumpur.getText();
        
        BloodBank newBloodBank = new BloodBank(bloodbankName);
        EditBloodBank editBloodBank = new EditBloodBank(newBloodBank);
        editBloodBank.setVisible(true);
        dispose();
    }//GEN-LAST:event_kualaLumpurActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        String getSearch = TFSearch.getText();

        try {
            String url = new DatabaseURL().getURL();

            Connection connection = DriverManager.getConnection(url);
            String sql = "SELECT * FROM BloodBank WHERE BloodBank_name=?";

            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, getSearch);
            ResultSet result = statement.executeQuery();

            if (result.next()) {
                FrameResult.setVisible(true);
                LSearch.setText(result.getString("BloodBank_name"));

            } else {
                JOptionPane.showMessageDialog(this, "Blood bank not found. Please try again");
            }

            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jLabel3MouseClicked

    private void createBankActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBankActionPerformed
        CreateBloodBank createBloodBank = new CreateBloodBank(bloodbank);
        createBloodBank.setVisible(true);
        dispose();
    }//GEN-LAST:event_createBankActionPerformed

    private void TFSearch2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFSearch2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFSearch2ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        AdminMainMenu adminMainMenu = new AdminMainMenu(bloodbank);
        adminMainMenu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        AdminMainMenu adminMainMenu = new AdminMainMenu(bloodbank);
        adminMainMenu.setVisible(true);
        this.dispose();
        FrameResult.setVisible(false);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void seberangJayaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seberangJayaActionPerformed
        bloodbankName = seberangJaya.getText();
        
        BloodBank newBloodBank = new BloodBank(bloodbankName);
        EditBloodBank editBloodBank = new EditBloodBank(newBloodBank);
        editBloodBank.setVisible(true);
        dispose();
    }//GEN-LAST:event_seberangJayaActionPerformed

    private void putrajayaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_putrajayaActionPerformed
        bloodbankName = putrajaya.getText();
        
        BloodBank newBloodBank = new BloodBank(bloodbankName);
        EditBloodBank editBloodBank = new EditBloodBank(newBloodBank);
        editBloodBank.setVisible(true);
        dispose();
    }//GEN-LAST:event_putrajayaActionPerformed

    private void sibuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sibuActionPerformed
        bloodbankName = sibu.getText();
        
        BloodBank newBloodBank = new BloodBank(bloodbankName);
        EditBloodBank editBloodBank = new EditBloodBank(newBloodBank);
        editBloodBank.setVisible(true);
        dispose();
    }//GEN-LAST:event_sibuActionPerformed

    private void bintuluActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bintuluActionPerformed
        bloodbankName = bintulu.getText();
        
        BloodBank newBloodBank = new BloodBank(bloodbankName);
        EditBloodBank editBloodBank = new EditBloodBank(newBloodBank);
        editBloodBank.setVisible(true);
        dispose();
    }//GEN-LAST:event_bintuluActionPerformed

    private void serdangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serdangActionPerformed
        bloodbankName = serdang.getText();
        
        BloodBank newBloodBank = new BloodBank(bloodbankName);
        EditBloodBank editBloodBank = new EditBloodBank(newBloodBank);
        editBloodBank.setVisible(true);
        dispose();
    }//GEN-LAST:event_serdangActionPerformed

    private void PanelSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelSearchMouseClicked
        bloodbankName = LSearch.getText();
        
        BloodBank newBloodBank = new BloodBank(bloodbankName);
        EditBloodBank editBloodBank = new EditBloodBank(newBloodBank);
        editBloodBank.setVisible(true);
        dispose();
    }//GEN-LAST:event_PanelSearchMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame FrameResult;
    private javax.swing.JLabel LSearch;
    private javax.swing.JPanel PanelSearch;
    private javax.swing.JTextField TFSearch;
    private javax.swing.JTextField TFSearch2;
    private javax.swing.JButton bintulu;
    private javax.swing.JButton createBank;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton kualaLumpur;
    private javax.swing.JButton putrajaya;
    private javax.swing.JButton seberangJaya;
    private javax.swing.JButton serdang;
    private javax.swing.JButton sibu;
    // End of variables declaration//GEN-END:variables
}
