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
public class Employee extends Person {
    private String dniAdmin; // DNI del admin que lo registra
    private Contract[] contracts;
    private int indexContracts;
    
    public Employee() {
        contracts = new Contract[5];
        indexContracts = 0;
    }
    public Employee(String dni, String surnameF, String surnameM, String name, Date birth, String phone, String position) {
        super(dni, surnameF, surnameM, name, birth, phone, position);
        contracts = new Contract[5];
        indexContracts = 0;
    }
    public Employee(String dni, String surnameF, String surnameM, String name, Date birth, String phone, String position, String user, String password) {
        super(dni, surnameF, surnameM, name, birth, phone, position, user, password);
        contracts = new Contract[5];
        indexContracts = 0;
    }
    public Period checkSchedule(Contract c) {
        // TODO: print schedule
        
        return null;
    }
    
    public boolean appendContract(Contract c) {
        if (searchContract(c)) {
            return false;
        }
        if (isFullContracts()) {
            growArray();
            appendContract(c);
        }
        contracts[indexContracts] = c;
        indexContracts++;
        return true;
    }
    
    public boolean registerPeriod(Contract c, Period p) {
        for (int i = 0; i < indexContracts; i++) {
            if (contracts[i].equals(c)) {
                contracts[i].appendPeriod(p);
                return true;
            }
        }
        return false;
    }
    
    public boolean searchContract(Contract c) {
        for (int i = 0; i < indexContracts; i++) {
            if (contracts[i].equals(c)) {
                return true;
            }
        }
        return false;
    }
    public Contract searchContract(String id) {
        for (int i = 0; i < indexContracts; i++) {
            if (contracts[i].getIdContract().equals(id)) {
                return contracts[i];
            }
        }
        return null;
    }

    public String getDniAdmin() {
        return dniAdmin;
    }

    public void setDniAdmin(String dniAdmin) {
        this.dniAdmin = dniAdmin;
    }
    private void growArray() {
        Contract[] aux = new Contract[contracts.length + 1];
        for (int i = 0; i < indexContracts; i++) {
            aux[i] = contracts[i];
        }
        contracts = aux;
    }
    private boolean isFullContracts() {
        return indexContracts == contracts.length;
    }
    public Contract[] getContracts() {
        return this.contracts;
    }
    public int getIndex() {
        return indexContracts;
    }
}
