/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import Model.Admin;
import Model.Employee;
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
class UsersController {
    frmUsers view;
    Sys system;
    Admin admin;
    public UsersController (Sys system, Admin admin) {
        view = new frmUsers();
        this.system = system;
        this.admin = admin;
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
                CreateUserController fr = new CreateUserController(system, admin);
                view.dispose();
                fr.run();
            }
        });
        this.view.btnUpdate.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                UpdateUserController fr = new UpdateUserController(system, admin, new Employee());
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
                DeleteUserController fr = new DeleteUserController(system, admin, new Employee());
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
        model.addColumn("Apellido Paterno");
        model.addColumn("Apellido Materno");
        model.addColumn("Nombre");
        model.addColumn("Cargo");
        model.addColumn("Fecha de Nacimiento");
        model.addColumn("Celular");
        model.addColumn("User");
        for (int i = 0; i < emp.length; i++) {
            System.out.println(emp[i]);
            model.addRow(new Object[]{i+1, emp[i].getDni(), emp[i].getSurnameF(), emp[i].getSurnameM(), emp[i].getName(), emp[i].getPosition(), formatDate.format(emp[i].getBirth()), emp[i].getPhone(), emp[i].getUser()}); 
        }
        this.view.tblResult.setModel(model);
    }
}
