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
import view.frmDeleteContract;
import view.frmDeletePeriod;

/**
 *
 * @author Luis
 */
class DeletePeriodController {
    frmDeletePeriod view;
    public DeletePeriodController(Sys system, Admin admin) {
        view = new frmDeletePeriod();
        this.view.btnDelete.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // delete
                PeriodController fr = new PeriodController(system, admin);
                view.dispose();
                fr.run();
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
    }
    
    public void run(){
        this.view.setLocationRelativeTo(null);
        this.view.setVisible(true);
    }
}
