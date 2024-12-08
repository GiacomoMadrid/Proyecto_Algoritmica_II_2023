/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;

/**
 *
 * @author jorgektch
 */
public class Attendance {
    private String idAttendance;
    private Day day;
    private String registerTypeES;
    private Date registerDateTime; // Datetime is not a class
    private char attendanceState;
    
    public Attendance(String idAttendance, Day day, String registerTypeES, Date registerDateTime, char attendanceState) {
        this.idAttendance = idAttendance;
        this.day = day;
        this.registerTypeES = registerTypeES;
        this.registerDateTime = registerDateTime;
        this.attendanceState = attendanceState;
    }
    
    public String getIdAttendance() {
        return idAttendance;
    }
    
    public void setIdAttendance(String idAttendance) {
        this.idAttendance = idAttendance;
    }
    
    public char getAttendanceState() {
        return attendanceState;
    }

    public void setAttendanceState(char attendanceState) {
        this.attendanceState = attendanceState;
    }

    public Day getDay() {
        return day;
    }

    public void setDay(Day day) {
        this.day = day;
    }

    public String getRegisterTypeES() {
        return registerTypeES;
    }

    public void setRegisterTypeES(String registerTypeES) {
        this.registerTypeES = registerTypeES;
    }

    public Date getRegisterDateTime() {
        return registerDateTime;
    }

    public void setRegisterDateTime(Date registerDateTime) {
        this.registerDateTime = registerDateTime;
    }
    
}
