class TrainRunner{

    static {
        System.out.println(" static block in runner class");
    }

    public static void main(String[] args){
        System.out.println(Train.length);
        Train train = new Train();
        System.out.println(train.length);
        train.setName("Indian");
        System.out.println(train.getName());
        train.setCost(120f);
        System.out.println(train.getCost());
        train.setSpeed(1);
        System.out.println(train.getSpeed() + " mints for 200 meters " );


    }
}