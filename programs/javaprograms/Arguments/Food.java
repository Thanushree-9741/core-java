class Food{
    String name;
    int id;
    float price;
    

    static {
        System.out.println("Welcome to Food world");
        }

 

 public void setName(String food){
 name = food;
 }

 public String getName(){
    
    return name;
 }

 public void setId(int food){
    id = food;
 }

 public int getId(){
  
    return id;
 }

 public void setPrice(float food){
    price = food;

 }

 public float getPrice(){
    
    return  price;
 }

}