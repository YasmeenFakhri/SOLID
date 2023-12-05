package SRP.GOOD;

public class Main {
    public static void main(String[] args)  {
        Book book = new Book("moon","conan", "police") ;
        BookPrinter print = new BookPrinter() ;
        print.printAuthorName(book);
        System.out.println(book.getAuthor());
    }
}
