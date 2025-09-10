package Inhertances.polymorpisum.runtime;

public class LaptopRunner {
    public static void main(String[] args){
        Laptop lap = new Laptop();
        lap.calculatePrice(15);
        System.out.println("----------------------------------------------------------");

        System.out.println("_______________up casting_____________");
        Laptop dell = new Dell();
       dell.calculatePrice(5);

        Laptop hp = new Hp();
        hp.calculatePrice(6);

        Laptop lenovo = new Lenovo();
        lenovo.calculatePrice(4);
    }
}
