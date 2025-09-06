package Package.inheritance;

public class FastFood extends Food{
    FastFood(String name) {
        super(name);
    }


    void display(String restaurant) {
        System.out.println("Food: " + name + " from " + restaurant);
    }
}
