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
import view.frmDeleteUser;

/**
 *
 * @author Luis
 */
class DeleteUserController {
    frmDeleteUser view;
    public DeleteUserController(Sys system, Admin admin, Employee emp) {
        view = new frmDeleteUser();
        this.view.btnDelete.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // delete
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
}
