package Inhertances.Adsctraction;

public class Bike extends MotorCycle {
    public float milage;

    public Bike(){

    }

    public Bike(float milage, String name){
        super(name);
        this.milage = milage;
    }
    @Override
    public void motor() {
        System.out.println("The hero honda is a super bike");
    }
}
