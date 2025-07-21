class AnimalRunner{
    public static void main(String[] args){

        Animal ani = new Animal();

        System.out.println(ani.getName());
        ani.setName("tiger");
        String name = ani.getName();
        System.out.println(name);

        Animal anni = new Animal("Monkey");
        System.out.println(anni.getName());

        Animal ani1 = new Animal("cow" , 30);
        System.out.println(ani1.getName());
        System.out.println(ani1.getAge());


    }
}