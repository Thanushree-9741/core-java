package Inhertances.polymorpisum.runtime;

public class Dell extends Laptop{
    public int quantity;
    public void calculatePrice(int quantity){
        this.quantity = quantity;
        System.out.println("the total dell laptops are " + quantity);
    }
}
