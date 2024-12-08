
import Model.Admin;
import Model.Employee;
import Model.Sys;
import controller.MainController;
import java.util.Date;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jorgektch
 */
public class App {
    public static void main(String[] args) {
        Sys system = new Sys();
        Admin luis = new Admin("72682166", "La Torre", "Romero", "Jose Luis", new Date(), "941831923", "Software Engineer", "LuisLT", "1234");
        system.appendAdmin(luis);
        system.appendEmployee(luis, new Employee("02926721", "Avendaño", "Meza", "Ever Frank", new Date(), "928172634", "Developer", "nessoDev", "4321"));
        MainController controller = new MainController(system);
        controller.run();
    }
}
