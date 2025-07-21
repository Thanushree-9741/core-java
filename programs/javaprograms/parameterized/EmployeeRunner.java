class EmployeeRunner {
    public static void main(String[] args) {
        System.out.println("\nEmployee Name & Salary:");

        Employee e1 = new Employee();
        System.out.println(e1.getName() + " - ₹" + e1.getSalary());

        Employee e2 = new Employee("Anil");
        System.out.println(e2.getName() + " - ₹" + e2.getSalary());

        Employee e3 = new Employee("Sunil", 45000);
        System.out.println(e3.getName() + " - ₹" + e3.getSalary());

        Employee e4 = new Employee("Meera", 50000);
        System.out.println(e4.getName() + " - ₹" + e4.getSalary());

        Employee e5 = new Employee("Raj");
        System.out.println(e5.getName() + " - ₹" + e5.getSalary());

        Employee e6 = new Employee();
        System.out.println(e6.getName() + " - ₹" + e6.getSalary());

        Employee e7 = new Employee("Kavya", 60000);
        System.out.println(e7.getName() + " - ₹" + e7.getSalary());

        Employee e8 = new Employee("Divya");
        System.out.println(e8.getName() + " - ₹" + e8.getSalary());

        Employee e9 = new Employee("Rohit", 55000);
        System.out.println(e9.getName() + " - ₹" + e9.getSalary());

        Employee e10 = new Employee("Naveen", 48000);
        System.out.println(e10.getName() + " - ₹" + e10.getSalary());
    }
}