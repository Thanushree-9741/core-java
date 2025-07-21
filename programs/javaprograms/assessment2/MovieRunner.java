class MovieRunner{
     public static void main(String[] args){
    
    String movieName = Movie.nameOfMovie();
    System.out.println(movieName);

    float movieRateing = Movie.rateOfMovie();
    System.out.println(movieRateing);

    String movieHeroName = Movie.heroNameOfMovie();
    System.out.println(movieHeroName);

    String movieLanguage = Movie.languageOfMovie();
    System.out.println(movieLanguage);

    String movieType = Movie.typeOfMovie();
    System.out.println(movieType);

    String movieRele = Movie.releOfMovie();
    System.out.println(movieRele);
}
}