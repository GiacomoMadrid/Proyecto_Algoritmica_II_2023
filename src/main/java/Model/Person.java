/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;

/**
 *
 * @author jorgektch
 */
public class Person {
    private String dni;
    private String surnameF;
    private String surnameM;
    private String name;
    private Date birth;
    private String user;
    private String password;
    private String phone;
    private String position;
    private boolean session;
    
    public Person() {
        
    }
    
    public Person(String dni, String surnameF, String surnameM, String name, Date birth, String phone, String position) {
        this.dni = dni;
        this.surnameF = surnameF;
        this.surnameM = surnameM;
        this.name = name;
        this.birth = birth;
        this.session = false;
        this.phone = phone;
        this.position = position;
    }

    public Person(String dni, String surnameF, String surnameM, String name, Date birth, String phone, String position, String user, String password) {
        this.dni = dni;
        this.surnameF = surnameF;
        this.surnameM = surnameM;
        this.name = name;
        this.birth = birth;
        this.user = user;
        this.password = password;
        this.session = false;
        this.phone = phone;
        this.position = position;
    }
    
    public void logIn() {
        session = true;
    }
    
    public void logOut(){
        session = false;
    }
    
    public boolean isLogged() {
        return session;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getSurnameF() {
        return surnameF;
    }

    public void setSurnameF(String surnameF) {
        this.surnameF = surnameF;
    }

    public String getSurnameM() {
        return surnameM;
    }

    public void setSurnameM(String surnameM) {
        this.surnameM = surnameM;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + '}';
    }
    
}
