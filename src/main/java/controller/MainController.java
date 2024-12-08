/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import Model.Sys;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.AsistenciaFrame;

/**
 *
 * @author Luis
 */
public class MainController {
    AsistenciaFrame view;
    public MainController(Sys system) {
        this.view = new AsistenciaFrame();
        this.view.btnLogin.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LoginController logController = new LoginController(system);
                view.dispose();
                logController.run();
            }
        });
        this.view.btnAttendance.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AttendanceController attController = new AttendanceController(system);
                view.dispose();
                attController.run();
            }
        });
        
    }
    public void run(){
        this.view.setLocationRelativeTo(null);
        this.view.setVisible(true);
    }
}
