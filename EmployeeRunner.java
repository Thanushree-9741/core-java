public class EmployeeRunner {
    public static void main(String[] args) {
        
        int[] empIds = Employee.getEmpIds();
        for (int j = 0; j < empIds.length; j++) {
            System.out.println("Employee ID: " + empIds[j]);
        }

        float[] empHours = Employee.getEmpHours();
        for (int j = 0; j < empHours.length; j++) {
            System.out.println("Work Hours: " + empHours[j]);
        }

        long[] empMobile = Employee.getEmpMobile();
        for (int j = 0; j < empMobile.length; j++) {
            System.out.println("Mobile Number: " + empMobile[j]);
        }

        double[] empSalary = Employee.getEmpSalary();
        double sum = 0;
        for (int j = 0; j < empSalary.length; j++) {
            System.out.println(empSalary[j]);
            sum += empSalary[j];
        }

        float average = (float) sum / empSalary.length;
        System.out.println("\nAverage Salary: " + average);
        

        byte[] empRating = Employee.getEmpRating();
        for (int j = 0; j < empRating.length; j++) {
            System.out.println("Rating: " + empRating[j]);
        }

        short[] empDeptNo = Employee.getEmpDeptNo();
        for (int j = 0; j < empDeptNo.length; j++) {
            System.out.println("Department No: " + empDeptNo[j]);
        }

        boolean[] empActive = Employee.getEmpActive();
        for (int j = 0; j < empActive.length; j++) {
            System.out.println("Active: " + empActive[j]);
        }

        boolean[] empFullTime = Employee.getEmpFullTime();
        for (int j = 0; j < empFullTime.length; j++) {
            System.out.println("Full-Time: " + empFullTime[j]);
        }

        char[] empGrades = Employee.getEmpGrades();
        for (int j = 0; j < empGrades.length; j++) {
            System.out.println("Grade: " + empGrades[j]);
        }

        String[] empNames = Employee.getEmpNames();
        for (int j = 0; j < empNames.length; j++) {
            System.out.println("Name: " + empNames[j]);
        }
    }
}
