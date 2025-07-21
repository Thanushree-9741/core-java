class StudentRunner {
    public static void main(String[] args) {

        System.out.println("\nStudent Name & Marks:");

        Student s1 = new Student(); 
         System.out.println(s1.getName() + " - " + s1.getMarks());

        Student s2 = new Student("Kiran"); 
         System.out.println(s2.getName() + " - " + s2.getMarks());

        Student s3 = new Student("Ravi", 85); 
        System.out.println(s3.getName() + " - " + s3.getMarks());

        Student s4 = new Student("Anu", 90);
        System.out.println(s4.getName() + " - " + s4.getMarks());
        Student s5 = new Student("Thanu");
        System.out.println(s5.getName() + " - " + s5.getMarks());

        Student s6 = new Student(); 
        System.out.println(s6.getName() + " - " + s6.getMarks());

        Student s7 = new Student("Manu", 95);
        System.out.println(s7.getName() + " - " + s7.getMarks());

        Student s8 = new Student("Rani");
        System.out.println(s8.getName() + " - " + s8.getMarks());

        Student s9 = new Student("Pavan", 88);
        System.out.println(s9.getName() + " - " + s9.getMarks());

        Student s10 = new Student("Divya", 92);
        System.out.println(s10.getName() + " - " + s10.getMarks());
        
    }
}
