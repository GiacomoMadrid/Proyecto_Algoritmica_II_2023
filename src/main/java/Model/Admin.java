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
public class Admin extends Person {
    
    public Admin() {
        
    }
    public Admin(String dni, String surnameF, String surnameM, String name, Date birth, String phone, String position) {
        super(dni, surnameF, surnameM, name, birth, phone, position);
    }
    public Admin(String dni, String surnameF, String surnameM, String name, Date birth, String phone, String position, String user, String password) {
        super(dni, surnameF, surnameM, name, birth, phone, position, user, password);
    }
    public Employee registerEmployee(Employee e) {
        e.setDniAdmin(this.getDni());
        return e;
    }
    public Employee registerContract(Employee e, Contract c) {
        if (e.appendContract(c)) {
            return e;
        }
        return null;
    }
    public Employee registerSchedule(Employee e, Contract c, Period p) {
        // TODO: register a schedule for a contract in a specific period
        if (e.registerPeriod(c, p)) {
            return e;
        }
        return null;
    }
    public boolean registerDay(Period p, Day d) {
        return true;
    }
    public Period checkSchedule(String dni) {
        // TODO: searches for the schedule of the Employee whose dni is equal to a given dni
        return null;
    }
}
