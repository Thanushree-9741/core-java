package Inhertances.polymorpisum.runtime;

public class Elephant extends Animal{
    public Elephant()
    {

    }
    public Elephant(String years){
        this.years = years;
    }

    public String eat(){
        return "meat";
    }
}
