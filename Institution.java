class Institution{

     private String name;
    private String address;
    private Trainer trainer;

    public Institution(String name,String address){
        this.name = name;
        this.address = address;
    }

    public String getName(){
        return name;
    }

    public String getAddress(){
        return address;
    }

    public void setTrainer(Trainer trainer ){
        this.trainer = trainer;
    }

    public Trainer getTrainer(){
       return trainer;
    }
}
