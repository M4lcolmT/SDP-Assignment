/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sdp;


public class DatabaseURL {
    private String url = "jdbc:sqlserver://LAPTOP-8VG4L8ND;databaseName=SDPAssignment;user=sa;password=password;encrypt=false";
    
    public DatabaseURL(){
        this.url = url;
    }
    
    public String getURL(){
        return url;
    }
}
