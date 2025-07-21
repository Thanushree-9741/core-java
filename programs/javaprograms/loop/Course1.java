class Course {
    String courseName;
    String courseCode;
    String facultyName;
    int durationMonths;
    float courseFee;

    public static void main(String[] args) {
        // 1
        Course c1 = new Course();
        c1.courseName = "Java Basics";
        System.out.println(c1.courseName);
        c1.setCourseName("Advanced Java");
        System.out.println(c1.courseName);

        // 2
        Course c2 = new Course();
        c2.courseCode = "J101";
        System.out.println(c2.courseCode);
        c2.setCourseCode("J102");
        System.out.println(c2.courseCode);

        // 3
        Course c3 = new Course();
        c3.facultyName = "Ravi Kumar";
        System.out.println(c3.facultyName);
        c3.setFacultyName("Suresh");
        System.out.println(c3.facultyName);

        // 4
        Course c4 = new Course();
        c4.durationMonths = 3;
        System.out.println(c4.durationMonths);
        c4.setDurationMonths(4);
        System.out.println(c4.durationMonths);

        // 5
        Course c5 = new Course();
        c5.courseFee = 5000f;
        System.out.println(c5.courseFee);
        c5.setCourseFee(5500f);
        System.out.println(c5.courseFee);

        // 6
        Course c6 = new Course();
        c6.courseName = "Python";
        System.out.println(c6.courseName);
        c6.setCourseNameAgain("Advanced Python");
        System.out.println(c6.courseName);

        // 7
        Course c7 = new Course();
        c7.courseCode = "P101";
        System.out.println(c7.courseCode);
        c7.setCourseCodeAgain("P102");
        System.out.println(c7.courseCode);

        // 8
        Course c8 = new Course();
        c8.facultyName = "Nandini";
        System.out.println(c8.facultyName);
        c8.setFacultyNameAgain("Lakshmi");
        System.out.println(c8.facultyName);

        // 9
        Course c9 = new Course();
        c9.durationMonths = 2;
        System.out.println(c9.durationMonths);
        c9.setDurationMonthsAgain(3);
        System.out.println(c9.durationMonths);

        // 10
        Course c10 = new Course();
        c10.courseFee = 4500f;
        System.out.println(c10.courseFee);
        c10.setCourseFeeAgain(4800f);
        System.out.println(c10.courseFee);
    }

    public void setCourseName(String name) {
        courseName = name;
    }

    public void setCourseNameAgain(String name) {
        courseName = name;
    }

    public void setCourseCode(String code) {
        courseCode = code;
    }

    public void setCourseCodeAgain(String code) {
        courseCode = code;
    }

    public void setFacultyName(String faculty) {
        facultyName = faculty;
    }

    public void setFacultyNameAgain(String faculty) {
        facultyName = faculty;
    }

    public void setDurationMonths(int duration) {
        durationMonths = duration;
    }

    public void setDurationMonthsAgain(int duration) {
        durationMonths = duration;
    }

    public void setCourseFee(float fee) {
        courseFee = fee;
    }

    public void setCourseFeeAgain(float fee) {
        courseFee = fee;
    }
}
