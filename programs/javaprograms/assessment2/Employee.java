class Employee{
    static int id = 102;
    static String empName = "Ravikumar";
    static long mobile = 9741206563L;
    static float salary = 120000.0f;
    static String address = " kolar";

    
        public static float getTotalYearSalary(int totalMonth){
            float totalSalary = salary * totalMonth;
            return totalSalary;
        }
        
        public static float totalExpenteture(float totalsaving){
            float totalEpen = salary - totalsaving;
            return totalEpen;
        }

        public static String fullAddress(String addres){
            return addres;
        }

         public static String getEmail() {
        return empName.toLowerCase() + "@company.com";
    }

   
    public static boolean isEligibleForLoan() {
        return salary > 100000;
    }


}