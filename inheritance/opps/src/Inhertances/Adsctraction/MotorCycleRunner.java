package Inhertances.Adsctraction;

public class MotorCycleRunner {

    public static void main(String[] args){
        Bike be = new Bike(12.0f,"herohonda");
        System.out.println("the milage of bike " + be.milage);
        System.out.println("the bike name is " + be.name);
        be.motor();

       

    }
}
