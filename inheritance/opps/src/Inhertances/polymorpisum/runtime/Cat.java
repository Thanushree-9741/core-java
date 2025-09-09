package Inhertances.polymorpisum.runtime;

public class Cat extends Animal{
    public Cat()
    {

    }
    public Cat(String years){
        this.years = years;
    }

    public String eat(){
        return "meat";
    }
}
