// You have to implement a library using Java Class "Library"

// Methods: addBook, issueBook, returnBook, showAvailableBooks
// Properties: Array to store the available books,
// Array to store the issued books
// Create this type of Library  store.

class Library {

    String[] books;
    int no_of_books;

    Library(){
      this.books = new String[50];
      this.no_of_books = 0;
    }

    void addBook(String book) {

        this.books[no_of_books]= book;
        no_of_books++;
        System.out.println(book+" Book Has been Added");

    }
    void showAvailableBooks(){
        System.out.println("Available books are : ");
        for (String book : this.books) {
            if(book==null){
                continue;
            }
            System.out.println("*"+book);
        }
    }
    void issueBook(String book){

        for (int i = 0; i < books.length;i++) {
                if(this.books[i]==book){
                    System.out.println("The book has been issued");
                    this.books[i]=null;  // for removeming from show available books
                    return;
                }
              }
        System.out.println("This book doesn't Exist");
    }

    void returnBook(String book){
       addBook(book);
    }
    
}

public class Exercise4_Online_Library {
    public static void main(String[] args) {

        Library lib = new Library();
        lib.addBook("Data Structure");
        lib.addBook("OOPM");
        lib.addBook("Algorithm");
        lib.addBook("OS");
        lib.showAvailableBooks();
        lib.issueBook("OOPM");
        lib.showAvailableBooks();
        lib.returnBook("OOPM");
        lib.showAvailableBooks();


    }
}
