/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import Model.Admin;
import Model.Sys;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.frmUpdatePeriod;

/**
 *
 * @author Luis
 */
class UpdatePeriodController {
    frmUpdatePeriod view;
    public UpdatePeriodController(Sys system, Admin admin) {
        view = new frmUpdatePeriod();
        this.view.btnUpdate.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // update
                PeriodController fr = new PeriodController(system, admin);
                view.dispose();
                fr.run();
            }
        });
        this.view.btnCancel.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // update
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
