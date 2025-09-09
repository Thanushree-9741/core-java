package Inhertances.polymorpisum.runtime;

public class AnimalRunner {
    public static void main(String[] args){

        System.out.println("===============Dog====================");
        Animal dog = new Dog("6 months");
        System.out.println(dog.eat());
        System.out.println("The Dog give birth " + dog.years + " per year" );
        System.out.println("================cat================");

        Animal cat = new Cat("3 months");
        System.out.println(cat.eat());
        System.out.println("The cat give birth " + cat.years + " per year" );
        System.out.println("==================elephant====================");
        Animal ele = new Elephant("2 years");
        System.out.println(ele.eat());
        System.out.println("The Elephant give birth " + ele.years + " onces" );
    }
}
