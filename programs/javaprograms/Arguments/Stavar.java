// this is for return the value

class Satvar{
    // static variable
    static String name = "KTM";
    static float price =100000f;
    static float mailage;
    static String color;
    

public static void main(String[] args){
    String bikeName = nameOfBike();
    System.out.println(bikeName);

    float bikePrice = priceOfBike();
    System.out.println(bikePrice);

    float bikeMailage = mailageOfBike();
    System.out.println(bikeMailage);

    String bikeColor = colorOfBike();
    System.out.println(bikeColor);
}

public static String nameOfBike(){
    return name;
}

public static float priceOfBike(){
    return price;
}

public static float mailageOfBike(){
    return mailage;
}

public static String colorOfBike(){
    return color;
}



}