package Inhertances.polymorpisum.runtime;

public class Axis extends Bank {

    public Axis(){

    }

    public Axis(String timing){
        this.timing = timing;
    }
    public float getRateOfInterest() {
        return 7.7f;
    }
    public double getDeposit(){
        return 200000d;
    }

    public double getWithDraw(){
        return 12000d;
    }
}
