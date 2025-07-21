class Train{

    private String name;
    private float cost;
    private int speed;
    
    public static int length;
    //static block
    static {
        System.out.println("Static block in train");
        length = 100;
    }

    // non static block
    {
        System.out.println(" non static in train");
        length = 200;
    }
// in non static block we can run both static and non static block

public void setName(String trainName){
    name = trainName;
}

public String getName() {
    return name;
}

public void setCost(float trainCost){
    cost = trainCost;
}

public float getCost(){
      return cost;
}

public void setSpeed(int trainSpeed){
    speed = trainSpeed;
}

public int getSpeed(){
    return speed;
}
}
