class Animal{
    private String name;
    private int age;


    public Animal(){
        System.out.println("No arguments or defulate");
        this.name="lion";

    }

    public Animal(String aniName){

        System.out.println(" with parameterized");
        name = aniName;
        
    }

    public Animal(String name , int age){

        System.out.println(" with 2 parameterized with this keyword");
        this.name = name;
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }
}