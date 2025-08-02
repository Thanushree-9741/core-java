class LaptopRunner {
    public static void main(String[] args) {
        Laptop[] laptops = new Laptop[5];

        Laptop l1 = new Laptop();
        l1.setBrand("Dell");
        l1.setModel("Inspiron 15");
        l1.setPrice(55000);
        l1.setRamSize(8);
        l1.setProcessor("Intel i5");
        laptops[0] = l1;

        Laptop l2 = new Laptop();
        l2.setBrand("HP");
        l2.setModel("Pavilion x360");
        l2.setPrice(62000);
        l2.setRamSize(16);
        l2.setProcessor("Intel i7");
        laptops[1] = l2;

        Laptop l3 = new Laptop();
        l3.setBrand("Lenovo");
        l3.setModel("IdeaPad Slim 3");
        l3.setPrice(48000);
        l3.setRamSize(8);
        l3.setProcessor("AMD Ryzen 5");
        laptops[2] = l3;

        Laptop l4 = new Laptop();
        l4.setBrand("Asus");
        l4.setModel("Vivobook 14");
        l4.setPrice(52000);
        l4.setRamSize(16);
        l4.setProcessor("Intel i5");
        laptops[3] = l4;

        Laptop l5 = new Laptop();
        l5.setBrand("Apple");
        l5.setModel("MacBook Air M1");
        l5.setPrice(90000);
        l5.setRamSize(8);
        l5.setProcessor("Apple M1");
        laptops[4] = l5;

        for (int i = 0; i < laptops.length; i++) {
            System.out.println("Laptop " + (i + 1) + " Details:");
            Laptop lap = laptops[i];
            System.out.println("Brand: " + lap.getBrand());
            System.out.println("Model: " + lap.getModel());
            System.out.println("Price: ₹" + lap.getPrice());
            System.out.println("RAM: " + lap.getRamSize() + " GB");
            System.out.println("Processor: " + lap.getProcessor());
            System.out.println("----------------------------------");
        }
    }
}
