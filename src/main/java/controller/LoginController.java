/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import Model.Admin;
import Model.Employee;
import Model.Person;
import Model.Sys;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import view.LogInFrame;

/**
 *
 * @author Luis
 */
public class LoginController {
    private LogInFrame view;
    private Sys system;
    public LoginController(Sys sys) {
        view = new LogInFrame();
        this.system = sys;
        
        this.view.logInBtn.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String user = view.userField.getText();
                String password = new String(view.passField.getPassword());
                Person p = system.searchPerson(user, password);
                if (p!=null) {
                    sys.logIn(p);
                    view.dispose();
                    if (p instanceof Admin) {
                        Admin admin = (Admin)p;
                        AdminController adminController = new AdminController(sys, admin);
                        adminController.run();
                    } else {
                        Employee emp = (Employee)p;
                        UserController userController = new UserController(sys, emp);
                        userController.run();                                         
                    }
                } else {
                    JOptionPane.showMessageDialog( view, "Credenciales invalidas" );
                }
                clearScreen();
            }
        });
        this.view.btnBack.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainController mainController = new MainController(system);
                view.dispose();
                mainController.run();
            }
        });
    }
    public void run(){
        this.view.setLocationRelativeTo(null);
        clearScreen();
        this.view.setVisible(true);
    }
    private void clearScreen() {
        view.userField.setText("");
        view.passField.setText("");
    }
}
