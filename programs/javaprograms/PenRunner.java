class PenRunner {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.setPenName("Bright");
        System.out.println(pen1.getPenName());
        System.out.println();

        Pen pen2 = new Pen();
        pen2.setColour("Blue");
        System.out.println(pen2.getColour());
         System.out.println();

        Pen pen3 = new Pen();
        pen3.setPrice(10);
        System.out.println(pen3.getPrice());
         System.out.println();

        Pen pen4 = new Pen();
        pen4.setPenName("Bright");
        System.out.println(pen4.getPenName());
         System.out.println();

        pen4.setColour("Red");
        System.out.println(pen4.getColour());
         System.out.println();

        Pen pen5 = new Pen();
        pen5.setPenName("Bright");
        System.out.println(pen5.getPenName());
         System.out.println();

        pen5.setColour("Red");
        System.out.println(pen5.getColour());
        System.out.println();


        pen5.setPrice(10);
        System.out.println(pen5.getPrice());
        System.out.println();

        Pen pen6 = new Pen("XO");
        System.out.println(pen6.getPenName());
       

        pen6.setPenName("Butterfly");
        System.out.println(pen6.getPenName());
        System.out.println();

        Pen pen7 = new Pen("Pink", true);
        System.out.println(pen7.getColour());
        

        pen7.setColour("Blue");
        System.out.println(pen7.getColour());
        System.out.println();

        Pen pen8 = new Pen(15);
        System.out.println(pen8.getPrice());

        pen8.setPrice(10);
        System.out.println(pen8.getPrice());
        System.out.println();

        Pen pen9 = new Pen("Cello", "Navy");
        System.out.println(pen9.getPenName());
        System.out.println(pen9.getColour());

        pen9.setPenName("Bright");
        System.out.println(pen9.getPenName());

        pen9.setColour("Red");
        System.out.println(pen9.getColour());
        System.out.println();

        Pen pen10 = new Pen("Parker", 10);
        System.out.println(pen10.getPenName());
        System.out.println(pen10.getPrice());

        pen10.setPenName("Bright");
        System.out.println(pen10.getPenName());

        pen10.setPrice(10);
        System.out.println(pen10.getPrice());
        System.out.println();
    }
}
