/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import Model.Person;
import Model.Sys;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import view.frmAttendance;
/**
 *
 * @author Luis
 */
public class AttendanceController {
    frmAttendance view;
    public AttendanceController(Sys system) {
        this.view = new frmAttendance();
        setLabels();
        this.view.btnCreate.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Person p = system.searchPerson(view.txtDni.getText());
                if (p != null) {
                    CreateAttendanceController fr = new CreateAttendanceController(system, p);
                    view.dispose();
                    fr.run();
                } else {
                    System.out.println("No hay user");
                }
            }
        });
        this.view.btnExit.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainController fr = new MainController(system);
                view.dispose();
                fr.run();
            }
        });
        
    }
    public void run() {
        this.view.setLocationRelativeTo(null);
        this.view.setVisible(true);
    }
    public void setLabels() {
        SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat formatTime = new SimpleDateFormat("hh:mm:ss a");
        this.view.lblDate.setText(formatDate.format(new Date()));
        this.view.lblTime.setText(formatTime.format(new Date()).toUpperCase());
    }
}
