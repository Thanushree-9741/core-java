class VehicleRunner {
    public static void main(String[] args) {


        System.out.println("Vehicle Brand & Price List:");

        Vehicle v1 = new Vehicle("Maruti Suzuki", 600000);
         System.out.println(v1.getBrand() + " - ₹" + v1.getPrice());

        Vehicle v2 = new Vehicle("Honda", 800000);
        System.out.println(v2.getBrand() + " - ₹" + v2.getPrice());

        Vehicle v3 = new Vehicle("Toyota", 1200000);
        System.out.println(v3.getBrand() + " - ₹" + v3.getPrice());

        Vehicle v4 = new Vehicle("Hyundai", 750000);
         System.out.println(v4.getBrand() + " - ₹" + v4.getPrice());

        Vehicle v5 = new Vehicle("Ford", 900000);
        System.out.println(v5.getBrand() + " - ₹" + v5.getPrice());

        Vehicle v6 = new Vehicle("Kia", 850000);
        System.out.println(v6.getBrand() + " - ₹" + v6.getPrice());

        Vehicle v7 = new Vehicle("Tata", 700000);
         System.out.println(v7.getBrand() + " - ₹" + v7.getPrice());

        Vehicle v8 = new Vehicle("Mahindra", 950000);
        System.out.println(v8.getBrand() + " - ₹" + v8.getPrice());

        Vehicle v9 = new Vehicle("Renault", 650000);
         System.out.println(v9.getBrand() + " - ₹" + v9.getPrice());

        Vehicle v10 = new Vehicle("Volkswagen", 1000000);
        System.out.println(v10.getBrand() + " - ₹" + v10.getPrice());
        
        }
}
