package sdp;

import java.util.Date;

public class AppointmentData {
    
    private String username;
    private String bloodBank_Name;
    private Date appointmentDate;
    private String appointmentTime;
    private String bloodBank_Address;
    
    public AppointmentData (String username, String bloodBank_Name, Date appointmentDate, String appointmentTime, String bloodBank_Address){
        this.username = username;
        this.bloodBank_Name = bloodBank_Name;
        this.appointmentDate = appointmentDate;
        this.appointmentTime = appointmentTime; 
        this.bloodBank_Address = bloodBank_Address;
        
    }
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getBloodBank_Name() {
        return bloodBank_Name;
    }

    public void setBloodBank_Name(String bloodBank_Name) {
        this.bloodBank_Name = bloodBank_Name;
    }

    public Date getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(Date appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public String getAppointmentTime() {
        return appointmentTime;
    }

    public void setAppointmentTime(String appointmentTime) {
        this.appointmentTime = appointmentTime;
    }

    public String getBloodBank_Address() {
        return bloodBank_Address;
    }

    public void setBloodBank_Address(String bloodBank_Address) {
        this.bloodBank_Address = bloodBank_Address;
    }
    
}
