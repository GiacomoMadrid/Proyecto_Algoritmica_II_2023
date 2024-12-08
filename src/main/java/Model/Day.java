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
public class Day {
    private String idDay;
    private String name;
    private Date date;
    private String startTime;
    private String endTime;
    private int toleranceMinutes;
    private boolean holiday;

    public Day(String idDay, String name, Date date, String startTime, String endTime, int toleranceMinutes, boolean isHoliday) {
        this.idDay = idDay;
        this.name = name;
        this.date = date;
        this.startTime = startTime;
        this.endTime = endTime;
        this.toleranceMinutes = toleranceMinutes;
        this.holiday = isHoliday;
    }
    
    public String getIdDay() {
        return idDay;
    }

    public void setIdDay(String idDay) {
        this.idDay = idDay;
    }
    
    public int getWorkHours() {
        // TODO: calculates work hours
        return 0;
    }
    
    public boolean isHoliday() {
        return holiday;
    }

    public void setIsHoliday(boolean isHoliday) {
        this.holiday = isHoliday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public int getToleranceMinutes() {
        return toleranceMinutes;
    }

    public void setToleranceMinutes(int toleranceMinutes) {
        this.toleranceMinutes = toleranceMinutes;
    }
    
}
