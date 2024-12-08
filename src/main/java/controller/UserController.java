/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import Model.Employee;
import Model.Sys;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.UserFrame;

/**
 *
 * @author Luis
 */
public class UserController {
    UserFrame view = new UserFrame();
    Employee emp;
    public UserController(Sys system, Employee emp) {
        this.emp = emp;
        setLabels();
        this.view.btnLogOut.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LoginController login = new LoginController(system);
                view.dispose();
                login.run();
            }
        });
    }
    public void setLabels() {
        this.view.lblUserCargo.setText(this.emp.getPosition());
        this.view.lblUserMaterno.setText(this.emp.getSurnameM());
        this.view.lblUserPaterno.setText(this.emp.getSurnameF());
        this.view.lblUserDNI.setText(this.emp.getDni());
        this.view.lblUserCelular.setText(this.emp.getPhone());
        this.view.lblUserCorreo.setText(this.emp.getUser());
    }
    public void run(){
        this.view.setLocationRelativeTo(null);
        this.view.setVisible(true);
    }
}
