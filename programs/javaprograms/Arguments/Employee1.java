class Employee1{
    static int id = 121;
    static String name = "Ravikumar";

    public static void main(String[] args){

        int empId = idOfEmp();
        System.out.println(empId);

        String empName = nameOfEmp();
        System.out.println(empName);
    }

    public static int idOfEmp(){
        return id;

    }
    public static String nameOfEmp(){
        return name;
    }
}