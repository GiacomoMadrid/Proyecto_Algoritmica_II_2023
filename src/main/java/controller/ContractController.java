/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import Model.Admin;
import Model.Contract;
import Model.Employee;
import Model.Sys;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import javax.swing.table.DefaultTableModel;
import view.frmContracts;

/**
 *
 * @author Luis
 */
public class ContractController {
    frmContracts view;
    Sys system;
    Admin admin;
    public ContractController (Sys system, Admin admin) {
        view = new frmContracts();
        this.system = system;
        this.admin = admin;
        Employee[] emp = system.getEmployeesByAdmin(admin);
        fillTable(emp);
        this.view.btnSearch.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // search a person ...
                
            }
        });
        this.view.btnCreate.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CreateContractController fr = new CreateContractController(system, admin, emp);
                view.dispose();
                fr.run();
            }
        });
        this.view.btnUpdate.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                UpdateContractController fr = new UpdateContractController(system, admin, new Employee());
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
                DeleteContractController fr = new DeleteContractController(system, admin, new Employee(), new Contract());
                view.dispose();
                fr.run();
            }
        });
    }
    public void run(){
        this.view.setLocationRelativeTo(null);
        this.view.setVisible(true);
    }
    public void fillTable(Employee[] emp) {
        SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy");
        
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("#");
        model.addColumn("Codigo de Contrato");
        model.addColumn("Fecha Firma");
        model.addColumn("Fecha Inicio");
        model.addColumn("Fecha Fin");
        model.addColumn("Estado");
        model.addColumn("Salario");
        for (int i = 0; i < emp.length; i++) {
            Contract[] contracts = emp[i].getContracts();
            for (int j = 0; j < emp[i].getIndex(); j++) {
                model.addRow(new Object[]{i+j+1, contracts[j].getIdContract(), formatDate.format(contracts[j].getSignDate()), formatDate.format(contracts[j].getBeginDate()), formatDate.format(contracts[j].getEndDate()), contracts[j].isActiveState(), contracts[j].getSalary()});             
            }
        }
        this.view.tblResult.setModel(model);
    }
}
