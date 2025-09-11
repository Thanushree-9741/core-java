package Inhertances.polymorpisum.runtime.downcasting;

public class CinemaRunner {
    public static void main(String[] args){
System.out.println("----------------up casting----------------------------");
        Cinema cin = new Cinema("Kgf");

        Cinema cinema = new Kannada();
        cinema.getCinema(1000);
        System.out.println(cinema.name);

        Cinema cinema1 = new Telugu();
        cinema1.getCinema(10000);
        System.out.println(cinema1.name);
        System.out.println("-----------------------Down casting---------------");
        System.out.println(cinema instanceof Kannada);
        System.out.println(cinema1 instanceof  Telugu);

        if(cinema instanceof Kannada){
            Kannada kan = (Kannada) cinema;
            System.out.println(kan.id);
        }

        if(cinema1 instanceof  Telugu){
            Telugu tel = (Telugu) cinema1;
            System.out.println(tel.budget);
        }
    }
}
