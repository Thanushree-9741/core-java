class MakeupRunner {
    public static void main(String[] args) {
        int[] ids = Makeup.getMakeupId();
        for (int id : ids) {
            System.out.println("Makeup ID: " + id);
        }

        float[] prices = Makeup.getPrice();
        for (float p : prices) {
            System.out.println("Price: " + p);
        }

        long[] sold = Makeup.getUnitsSold();
        for (long s : sold) {
            System.out.println("Units Sold: " + s);
        }

        double[] gst = Makeup.getGst();
        double sum = 0;
        for (double g : gst) {
            System.out.println("GST: " + g);
            sum += g;
        }
        float avg = (float) sum / gst.length;
        System.out.println("Average GST: " + avg);

        byte[] ratings = Makeup.getQualityRating();
        for (byte r : ratings) {
            System.out.println("Quality Rating: " + r);
        }

        short[] qty = Makeup.getQuantityMl();
        for (short q : qty) {
            System.out.println("Quantity (ml): " + q);
        }

        boolean[] branded = Makeup.getIsBranded();
        for (boolean b : branded) {
            System.out.println("Branded: " + b);
        }

        char[] types = Makeup.getProductType();
        for (char t : types) {
            System.out.println("Product Type: " + t);
        }

        String[] brands = Makeup.getBrandName();
        for (String name : brands) {
            System.out.println("Brand Name: " + name);
        }
    }
}
