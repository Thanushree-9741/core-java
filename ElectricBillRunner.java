class ElectricBillRunner {
    public static void main(String[] args) {
        ElectricBill e1 = new ElectricBill();
        System.out.println(e1.getCustomerName());
        System.out.println(e1.getUnitsConsumed());
        System.out.println(e1.getBillAmount());
        System.out.println(e1.getArea());

        System.out.println("Using single parameter constructor");
        ElectricBill e2 = new ElectricBill("Manoj");
        System.out.println(e2.getCustomerName());

        System.out.println("Using two parameter constructor");
        ElectricBill e3 = new ElectricBill("Manoj", 250);
        System.out.println(e3.getCustomerName());
        System.out.println(e3.getUnitsConsumed());

        System.out.println("Using three parameter constructor");
        ElectricBill e4 = new ElectricBill("Manoj", 250, 1400.50);
        System.out.println(e4.getCustomerName());
        System.out.println(e4.getUnitsConsumed());
        System.out.println(e4.getBillAmount());

        System.out.println("Using four parameter constructor");
        ElectricBill e5 = new ElectricBill("Manoj", 250, 1400.50, "Tumkur");
        System.out.println(e5.getCustomerName());
        System.out.println(e5.getUnitsConsumed());
        System.out.println(e5.getBillAmount());
        System.out.println(e5.getArea());
    }
}
