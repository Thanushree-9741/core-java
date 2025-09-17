package Inhertances.Adsctraction;

public class TextBooks implements Library{
    @Override
    public void totalNoOfBooks() {
        System.out.println("The total no of text books are " + 300);
    }
}
