/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import Model.Admin;
import Model.Sys;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.AdminFrame;

/**
 *
 * @author Luis
 */
public class AdminController {
    AdminFrame view = new AdminFrame();
    Admin admin;
    public AdminController(Sys system, Admin admin) {
        this.admin = admin;
        setLabels();
        this.view.btnLogOut.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LoginController login = new LoginController(system);
                view.dispose();
                login.run();
            }
        });
        this.view.btnRegistroUsuarios.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                UsersController fr = new UsersController(system, admin);
                view.dispose();
                fr.run();
            }
        });
        this.view.btnRegistroContratos.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ContractController fr = new ContractController(system, admin);
                view.dispose();
                fr.run();
            }
        });
        this.view.btnRegistroHorarios.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PeriodController fr = new PeriodController(system, admin);
                view.dispose();
                fr.run();
            }
        });
    }
    public void setLabels() {
        this.view.lblAdminCargo.setText(this.admin.getPosition());
        this.view.lblAdminMaterno.setText(this.admin.getSurnameM());
        this.view.lblAdminPaterno.setText(this.admin.getSurnameF());
        this.view.lblAdminDNI.setText(this.admin.getDni());
        this.view.lblAdminCelular.setText(this.admin.getPhone());
        this.view.lblAdminCorreo.setText(this.admin.getUser());
    }
    public void run(){
        this.view.setLocationRelativeTo(null);
        this.view.setVisible(true);
    }
}
