class Fruit extends Food {
    Fruit() {
        super(); // calls Food constructor
        System.out.println("Fruit constructor called");
    }
    void taste() {
        System.out.println("Fruits are sweet");
    }
}