class LaptopBillRunner {
    public static void main(String[] args) {
        LaptopBill l1 = new LaptopBill();
        System.out.println(l1.getBuyerName());
        System.out.println(l1.getBrand());
        System.out.println(l1.getPrice());
        System.out.println(l1.getStore());

        System.out.println("Using single parameter constructor");
        LaptopBill l2 = new LaptopBill("Ravi");
        System.out.println(l2.getBuyerName());

        System.out.println("Using two parameter constructor");
        LaptopBill l3 = new LaptopBill("Ravi", "Lenovo");
        System.out.println(l3.getBuyerName());
        System.out.println(l3.getBrand());

        System.out.println("Using three parameter constructor");
        LaptopBill l4 = new LaptopBill("Ravi", "Lenovo", 47000.0);
        System.out.println(l4.getBuyerName());
        System.out.println(l4.getBrand());
        System.out.println(l4.getPrice());

        System.out.println("Using four parameter constructor");
        LaptopBill l5 = new LaptopBill("Ravi", "Lenovo", 47000.0, "Lenovo Store");
        System.out.println(l5.getBuyerName());
        System.out.println(l5.getBrand());
        System.out.println(l5.getPrice());
        System.out.println(l5.getStore());
    }
}
