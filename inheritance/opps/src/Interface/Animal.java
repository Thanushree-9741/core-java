package Interface;

public class Animal implements Dog,Cow{


    @Override
    public void milk(int liters) {
        System.out.println("the cow gives this litetrs" + liters);
    }

    @Override
    public void eat(String dogEat) {

        System.out.println("the dog eat " + dogEat);

    }



    }



