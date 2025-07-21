class EmployeeRunner{


public static void main(String[] args){

         System.out.println(" id :" + Employee.id);
           System.out.println(" employee name :" + Employee.empName);
           System.out.println(" Mobile no :" + Employee.mobile);
           System.out.println(" salary  :" + Employee.salary);
           System.out.println(" Address :" + Employee.address);
          float totalSalary = Employee.getTotalYearSalary(22);
        System.out.println("Total Salary for 22 Months: " + totalSalary);

        float totalEpen = Employee.totalExpenteture(75000f);
        System.out.println("Total Expenditure: " + totalEpen);

        String addres = Employee.fullAddress("Majara Ramapura, Mulbagal Taluk, Kolar District");
        System.out.println("Full Address: " + addres);

        String email = Employee.getEmail();
        System.out.println("Employee Email: " + email);

        boolean eligible = Employee.isEligibleForLoan();
        System.out.println("Loan Eligibility: " + eligible);
    


           

    }

  }
    