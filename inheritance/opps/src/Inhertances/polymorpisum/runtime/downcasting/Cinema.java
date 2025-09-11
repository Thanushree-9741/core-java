package Inhertances.polymorpisum.runtime.downcasting;

public class Cinema {
    public String name ;
    public int total;

    public Cinema(){

    }

    public Cinema(String name1){
        this.name = name1 = "KGF2";
    }
    public void getCinema(int total){
        System.out.println("the cinema " + total);
    }
}
