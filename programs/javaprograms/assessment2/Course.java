class Course {
    static String courseName = "Java Programming";
    static int duration = 30; // in days
    static float fee = 500.0f;
    static String instructor = "Alice Smith";
    static int maxStudents = 25;

    public static String getCourseInfo() {
        return courseName + " by " + instructor;
    }

    public static boolean isFull() {
        return maxStudents <= 0;
    }

    public static int getDuration() {
        return duration;
    }

    public static float getFee() {
        return fee;
    }

    public static String getInstructor() {
        return instructor;
    }
}
