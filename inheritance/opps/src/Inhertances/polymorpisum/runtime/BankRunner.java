package Inhertances.polymorpisum.runtime;

public class BankRunner {

    public static void main(String[] args){
        Bank sbi = new Sbi("10 to 3");

        System.out.println("SBI bank");
        System.out.println("the rate of interest " + sbi.getRateOfInterest());
        System.out.println("the bank opeing and closing time" + sbi.timing);
        System.out.println("the deposit amount :" + sbi.getDeposit());
        System.out.println("the withdraw amount :" + sbi.getWithDraw());

        Bank ici = new Icici("9 to 3");
        System.out.println("ICICI bank");
        System.out.println("the rate of interest " + ici.getRateOfInterest());
        System.out.println("the bank opeing and closing time" + ici.timing);
        System.out.println("the deposit amount :" + ici.getDeposit());
        System.out.println("the withdraw amount :" + ici.getWithDraw());

        Bank axic = new Axis("11 to 5");
        System.out.println("AXIS bank");
        System.out.println("the rate of interest " + axic.getRateOfInterest());
        System.out.println("the bank opeing and closing time" + axic.timing);
        System.out.println("the deposit amount :" + axic.getDeposit());
        System.out.println("the withdraw amount :" + axic.getWithDraw());

    }
}
