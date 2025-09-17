package Inhertances.Adsctraction;

public class OrderFood implements HomeFoodService{
    @Override
    public void orderDetail() {
        System.out.println("The order detail of customer is :");
        System.out.println("customer name is : " + "Ravikumar");
        System.out.println(" number of  Items  order is : " + 2);
        System.out.println("The price of order is  " + 80);
        System.out.println("Food service name is " + "RMNT home food");
        System.out.println("____________Order is Accpted_______________");
    }
}
