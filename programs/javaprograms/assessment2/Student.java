class Student {
    static int id = 101;
    static String name = "Priya Sharma";
    static int age = 20;
    static String department = "Computer Science";
    static float gpa = 3.9f;

    public static String getFullInfo() {
        return name + " (ID: " + id + ")";
    }

    public static boolean isHonorStudent() {
        return gpa >= 3.5;
    }

    public static String getDepartment() {
        return department;
    }

    public static int getBirthYear(int currentYear) {
        return currentYear - age;
    }

    public static int  getTotalMarks(int m1, int m2, int m3) {
        int total = m1 + m2 + m3;
        return total;
    }
}


