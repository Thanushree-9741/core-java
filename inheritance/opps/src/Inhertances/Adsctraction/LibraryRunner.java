package Inhertances.Adsctraction;

public class LibraryRunner {
    public static void main(String[] args) {
        StoriesBooks storiesBooks = new StoriesBooks();
        storiesBooks.totalNoOfBooks();

        TextBooks textBooks = new TextBooks();
        textBooks.totalNoOfBooks();
    }
}
