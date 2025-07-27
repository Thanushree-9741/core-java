public class Employee {

    static int[] empIds = {101, 102, 103, 104, 105};
    static float[] empHours = {8.5f, 7.0f, 6.5f, 9.0f, 8.0f};
    static long[] empMobile = {9876543210L, 8123456789L, 9988776655L, 9000011111L, 9112233445L};
    static double[] empSalary = {50000.50, 60000.75, 45000.25, 70000.0, 55000.5};
    static byte[] empRating = {5, 4, 3, 5, 4};
    static short[] empDeptNo = {10, 20, 30, 10, 20};
    static boolean[] empActive = {true, true, false, true, true};
    static boolean[] empFullTime = {true, false, true, true, false};
    static char[] empGrades = {'A', 'B', 'C', 'A', 'B'};
    static String[] empNames = {"Thanu", "Shree", "Ravi", "Kumar", "Nandu"};

    public static int[] getEmpIds() {
        return empIds;
    }

    public static float[] getEmpHours() {
        return empHours;
    }

    public static long[] getEmpMobile() {
        return empMobile;
    }

    public static double[] getEmpSalary() {
        return empSalary;
    }

    public static byte[] getEmpRating() {
        return empRating;
    }

    public static short[] getEmpDeptNo() {
        return empDeptNo;
    }

    public static boolean[] getEmpActive() {
        return empActive;
    }

    public static boolean[] getEmpFullTime() {
        return empFullTime;
    }

    public static char[] getEmpGrades() {
        return empGrades;
    }

    public static String[] getEmpNames() {
        return empNames;
    }
}
