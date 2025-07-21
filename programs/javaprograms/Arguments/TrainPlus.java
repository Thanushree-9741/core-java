class TrainPlus{

    public static void main(String[] args){
           System.out.println(" Train no is :" + Train.trainNumber);
           System.out.println(" Train block is :" + Train.trainBlock);
           System.out.println(" Train mailage is :" + Train.maileage);
           System.out.println(" Train price is :" + Train.price);
           System.out.println(" Number of passenger is :" + Train.numberOfPass);
           System.out.println(" Train ticket price is :" + Train.ticketPrice);

           int totalPrice = Train.getTotalPrice(12);
           System.out.println(totalPrice);

           int totalAmount = Train.totalAmountInDay();
           System.out.println(totalAmount);

      }
}