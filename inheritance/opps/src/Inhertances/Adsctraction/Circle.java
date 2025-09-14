package Inhertances.Adsctraction;

public class Circle  extends  Shape{
private final float pi = 3.14f;
private int radius;

public Circle(){

}
public Circle(int radius){
    this.radius = radius;
}
    @Override
    public float calcucalation() {


    return pi * radius * radius;
    }
}
