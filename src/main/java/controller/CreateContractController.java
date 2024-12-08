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
import java.util.Date;
import view.frmCreateContract;

/**
 *
 * @author Luis
 */
public class CreateContractController {
    frmCreateContract view;
    Employee employee;
    public CreateContractController(Sys system, Admin admin, Employee[] emp) {
        view = new frmCreateContract();
        this.view.btnCreate.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // create ...
                String sign = view.txtSignDate.getText();
                String begin = view.txtBeginDate.getText();
                String end = view.txtEndDate.getText();
                boolean state = view.cmbActiveState.getSelectedIndex() == 0;
                String id = Integer.toString((int)(Math.random() * (1000 - 100 + 1)) + 100);
                double salary = Double.parseDouble(view.txtSalary.getText());
                if (employee!=null) {
                    Contract contract = new Contract(id, new Date(sign), new Date(begin), new Date(end), state, salary);
                    system.registerContract(admin, employee, contract);
                    ContractController fr = new ContractController(system, admin);
                    view.dispose();
                    fr.run();
                }
            }
        });
        this.view.btnCancel.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ContractController fr = new ContractController(system, admin);
                view.dispose();
                fr.run();
            }
        });
        this.view.btnSearch.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String dni = view.txtDni.getText();
                employee = getUserDni(dni, emp);
                if (employee!=null) {
                    view.lblFullName.setText(employee.getSurnameF() + " " + employee.getName());
                } else {
                    view.lblFullName.setText("No se encuentró registro");
                }
            }
        });
    }
    public void run(){
        this.view.setLocationRelativeTo(null);
        this.view.setVisible(true);
    }
    private Employee getUserDni(String dni, Employee[] emp) {
        for (int i = 0; i < emp.length; i++) {
            if (emp[i].getDni().equals(dni)) {
                return emp[i];
            }
        }
        return null;
    }
}
