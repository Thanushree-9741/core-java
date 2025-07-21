class Employee {
    String empName;
    int empId;
    float salary;
    String department;
    String designation;

    public static void main(String[] args) {
        // 1
        Employee e1 = new Employee();
        e1.empName = "Ravi";
        System.out.println(e1.empName);
        e1.setEmpName("Kumar");
        System.out.println(e1.empName);

        // 2
        Employee e2 = new Employee();
        e2.empId = 201;
        System.out.println(e2.empId);
        e2.setEmpId(202);
        System.out.println(e2.empId);

        // 3
        Employee e3 = new Employee();
        e3.salary = 50000;
        System.out.println(e3.salary);
        e3.setSalary(55000);
        System.out.println(e3.salary);

        // 4
        Employee e4 = new Employee();
        e4.department = "HR";
        System.out.println(e4.department);
        e4.setDepartment("Finance");
        System.out.println(e4.department);

        // 5
        Employee e5 = new Employee();
        e5.designation = "Manager";
        System.out.println(e5.designation);
        e5.setDesignation("Senior Manager");
        System.out.println(e5.designation);

        // 6
        Employee e6 = new Employee();
        e6.salary = 60000;
        System.out.println(e6.salary);
        e6.setSalaryAgain(65000);
        System.out.println(e6.salary);

        // 7
        Employee e7 = new Employee();
        e7.empId = 203;
        System.out.println(e7.empId);
        e7.setEmpIdAgain(204);
        System.out.println(e7.empId);

        // 8
        Employee e8 = new Employee();
        e8.empName = "John";
        System.out.println(e8.empName);
        e8.setEmpNameAgain("David");
        System.out.println(e8.empName);

        // 9
        Employee e9 = new Employee();
        e9.department = "IT";
        System.out.println(e9.department);
        e9.setDepartmentAgain("Admin");
        System.out.println(e9.department);

        // 10
        Employee e10 = new Employee();
        e10.designation = "Clerk";
        System.out.println(e10.designation);
        e10.setDesignationAgain("Assistant Clerk");
        System.out.println(e10.designation);
    }

    public void setEmpName(String name) {
        empName = name;
    }
    public void setEmpNameAgain(String name) {
        empName = name;
    }
    public void setEmpId(int id) {
        empId = id;
    }
    public void setEmpIdAgain(int id) {
        empId = id;
    }
    public void setSalary(float sal) {
        salary = sal;
    }
    public void setSalaryAgain(float sal) {
        salary = sal;
    }
    public void setDepartment(String dept) {
        department = dept;
    }
    public void setDepartmentAgain(String dept) {
        department = dept;
    }
    public void setDesignation(String desig) {
        designation = desig;
    }
    public void setDesignationAgain(String desig) {
        designation = desig;
    }
}
