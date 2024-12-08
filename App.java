
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
        system.appendEmployee(luis, new Employee("04575245", "Garcia", "Torres", "Diego David", new Date(), "974859621", "Developer", "DAM", "10001"));
        system.appendEmployee(luis, new Employee("01926741", "Velasquez", "Madrid", "Daniel Manuel", new Date(), "917859655", "Developer", "Miau", "14587"));
        system.appendEmployee(luis, new Employee("02926721", "Avendaño", "Meza", "Miguel Jose", new Date(), "928172634", "Developer", "", "4321"));
        system.appendEmployee(luis, new Employee("04064646", "Spencer", "Nathan", "Pedro Luis", new Date(), "978995995", "Developer", "justinjones", "2558258"));
        system.appendEmployee(luis, new Employee("06468466", "Cantrell", "Jacqueline", "Carlos Daniel", new Date(), "975842581", "Developer", "lance97", "G22Ze"));      
        system.appendEmployee(luis, new Employee("52468848", "Hernandez", "Thomas", "Otto Fabrizzio", new Date(), "2373572063", "Developer", "megan45", "Tq7Hlb4"));
        system.appendEmployee(luis, new Employee("11714866", "Garcia", "Juan", "Manuel", new Date(), "985748991", "Developer", "bfowler", "Ni70tVl"));
        system.appendEmployee(luis, new Employee("93479793", "Cortez", "Ethan", "Sila Lucia", new Date(), "(952818357", "Developer", "derrickjohnson", "gD1ONpf"));
        system.appendEmployee(luis, new Employee("21782892", "Martinez", "Denise", "Sebastian", new Date(), "918595996", "Developer", "howellmichael", "wl8EKwq"));     
        system.appendEmployee(luis, new Employee("19183939", "Klein", "Sara", "Jorge", new Date(), "925175638", "Developer", "annbryan", "2r6W^x"));
        system.appendEmployee(luis, new Employee("22518299", "Martin", "Jennifer", "", new Date(), "915784669", "Developer", "richardsjoseph", "uQ$o9Mq"));
        MainController controller = new MainController(system);
        controller.run();
    }
}
