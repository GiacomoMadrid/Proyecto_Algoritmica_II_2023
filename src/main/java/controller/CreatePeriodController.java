/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import Model.Admin;
import Model.Contract;
import Model.Employee;
import Model.Period;
import Model.Sys;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import view.frmCreatePeriod;

/**
 *
 * @author Luis
 */
class CreatePeriodController {
    frmCreatePeriod view;
    Employee employee;
    Sys system;
    Admin admin;
    public CreatePeriodController(Sys sys, Admin a, Employee[] emp) {
        view = new frmCreatePeriod();
        this.system = sys;
        this.admin = a;
        this.view.btnCreate.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // create ...
                if (employee!=null) {
                    String codeContract = view.txtCodeContract.getText();
                    String codePeriod = view.txtCodePeriod.getText();
                    String begin = view.txtBeginDate.getText();
                    String end = view.txtEndDate.getText();
                    Contract c = employee.searchContract(codeContract);
                    if (c!=null) {
                        Period p = new Period(codePeriod, new Date(begin), new Date(end), 20);
                        system.registerPeriod(admin, employee, c, p);
                        PeriodController fr = new PeriodController(system, admin);
                        view.dispose();
                        fr.run();
                    } else {
                        System.out.println("No hay contract");
                    }
                }
            }
        });
        this.view.btnCancel.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PeriodController fr = new PeriodController(system, admin);
                view.dispose();
                fr.run();
            }
        });
        this.view.btnSearch.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String dni = view.txtDni.getText();
                employee = getUserDni(dni);
                if (employee!=null) {
                    view.lblFullName.setText(employee.getSurnameF() + " " + employee.getName());
                } else {
                    view.lblFullName.setText("No se encuentró registro");
                }
            }
        });
    }
    public void run(){
        this.view.setLocationRelativeTo(null);
        this.view.setVisible(true);
    }
    private Employee getUserDni(String dni) {
        Employee[] emp = system.getEmployeesByAdmin(admin);
        for (int i = 0; i < emp.length; i++) {
            if (emp[i].getDni().equals(dni)) {
                return emp[i];
            }
        }
        return null;
    }
}
