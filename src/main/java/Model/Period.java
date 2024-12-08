/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;
import java.util.Calendar;

/**
 *
 * @author jorgektch
 */
public class Period {
    private String idPeriod;
    private Date beginDate;
    private Date endDate;
    private int numDays;
    private Day[] days;
    private int index;

    public Period(String idPeriod, Date beginDate, Date endDate, int numDays) {
        this.idPeriod = idPeriod;
        this.beginDate = beginDate;
        this.endDate = endDate;
        this.numDays = numDays;
        this.days = new Day[5];
        this.index = 0;
    }

    public String getIdPeriod() {
        return idPeriod;
    }

    public void setIdPeriod(String idPeriod) {
        this.idPeriod = idPeriod;
    }
    
    public boolean appendDay(Day d) {
        if (searchDay(d)) {
            return false;
        }
        if (isFullDays()) {
            growArray();
            appendDay(d);
        }
        days[index] = d;
        index++;
        return true;
    }
    
    public boolean searchDay(Day d) {
        for (int i = 0; i < index; i++) {
            if (days[i].equals(d)) {
                return true;
            }
        }
        return false;
    }
    
    public Day checkDay(Date d) {
        return null;
    }
    
    private void growArray() {
        Day[] aux = new Day[days.length + 1];
        for (int i = 0; i < index; i++) {
            aux[i] = days[i];
        }
        days = aux;
    }
    
    private boolean isFullDays(){
        return index==days.length;
    }
    
    public int getNumDays() {
        return numDays;
    }

    public void setNumDays(int numDays) {
        this.numDays = numDays;
    }

    public Date getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
    
}
