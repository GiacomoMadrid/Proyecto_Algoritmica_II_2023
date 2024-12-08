package Model;

public class Sys {
    private Person[] people;
    private int index;
    
    public Sys() {
        people = new Person[5];
        index = 0;
    }
    
    public boolean appendEmployee(Admin a, Employee e) {
        if (searchPerson(e.getDni())!=null) {
            return false;
        }
        Employee aux = a.registerEmployee(e);
        appendPerson(aux);
        return true;
    }
    
    public boolean appendAdmin(Admin a) {
        if (searchPerson(a.getDni())!=null) {
            return false;
        }
        appendPerson(a);
        return true;
    }
    
    private void appendPerson(Person p) {
        if (arrayFull()) {
            growArray();
        }
        people[index] = p;
        index++;
    }

    public boolean removeEmployee(String dni) {
        if (searchPerson(dni)!=null) {
            int position = -1;
            for (int i = 0; i < index; i++) {
                if (people[i].getDni().equals(dni)) {
                    position = i;
                    break;
                }
            }
            removePerson(position);
            return true;
        }
        return false;
    }

    public boolean removeAdmin(String dni) {
        if (searchPerson(dni)!=null) {
            int position = -1;
            for (int i = 0; i < index; i++) {
                if (people[i].getDni().equals(dni)) {
                    position = i;
                    break;
                }
            }
            removePerson(position);
            return true;
        }
        return false;
    }

    private void removePerson(int position) {
        for (int i = position; i < index - 1; i++) {
            people[i] = people[i + 1];
        }
        people[index - 1] = null;
        index--;
    }
    
    public Person searchPerson(String dni) {
        for (int i = 0; i < index; i++) {
            if (people[i].getDni().equals(dni)) {
                return people[i];
            }
        }
        return null;
    }
    
    public Person searchPerson(String user, String password) {
        for (int i = 0; i < index; i++) {
            if (people[i].getUser().equals(user) && people[i].getPassword().equals(password)) {
                people[i].logIn();
                return people[i];
            }
        }
        return null;
    }
    
    private void growArray() {
        Person[] aux = new Person[people.length + 1];
        for (int i = 0; i < index; i++) {
            aux[i] = people[i];
        }
        people = aux;
    }
    
    public void registerContract(Admin a, Employee e, Contract c) {
        for(int i=0; i<index; i++) {
            if (people[i].equals(e)) {
                people[i] = a.registerContract(e, c);
                return;
            }
        }
    }
    public void registerPeriod(Admin a, Employee e, Contract c, Period p) {
        for(int i=0; i<index; i++) {
            if (people[i].equals(e)) {
                people[i] = a.registerSchedule(e, c, p);
                return;
            }
        }
    }
    
    private boolean arrayFull() {
        return index == people.length;
    }
    
    public void logIn(Person person) {
        for(int i=0; i<index; i++) {
            if (people[i].equals(person)) {
                people[i].logIn();
            }
        }
    }
    public Employee[] getEmployeesByAdmin(Admin admin) {
        Employee[] emp = new Employee[0];
        int size = 0;
        for(int i=0; i<index; i++) {
            if (people[i] instanceof Employee) {
                if (((Employee) people[i]).getDniAdmin().equals(admin.getDni())) {
                    Employee[] aux = new Employee[size+1];
                    for (int j = 0; j < size; j++) {
                        aux[j] = emp[j];
                    }
                    aux[size] = (Employee)people[i];
                    size++;
                    emp = aux;
                }
            }
        }
        return emp;
    }
}
