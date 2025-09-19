package Interface;

public class VehicleRunner {
    public static void main(String[] args) {
        BiCycle biCycle = new BiCycle();
        System.out.println(biCycle.speed);
        System.out.println(biCycle.gear);

        biCycle.speedUp(10);
        biCycle.changeGear(2);
        biCycle.speedUp(25);
        biCycle.applyBrake(10);

        System.out.println(biCycle.printStates());

        MotorCycle motorCycle = new MotorCycle();
        Vehicle vehicle = new MotorCycle(0,12);
        vehicle.speedUp(20);
        vehicle.changeGear(2);

        if(vehicle instanceof MotorCycle){
            MotorCycle motorCycle1 = (MotorCycle) vehicle;
            System.out.println(motorCycle1.printStates());
        }


    }
}
