package Inhertances.polymorpisum.runtime;

public class Icici extends Bank {
     public Icici(){

     }
     public Icici(String timing){
         this.timing = timing;
     }

    public float getRateOfInterest() {
        return 4.7f;
    }

    public double getDeposit(){
        return 20000d;
    }

    public double getWithDraw(){
        return 1200d;
    }

}
