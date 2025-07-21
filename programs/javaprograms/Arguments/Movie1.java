class Movie1{
    static String movieName = "Eleven";
    static float rateings = 4.9f;
    static String heroName = "Naveen Chandra";
    static String language = "Kannada , Tamil, Telugu and more.....";
    static String movieType = "Thrilling movie";
    static Date releasedate = 10-05-2025;

    public static void main(String[] args){
    
    String movieName = nameOfMovie();
    System.out.println(movieName);

    float movieRateing = rateOfMovie();
    System.out.println(movieRateing);

    String movieHeroName = heroNameOfMovie();
    System.out.println(bikeMailage);

    String movieLanguage = languageOfMovie();
    System.out.println(movieLanguage);

    String movieType = typeOfMovie();
    System.out.println(movieType);

    Date movieRele = releOfMovie();
    System.out.println(movieRele);
}

public static String nameOfMovie(){
    return movieName;
}

public static float rateOfMovie(){
    return rateings;
}

public static String heroNameOfMovie(){
    return heroName;
}

public static String languageOfMovie(){
    return language;
}

public static String typeOfMovie(){
    return movieType;
}

public static Date releOfMovie(){
    return releasedate;
}


}