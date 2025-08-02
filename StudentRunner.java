class StudentRunner {
    public static void main(String[] args) {
        Student[] students = new Student[5];

        Student s1 = new Student();
        s1.setName("Asha");
        s1.setAge(17);
        s1.setGrade("12th");
        s1.setSchool("Oxford PU College");
        s1.setCity("Kolar");
        students[0] = s1;

        Student s2 = new Student();
        s2.setName("Ravi");
        s2.setAge(18);
        s2.setGrade("12th");
        s2.setSchool("Vidyavardhaka");
        s2.setCity("Bangalore");
        students[1] = s2;

        Student s3 = new Student();
        s3.setName("Sneha");
        s3.setAge(16);
        s3.setGrade("11th");
        s3.setSchool("New Horizon");
        s3.setCity("Mysore");
        students[2] = s3;

        Student s4 = new Student();
        s4.setName("Karthik");
        s4.setAge(17);
        s4.setGrade("12th");
        s4.setSchool("Narayana");
        s4.setCity("Tumkur");
        students[3] = s4;

        Student s5 = new Student();
        s5.setName("Divya");
        s5.setAge(18);
        s5.setGrade("12th");
        s5.setSchool("Siddaganga");
        s5.setCity("Chikkaballapur");
        students[4] = s5;

        for (int i = 0; i < students.length; i++) {
            System.out.println("Student " + (i + 1) + " Details:");
            Student student = students[i];
            System.out.println("Name: " + student.getName());
            System.out.println("Age: " + student.getAge());
            System.out.println("Grade: " + student.getGrade());
            System.out.println("School: " + student.getSchool());
            System.out.println("City: " + student.getCity());
            System.out.println("----------------------------------");
        }
    }
}
