public class EmployeeRunner {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        Employee e1 = new Employee();
        e1.setName("Ramesh");
        e1.setAge(30);
        e1.setDepartment("HR");
        e1.setCompany("Infosys");
        e1.setCity("Bangalore");
        employees[0] = e1;

        Employee e2 = new Employee();
        e2.setName("Sita");
        e2.setAge(28);
        e2.setDepartment("Finance");
        e2.setCompany("Wipro");
        e2.setCity("Mysore");
        employees[1] = e2;

        Employee e3 = new Employee();
        e3.setName("Kiran");
        e3.setAge(26);
        e3.setDepartment("IT");
        e3.setCompany("TCS");
        e3.setCity("Hubli");
        employees[2] = e3;

        Employee e4 = new Employee();
        e4.setName("Deepa");
        e4.setAge(32);
        e4.setDepartment("Marketing");
        e4.setCompany("Accenture");
        e4.setCity("Chennai");
        employees[3] = e4;

        Employee e5 = new Employee();
        e5.setName("Manoj");
        e5.setAge(35);
        e5.setDepartment("Sales");
        e5.setCompany("IBM");
        e5.setCity("Hyderabad");
        employees[4] = e5;

        for (int i = 0; i < employees.length; i++) {
            System.out.println("Employee " + (i + 1) + " Details:");
            Employee emp = employees[i];
            System.out.println("Name: " + emp.getName());
            System.out.println("Age: " + emp.getAge());
            System.out.println("Department: " + emp.getDepartment());
            System.out.println("Company: " + emp.getCompany());
            System.out.println("City: " + emp.getCity());
            System.out.println("----------------------------------");
        }
    }
}
