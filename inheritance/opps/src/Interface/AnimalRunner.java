package Interface;

public class AnimalRunner {
    public static void main(String[] args) {
        Dog dog = new Animal();
        dog.eat("Non_veg");

        Cow cow = new Animal();
        cow.milk(12);
    }
}
