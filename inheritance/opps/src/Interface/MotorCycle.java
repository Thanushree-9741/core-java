package Interface;

public class MotorCycle implements Vehicle{
    int speed, gear;

    public MotorCycle(){

    }

    public MotorCycle(int speed, int gear){
        this.speed = speed;
        this.gear = gear;
    }
    @Override
    public void changeGear(int a) {
        gear =a ;
    }

    @Override
    public void speedUp(int a) {
        speed = speed + a;

    }

    @Override
    public void applyBrake(int a) {
        speed = speed - a;

    }

    public String printStates(){
        return "states of bicycle is speed" + speed + "gear" +gear;
    }
}

