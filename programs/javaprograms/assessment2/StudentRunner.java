class StudentRunner {
    public static void main(String[] args) {
        System.out.println("ID: " + Student.id);
        System.out.println("Name: " + Student.name);
        System.out.println("Age: " + Student.age);
        System.out.println("Department: " + Student.department);
        System.out.println("GPA: " + Student.gpa);

        String name =  Student.getFullInfo();
        System.out.println("Full Info: " + name);

        boolean gpa = Student.isHonorStudent();
        System.out.println("Is Honor Student: " + gpa);

         
        System.out.println(Student.getDepartment());

        int currentYear = Student.getBirthYear(2023);
        System.out.println("Birth Year: " + currentYear );

        int total = Student.getTotalMarks(30, 40, 50);
        System.out.println("Total marks : " + total);
    }
}
