class CourseRunner {
    public static void main(String[] args) {
        System.out.println("Course Name: " + Course.courseName);
        System.out.println("Course Duration: " + Course.duration);
        System.out.println("Course Fee: " + Course.fee);
        System.out.println("Course Instructor: " + Course.instructor);
        System.out.println("Max Students: " + Course.maxStudents);
        
        System.out.println("Course Info: " + Course.getCourseInfo());
        System.out.println("Is Full: " + Course.isFull());
        System.out.println("Duration: " + Course.getDuration());
        System.out.println("Fee: " + Course.getFee());
        System.out.println("Instructor: " + Course.getInstructor());
    }
}
