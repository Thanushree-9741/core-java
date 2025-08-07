class WoodBillRunner {
    public static void main(String[] args) {
        WoodBill w1 = new WoodBill();
        System.out.println(w1.getCustomer());
        System.out.println(w1.getWoodType());
        System.out.println(w1.getQuantity());
        System.out.println(w1.getAmount());

        System.out.println("Using single parameter constructor");
        WoodBill w2 = new WoodBill("Rakesh");
        System.out.println(w2.getCustomer());

        System.out.println("Using two parameter constructor");
        WoodBill w3 = new WoodBill("Rakesh", "Sandalwood");
        System.out.println(w3.getCustomer());
        System.out.println(w3.getWoodType());

        System.out.println("Using three parameter constructor");
        WoodBill w4 = new WoodBill("Rakesh", "Sandalwood", 20.5);
        System.out.println(w4.getCustomer());
        System.out.println(w4.getWoodType());
        System.out.println(w4.getQuantity());

        System.out.println("Using four parameter constructor");
        WoodBill w5 = new WoodBill("Rakesh", "Sandalwood", 20.5, 30000);
        System.out.println(w5.getCustomer());
        System.out.println(w5.getWoodType());
        System.out.println(w5.getQuantity());
        System.out.println(w5.getAmount());
    }
}
