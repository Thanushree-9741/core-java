class Train {
    
    static char trainBlock = 'B';
    static short trainNumber = 12;
    static float maileage = 20.0f;
    static int price = 10000000;
    static int numberOfPass = 100;
    static int ticketPrice = 120;
      

    public static int getTotalPrice(int numberOfTrine) {
        int totalPrice = price * numberOfTrine;
        return totalPrice;
    }

    public static int totalAmountInDay(){
        int totalAmount = numberOfPass * ticketPrice;
        return totalAmount;
    }
}