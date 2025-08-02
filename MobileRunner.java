class MobileRunner {
    public static void main(String[] args) {
        Mobile[] mobiles = new Mobile[5];

        Mobile m1 = new Mobile();
        m1.setBrand("Samsung");
        m1.setModel("Galaxy S21");
        m1.setPrice(69999.0);
        m1.setBatteryCapacity(4000);
        m1.setProcessor("Exynos 2100");
        mobiles[0] = m1;

        Mobile m2 = new Mobile();
        m2.setBrand("Apple");
        m2.setModel("iPhone 13");
        m2.setPrice(79999.0);
        m2.setBatteryCapacity(3095);
        m2.setProcessor("A15 Bionic");
        mobiles[1] = m2;

        Mobile m3 = new Mobile();
        m3.setBrand("OnePlus");
        m3.setModel("Nord CE 3");
        m3.setPrice(24999.0);
        m3.setBatteryCapacity(5000);
        m3.setProcessor("Snapdragon 782G");
        mobiles[2] = m3;

        Mobile m4 = new Mobile();
        m4.setBrand("Realme");
        m4.setModel("GT Neo 3");
        m4.setPrice(32999.0);
        m4.setBatteryCapacity(4500);
        m4.setProcessor("Dimensity 8100");
        mobiles[3] = m4;

        Mobile m5 = new Mobile();
        m5.setBrand("Xiaomi");
        m5.setModel("Redmi Note 12 Pro");
        m5.setPrice(27999.0);
        m5.setBatteryCapacity(4980);
        m5.setProcessor("Dimensity 1080");
        mobiles[4] = m5;

        for (int i = 0; i < mobiles.length; i++) {
            System.out.println("Mobile " + (i + 1) + " Details:");
            Mobile mob = mobiles[i];
            System.out.println("Brand: " + mob.getBrand());
            System.out.println("Model: " + mob.getModel());
            System.out.println("Price: ₹" + mob.getPrice());
            System.out.println("Battery Capacity: " + mob.getBatteryCapacity() + " mAh");
            System.out.println("Processor: " + mob.getProcessor());
            System.out.println("----------------------------------");
        }
    }
}
