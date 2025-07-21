class MobileRunner {
    public static void main(String[] args) {
        System.out.println("\nMobile Model & Price:");

        Mobile m1 = new Mobile();
        System.out.println(m1.getModel() + " - ₹" + m1.getPrice());

        Mobile m2 = new Mobile("Samsung");
        System.out.println(m2.getModel() + " - ₹" + m2.getPrice());

        Mobile m3 = new Mobile("iPhone", 90000);
        System.out.println(m3.getModel() + " - ₹" + m3.getPrice());

        Mobile m4 = new Mobile("OnePlus", 50000);
        System.out.println(m4.getModel() + " - ₹" + m4.getPrice());

        Mobile m5 = new Mobile("Realme");
        System.out.println(m5.getModel() + " - ₹" + m5.getPrice());

        Mobile m6 = new Mobile();
        System.out.println(m6.getModel() + " - ₹" + m6.getPrice());

        Mobile m7 = new Mobile("Oppo", 25000);
        System.out.println(m7.getModel() + " - ₹" + m7.getPrice());

        Mobile m8 = new Mobile("Vivo");
        System.out.println(m8.getModel() + " - ₹" + m8.getPrice());

        Mobile m9 = new Mobile("Google Pixel", 80000);
        System.out.println(m9.getModel() + " - ₹" + m9.getPrice());

        Mobile m10 = new Mobile("Motorola", 20000);
        System.out.println(m10.getModel() + " - ₹" + m10.getPrice());
    }
}