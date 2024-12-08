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
import java.util.Date;
import view.frmCreateUser;

/**
 *
 * @author Luis
 */
public class CreateUserController {
    frmCreateUser view;
    public CreateUserController(Sys system, Admin admin) {
        this.view = new frmCreateUser();
        this.view.btnCreate.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Creates employee
                Employee emp = create();
                system.appendEmployee(admin, emp);
                System.out.println("Añadido");
                UsersController fr = new UsersController(system, admin);
                view.dispose();
                fr.run();
            }
        });
        this.view.btnCancel.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                UsersController fr = new UsersController(system, admin);
                view.dispose();
                fr.run();
            }
        });
    }
    public void run(){
        this.view.setLocationRelativeTo(null);
        this.view.setVisible(true);
    }
    public Employee create() {
        String dni = this.view.txtDni.getText();
        String surnameF = this.view.txtSurnameF.getText();
        String surnameM = this.view.txtSurnameM.getText();
        String name = this.view.txtName.getText();
        String birth = this.view.txtBirth.getText();
        String phone = this.view.txtPhone.getText();
        String position = this.view.txtPosition.getText();
        String user = this.view.txtUser.getText();
        String pass = this.view.txtPassword.getText();
        return new Employee(dni, surnameF, surnameM, name, new Date(birth), phone, position, user, pass);
    }
}
