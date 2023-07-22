package hello.com;

class library1 {
    String[] books;
    int no_of_books;

    library1() {
        this.books = new String[100];
        this.no_of_books = 0;
    }

    void addBooks(String book) {
        this.books[no_of_books] = book;
        no_of_books++;
        System.out.println(book + " Has  been Added");
    }

//    void ShowAvailableBooks() {
//        System.out.println("Available Books are: ");
//        for (String Book : this.books) {
//            if ()
//        }
//        System.out.println("* " + book);
//    }
    void ShowAvailableBooks(){
        System.out.println("Available Books are: ");
        for (String book : this.books) {
        if (book == null){
            continue;
        }
            System.out.println("* " + book);
    }}

    void issueBook(String book) {
        for (int i = 0; i < this.books.length; i++) {
            if (this.books[i].equals(book)) {
                System.out.println("The Book has been issued!");
                this.books[i] = null;
                return;
            }
        }
        System.out.println("This Book is Doesn't exist");
    }

    void returnBook(String book) {
        addBooks(book);
    }}
public class Online_Libraray {
    public static void main(String[] args) {
    library1 online = new library1();
    online.addBooks("1984 by George Orwell");
    online.addBooks("Day 21");
    online.addBooks("Earthfall");
    online.ShowAvailableBooks();
    online.issueBook("Day 21");
    online.ShowAvailableBooks();
    online.returnBook("Day 21");
    online.ShowAvailableBooks();
    }
}
