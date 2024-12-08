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
public class Contract {
    private String idContract;
    private Date signDate;
    private Date beginDate;
    private Date endDate;
    private boolean activeState;
    private double salary;
    private Period[] periods;
    private int index;
    public Contract() {
        
    }
    public Contract(String idContract, Date signDate, Date beginDate, Date endDate, boolean activeState, double salary) {
        this.idContract = idContract;
        this.signDate = signDate;
        this.beginDate = beginDate;
        this.endDate = endDate;
        this.activeState = activeState;
        this.salary = salary;
        periods = new Period[5];
        index = 0;
    }
    
    public String getIdContract() {
        return idContract;
    }

    public void setIdContract(String idContract) {
        this.idContract = idContract;
    }
    
    public boolean appendPeriod(Period p) {
        if (searchPeriod(p)) {
            return false;
        }
        if (isFullPeriods()) {
            growArray();
            appendPeriod(p);
        }
        periods[index] = p;
        index++;
        return true;
    }
    public boolean searchPeriod(Period c) {
        for (int i = 0; i < index; i++) {
            if (periods[i].equals(c)) {
                return true;
            }
        }
        return false;
    }
    private void growArray() {
        Period[] aux = new Period[periods.length + 1];
        for (int i = 0; i < index; i++) {
            aux[i] = periods[i];
        }
        periods = aux;
    }
    
    private boolean isFullPeriods(){
        return index==periods.length;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Date getSignDate() {
        return signDate;
    }

    public void setSignDate(Date signDate) {
        this.signDate = signDate;
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

    public boolean isActiveState() {
        return activeState;
    }

    public void setActiveState(boolean activeState) {
        this.activeState = activeState;
    }
    public Period[] getPeriods() {
        return this.periods;
    }
    public int getIndex() {
        return this.index;
    }
}
