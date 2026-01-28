public class Book {

    String book;
    int pages;

    public Book(String book, int pages){
        this.book = book;
        this.pages = pages;
    }
    
    public void printBook(){
        System.out.println("Books name: " + book + " ,Pages: " + pages);
    }

    public static void main(String[] args){
        Book b = new Book("Harry Potter",500);
        b.printBook();    
        
    }
}
