package Package.inheritance;

public class FoodTest {

    public static void main(String[] args) {
        FastFood ff = new FastFood("Burger");

        ff.display();
        ff.display("McDonalds");

        ff.info("Snack");
        ff.info(500);

        ff.finalMethod();
        ff.finalMethod("Delicious!");
        Food.staticMethod();
        Food.staticMethod(1);           
    }
}
