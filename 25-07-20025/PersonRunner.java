class PersonRunner{

    public static void main(String[] args) {
      
        Person p1 = new Person("Thanu", 20);
        p1.validateEligibleforVoting(p1.age);

       
        Person p2 = new Person("Ravi", 16);
        p2.validateEligibleforVoting(p2.age);
    }
}