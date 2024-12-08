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
import view.frmUpdateContract;

/**
 *
 * @author Luis
 */
class UpdateContractController {
    frmUpdateContract view;
    public UpdateContractController(Sys system, Admin admin, Employee emp) {
        view = new frmUpdateContract();
        this.view.btnUpdate.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // update
                ContractController fr = new ContractController(system, admin);
                view.dispose();
                fr.run();
            }
        });
        this.view.btnCancel.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // update
                ContractController fr = new ContractController(system, admin);
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
