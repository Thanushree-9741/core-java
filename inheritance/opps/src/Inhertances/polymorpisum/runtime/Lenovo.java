package Inhertances.polymorpisum.runtime;

public class Lenovo extends Laptop{
    public int quantity;
    public void calculatePrice(int quantity){
        this.quantity = quantity;
        System.out.println("the total lenovo laptops are " + quantity);
    }
}
