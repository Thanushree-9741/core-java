package Inhertances.Adsctraction;

public class DeliveryFood implements HomeFoodService{
    @Override
    public void orderDetail() {
        System.out.println("Food Delivery Details:");
        System.out.println("customer name is : " + "Ravikumar");
        System.out.println(" number of  Items  order is : " + 2);
        System.out.println("The price of order is  " + 80);
        System.out.println("customer address " + "Kolar");
        System.out.println("____________Order is Delivery_______________");
    }
    }

