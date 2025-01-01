public class Book {
   String title;
   String author; 

public  Book(String title,String author){
  this.title=title;
  this.author=author;

}
public static void main(String[] args) {
    Book book=new Book("Atomic habit ","by sneha");
    System.out.println(book.title);
    System.out.println(book.author);
}
}

