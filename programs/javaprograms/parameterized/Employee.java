class Employee {
    private String name;
    private float salary;

    public Employee() {
        System.out.println("Default constructor - Employee");
        this.name = "Default Employee";
    }

    public Employee(String name) {
        System.out.println("Parameterized constructor - Employee");
        this.name = name;
    }

    public Employee(String name, float salary) {
        System.out.println("2 Parameterized constructor - Employee");
        this.name = name;
        this.salary = salary;
    }

    public void setName(String name) {
         this.name = name; }
    public String getName() { 
        return name; }

    public void setSalary(float salary) { 
        this.salary = salary; }
    public float getSalary() { 
        return salary; }
}


