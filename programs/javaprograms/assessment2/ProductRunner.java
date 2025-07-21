class ProductRunner {
    public static void main(String[] args) {
        System.out.println("Product ID: " + Product.productId);
        System.out.println("Name: " + Product.name);
        System.out.println("Price: " + Product.price);
        System.out.println("Brand: " + Product.brand);
        System.out.println("Stock: " + Product.stock);

        
        
        float bill = Product.totalCost(5);    
        System.out.println("Total Cost (5): " + bill );

        boolean avi = Product.isAvailable();
        System.out.println("Available: " + avi );
        System.out.println("Brand: " + Product.getBrand());
        System.out.println("Info: " + Product.getProductInfo());

        float billDiscount = Product.discountPrice(500);
        System.out.println("After Discount: " + billDiscount);
    }
}