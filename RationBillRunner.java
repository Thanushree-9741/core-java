class RationBillRunner {
    public static void main(String[] args) {
        RationBill r1 = new RationBill();
        System.out.println(r1.getFamilyHead());
        System.out.println(r1.getMembers());
        System.out.println(r1.getTotalPrice());
        System.out.println(r1.getShopName());

        System.out.println("Using single parameter constructor");
        RationBill r2 = new RationBill("Suresh");
        System.out.println(r2.getFamilyHead());

        System.out.println("Using two parameter constructor");
        RationBill r3 = new RationBill("Suresh", 5);
        System.out.println(r3.getFamilyHead());
        System.out.println(r3.getMembers());

        System.out.println("Using three parameter constructor");
        RationBill r4 = new RationBill("Suresh", 5, 1800.75);
        System.out.println(r4.getFamilyHead());
        System.out.println(r4.getMembers());
        System.out.println(r4.getTotalPrice());

        System.out.println("Using four parameter constructor");
        RationBill r5 = new RationBill("Suresh", 5, 1800.75, "Main Ration Depot");
        System.out.println(r5.getFamilyHead());
        System.out.println(r5.getMembers());
        System.out.println(r5.getTotalPrice());
        System.out.println(r5.getShopName());
    }
}
