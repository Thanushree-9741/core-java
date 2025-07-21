class Student {
    private String name;
    private int marks;

    public Student() {
        System.out.println("Default constructor - Student");
        this.name = "Default Student";
    }

    public Student(String name) {
        System.out.println("Parameterized constructor - Student");
        this.name = name;
    }

    public Student(String name, int marks) {
        System.out.println("2 Parameterized constructor - Student");
        this.name = name;
        this.marks = marks;
    }

    public void setName(String name) { this.name = name; }
    public String getName() { return name; }

    public void setMarks(int marks) { this.marks = marks; }
    public int getMarks() { return marks; }
}
