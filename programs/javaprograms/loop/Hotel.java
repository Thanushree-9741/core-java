class Hotel {
    private String name;
    private String location;
    private int rooms;
    private float rating;

    public static String category;

    static {
        category = "Hospitality";
        System.out.println("Static Block in Hotel");
    }

    {
        System.out.println("Non-Static Block in Hotel");
    }

   public void setName(String hotelName){
        name = hotelName;
   }
  

   public String getName(){
    return name;
   }


   public void setLocation(String loc){
        location = loc;
   }
  

   public String getLocation(){
    return location;
   }

   public void setRooms(int room){
   rooms = room;
   }

   public int getRooms(){
    return rooms;
   }

   public void setRating(float rate){
    rating = rate;
   }

   public float getRating(){
    return rating;
   }

   

}
