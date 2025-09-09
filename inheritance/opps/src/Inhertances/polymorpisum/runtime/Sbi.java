package Inhertances.polymorpisum.runtime;

public class Sbi extends Bank {

    public Sbi() {

    }

    public Sbi(String timing) {
        this.timing = timing;
    }

    public float getRateOfInterest() {
        return 6.7f;
    }

    public double getDeposit(){
        return 2000000d;
    }

    public double getWithDraw(){
        return 1200000d;
    }
}
