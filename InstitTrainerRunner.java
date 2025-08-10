class InstitTrainerRunner{

    public static void main(String[] args){

        Institution instit = new Institution("Xworks", "MaicoLayout");
System.out.println("1st class data ------------------------------------------");
        System.out.println(instit.getName());
        System.out.println(instit.getAddress());

         System.out.println();
   

        Trainer t1 = new Trainer("lokeshsir", "Full Stack Java", "Bangalore", 9988009882L, 1231);

        instit.setTrainer(t1);
        
        Trainer traineer = instit.getTrainer();

       System.out.println("2st class data ------------------------------------------");
        System.out.println(traineer.getName());
        System.out.println(traineer.getDomain());
        System.out.println(traineer.getAddress());
        System.out.println(traineer.getMobile());
        System.out.println(traineer.getId());
    }
}