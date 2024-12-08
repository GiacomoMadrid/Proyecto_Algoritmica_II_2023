/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import Model.Person;
import Model.Sys;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.frmCreateAttendance;

/**
 *
 * @author Luis
 */
class CreateAttendanceController {
    frmCreateAttendance view;
    Person person;
    public CreateAttendanceController(Sys system, Person p) {
        person = p;
        view = new frmCreateAttendance();
        setLabels();
        this.view.btnCreate.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AttendanceController fr = new AttendanceController(system);
                view.dispose();
                fr.run();
            }
        });
        this.view.btnCancel.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AttendanceController fr = new AttendanceController(system);
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
        view.lblDni.setText(person.getDni());
        view.lblSurnameF.setText(person.getSurnameF());
        view.lblSurnameM.setText(person.getSurnameM());
        view.lblName.setText(person.getName());
    }
}
