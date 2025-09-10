package Inhertances.polymorpisum.runtime;

public class Hp extends Laptop{
    public int quantity;
    public void calculatePrice(int quantity){
        this.quantity = quantity;
        System.out.println("the total hp laptops are " + quantity);
    }
}
