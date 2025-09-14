package Inhertances.Adsctraction;

public class Addtion extends Arthmatic{

    private int a = 40;
    public int b;
    public Addtion(){

    }

    public Addtion(int b){
        this.b=b;
    }
    @Override
    public float operation() {
        return a +b;
    }
}
