class Domastic{
     
    private String name ;

    public Domastic(){
        System.out.println("with no arguments");
        name = "cow";
    }


    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}