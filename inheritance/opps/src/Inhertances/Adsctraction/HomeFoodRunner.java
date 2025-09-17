package Inhertances.Adsctraction;

public class HomeFoodRunner {
    public static void main(String[] args) {
        OrderFood order = new OrderFood();
        order.orderDetail();
        System.out.println("=========================================================================");
        DeliveryFood delivery = new DeliveryFood();
        delivery.orderDetail();
    }

}
