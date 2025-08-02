public class VehicleRunner {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[5];

        Vehicle v1 = new Vehicle();
        v1.setBrand("Toyota");
        v1.setModel("Innova Crysta");
        v1.setType("SUV");
        v1.setYear(2023);
        v1.setPrice(2500000.0);
        vehicles[0] = v1;

        Vehicle v2 = new Vehicle();
        v2.setBrand("Honda");
        v2.setModel("City");
        v2.setType("Sedan");
        v2.setYear(2022);
        v2.setPrice(1500000.0);
        vehicles[1] = v2;

        Vehicle v3 = new Vehicle();
        v3.setBrand("Royal Enfield");
        v3.setModel("Classic 350");
        v3.setType("Bike");
        v3.setYear(2021);
        v3.setPrice(210000.0);
        vehicles[2] = v3;

        Vehicle v4 = new Vehicle();
        v4.setBrand("Hyundai");
        v4.setModel("i20");
        v4.setType("Hatchback");
        v4.setYear(2024);
        v4.setPrice(1100000.0);
        vehicles[3] = v4;

        Vehicle v5 = new Vehicle();
        v5.setBrand("Tata");
        v5.setModel("Nexon EV");
        v5.setType("Electric SUV");
        v5.setYear(2023);
        v5.setPrice(1600000.0);
        vehicles[4] = v5;

        for (int i = 0; i < vehicles.length; i++) {
            System.out.println("Vehicle " + (i + 1) + " Details:");
            Vehicle v = vehicles[i];
            System.out.println("Brand: " + v.getBrand());
            System.out.println("Model: " + v.getModel());
            System.out.println("Type: " + v.getType());
            System.out.println("Year: " + v.getYear());
            System.out.println("Price: ₹" + v.getPrice());
            System.out.println("----------------------------------");
        }
    }
}
