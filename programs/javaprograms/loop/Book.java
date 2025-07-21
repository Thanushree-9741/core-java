class Book{
    String name = "notebook";
    float price;

    public Book(){

    }

    public static void main(String[] args){

        Book book = new Book();
        //book.name = "Classmate";
        System.out.println(book.name);
        book.setBookName("chandra's");
        System.out.println(book.name);


        Book book1 = new Book();
        book1.price = 24f;
        System.out.println(book1.price);
        book1.setPrice(30f);
        System.out.print(book1.price);

    }
// without return type
    public void setBookName(String book){
        name = book;
    }
// with return type
    public float getPrice(float book1){
        price = book1;
        return price;
    }
}






