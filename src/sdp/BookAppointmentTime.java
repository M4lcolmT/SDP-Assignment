package sdp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

public class BookAppointmentTime extends javax.swing.JFrame {
   
    AppointmentData appointment;
    
    
    
    private String setAppointmentTime = "";
    
    public BookAppointmentTime(AppointmentData appointment) {
        initComponents();
        this.appointment = appointment;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        jLabel9 = new javax.swing.JLabel();
        jButton13 = new javax.swing.JButton();
        elevenAM = new javax.swing.JButton();
        onePM = new javax.swing.JButton();
        tenAM = new javax.swing.JButton();
        twelvePM = new javax.swing.JButton();
        fivePM = new javax.swing.JButton();
        threePM = new javax.swing.JButton();
        twoPM = new javax.swing.JButton();
        fourPM = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

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

        jLabel9.setFont(new java.awt.Font("Raleway ExtraBold", 0, 26)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Avaliable Timeslot");

        jButton13.setBackground(new java.awt.Color(198, 44, 44));
        jButton13.setFont(new java.awt.Font("Raleway ExtraBold", 0, 14)); // NOI18N
        jButton13.setForeground(new java.awt.Color(255, 255, 255));
        jButton13.setText("Confirm");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        elevenAM.setBackground(new java.awt.Color(255, 255, 254));
        elevenAM.setFont(new java.awt.Font("Raleway ExtraBold", 0, 15)); // NOI18N
        elevenAM.setForeground(new java.awt.Color(211, 42, 42));
        elevenAM.setText("11am - 12pm");
        elevenAM.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(211, 42, 42), 2));
        elevenAM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elevenAMActionPerformed(evt);
            }
        });

        onePM.setBackground(new java.awt.Color(255, 255, 254));
        onePM.setFont(new java.awt.Font("Raleway ExtraBold", 0, 15)); // NOI18N
        onePM.setForeground(new java.awt.Color(211, 42, 42));
        onePM.setText("1pm - 2pm");
        onePM.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(211, 42, 42), 2));
        onePM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onePMActionPerformed(evt);
            }
        });

        tenAM.setBackground(new java.awt.Color(255, 255, 254));
        tenAM.setFont(new java.awt.Font("Raleway ExtraBold", 0, 15)); // NOI18N
        tenAM.setForeground(new java.awt.Color(211, 42, 42));
        tenAM.setText("10am - 11am");
        tenAM.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(211, 42, 42), 2));
        tenAM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tenAMActionPerformed(evt);
            }
        });

        twelvePM.setBackground(new java.awt.Color(255, 255, 254));
        twelvePM.setFont(new java.awt.Font("Raleway ExtraBold", 0, 15)); // NOI18N
        twelvePM.setForeground(new java.awt.Color(211, 42, 42));
        twelvePM.setText("12pm - 1pm");
        twelvePM.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(211, 42, 42), 2));
        twelvePM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twelvePMActionPerformed(evt);
            }
        });

        fivePM.setBackground(new java.awt.Color(255, 255, 254));
        fivePM.setFont(new java.awt.Font("Raleway ExtraBold", 0, 15)); // NOI18N
        fivePM.setForeground(new java.awt.Color(211, 42, 42));
        fivePM.setText("5pm - 6pm");
        fivePM.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(211, 42, 42), 2));
        fivePM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fivePMActionPerformed(evt);
            }
        });

        threePM.setBackground(new java.awt.Color(255, 255, 254));
        threePM.setFont(new java.awt.Font("Raleway ExtraBold", 0, 15)); // NOI18N
        threePM.setForeground(new java.awt.Color(211, 42, 42));
        threePM.setText("3pm - 4pm");
        threePM.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(211, 42, 42), 2));
        threePM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threePMActionPerformed(evt);
            }
        });

        twoPM.setBackground(new java.awt.Color(255, 255, 254));
        twoPM.setFont(new java.awt.Font("Raleway ExtraBold", 0, 15)); // NOI18N
        twoPM.setForeground(new java.awt.Color(211, 42, 42));
        twoPM.setText("2pm - 3pm");
        twoPM.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(211, 42, 42), 2));
        twoPM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoPMActionPerformed(evt);
            }
        });

        fourPM.setBackground(new java.awt.Color(255, 255, 254));
        fourPM.setFont(new java.awt.Font("Raleway ExtraBold", 0, 15)); // NOI18N
        fourPM.setForeground(new java.awt.Color(211, 42, 42));
        fourPM.setText("4pm - 5pm");
        fourPM.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(211, 42, 42), 2));
        fourPM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourPMActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(fourPM, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(twelvePM, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tenAM, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(twoPM, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(elevenAM, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(onePM, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(threePM, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fivePM, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(38, 38, 38))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel9)
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(elevenAM, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tenAM, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(onePM, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(twelvePM, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(threePM, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(twoPM, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fourPM, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fivePM, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sdp/Images/iPhone Status bar.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Raleway ExtraBold", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sdp/Images/arrow return.png"))); // NOI18N
        jLabel2.setText(" Appointment");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        CustomerBloodBank newAppointment = new CustomerBloodBank(appointment);
        newAppointment.setVisible(true);
        dispose();
    }//GEN-LAST:event_jPanel6MouseClicked

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked
        new Profile().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jPanel4MouseClicked

    private void jPanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseClicked
        UpcomingAppointments newAppointment = new UpcomingAppointments(appointment);
        newAppointment.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jPanel5MouseClicked

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        
        DateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
        String appointmentDate = fmt.format(appointment.getAppointmentDate());
        
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
            
            stmt.setString(1, appointment.getUsername());
            stmt.setString(2, appointment.getBloodBank_Name());
            stmt.setString(3, appointmentDate);
            stmt.setString(4, setAppointmentTime);
            stmt.setString(5, appointment.getBloodBank_Address());
            // Execute the SQL INSERT statement
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(this, "Your appointment is booked!");
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
        
        
    }//GEN-LAST:event_jButton13ActionPerformed

    private void tenAMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tenAMActionPerformed
        setAppointmentTime = "10:00 AM";
    }//GEN-LAST:event_tenAMActionPerformed

    private void elevenAMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elevenAMActionPerformed
        setAppointmentTime = "11:00 AM";
    }//GEN-LAST:event_elevenAMActionPerformed

    private void twelvePMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twelvePMActionPerformed
        setAppointmentTime = "12:00 PM";
    }//GEN-LAST:event_twelvePMActionPerformed

    private void onePMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onePMActionPerformed
        setAppointmentTime = "1:00 PM";
    }//GEN-LAST:event_onePMActionPerformed

    private void twoPMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoPMActionPerformed
        setAppointmentTime = "2:00 PM";
    }//GEN-LAST:event_twoPMActionPerformed

    private void threePMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threePMActionPerformed
        setAppointmentTime = "3:00 PM";
    }//GEN-LAST:event_threePMActionPerformed

    private void fourPMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourPMActionPerformed
        setAppointmentTime = "4:00 PM";
    }//GEN-LAST:event_fourPMActionPerformed

    private void fivePMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fivePMActionPerformed
        setAppointmentTime = "5:00 PM";
    }//GEN-LAST:event_fivePMActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton elevenAM;
    private javax.swing.JButton fivePM;
    private javax.swing.JButton fourPM;
    private javax.swing.JButton jButton13;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton onePM;
    private javax.swing.JButton tenAM;
    private javax.swing.JButton threePM;
    private javax.swing.JButton twelvePM;
    private javax.swing.JButton twoPM;
    // End of variables declaration//GEN-END:variables
}
