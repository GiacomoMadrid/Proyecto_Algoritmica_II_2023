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
import java.text.SimpleDateFormat;
import javax.swing.table.DefaultTableModel;
import view.frmUsers;

/**
 *
 * @author Luis
 */
public class PeriodController {
    frmUsers view;
    Sys system;
    Admin admin;
    public PeriodController (Sys system, Admin admin) {
        view = new frmUsers();
        this.system = system;
        this.admin = admin;
        Employee[] emp = system.getEmployeesByAdmin(admin);
        fillTable();
        this.view.btnSearch.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // search a person ...
            }
        });
        this.view.btnCreate.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CreatePeriodController fr = new CreatePeriodController(system, admin, emp);
                view.dispose();
                fr.run();
            }
        });
        this.view.btnUpdate.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                UpdatePeriodController fr = new UpdatePeriodController(system, admin);
                view.dispose();
                fr.run();
            }
        });
        this.view.btnExit.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AdminController fr = new AdminController(system, admin);
                view.dispose();
                fr.run();
            }
        });
        this.view.btnDelete.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DeletePeriodController fr = new DeletePeriodController(system, admin);
                view.dispose();
                fr.run();
            }
        });
    }
    public void run(){
        this.view.setLocationRelativeTo(null);
        this.view.setVisible(true);
    }
    public void fillTable() {
        SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy");
        
        Employee[] emp = system.getEmployeesByAdmin(admin);
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("#");
        model.addColumn("DNI");
        model.addColumn("Codigo de Contrato");
        model.addColumn("Codigo de Periodo");
        model.addColumn("Fecha Inicio");
        model.addColumn("Fecha final");
        model.addColumn("# Dias");
        for (int i = 0; i < emp.length; i++) {
            for (int j = 0; j < emp[i].getIndex(); j++) {
                Contract[] contracts = emp[i].getContracts();
                for (int k = 0; k < contracts[j].getIndex(); k++) {
                    Period[] periods = contracts[j].getPeriods();
                    model.addRow(new Object[]{i+j+k+1, emp[i].getDni(), contracts[j].getIdContract(), periods[k].getIdPeriod(), periods[k].getBeginDate().toString(), periods[k].getEndDate(), periods[k].getNumDays()});              
                }
            }
        }
        this.view.tblResult.setModel(model);
    }
}
