class Person {
    String name;
    int age;

   
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    
    public void validateEligibleforVoting(int age) {
        if (age >= 18) {
            System.out.println(name + " is eligible for voting.");
        } else {
            System.out.println(name + " is NOT eligible for voting.");
        }
    }

    
}
