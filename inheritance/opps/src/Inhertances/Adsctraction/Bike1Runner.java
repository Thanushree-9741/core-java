package Inhertances.Adsctraction;

public class Bike1Runner {
    public static void main(String[] args) {
        Bike1 bi = new MountainBike();
        bi.mailage();

        Bike1 bi1 = new SuperBike();
        bi1.mailage();
    }
}
