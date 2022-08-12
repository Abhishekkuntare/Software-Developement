package com.company;
class Library{
    String[] books;
    int no_of_books;
    Library(){
        this.books = new String[100];
        no_of_books = 0;
    }

    void addBooks(String book){
        this.books[no_of_books] = book;
        no_of_books++;
        System.out.println(book+ " book is added in collection");
    }

    void getAllBooks(){
        System.out.println("Available Books: ");
        for(String book:this.books){
            if(book == null){
                continue;
            }
            System.out.println("* "+ book);
        }
    }

    void issueBooks(String book){
        for(int i =0;i<books.length;i++){
        if(this.books[i].equals(book)){
            System.out.println(book+" issued you");
            this.books[i] =null;
            return;
        }
        }
    }
    void returnedBook(String book){
        addBooks(book);
        System.out.println(book + " is returned!");
    }
}

public class java_28_Libray {
    public static void main(String []args)
    {
        Library central_lib = new Library();
        central_lib.addBooks("D/-ONU");
        central_lib.addBooks("Algo");
        central_lib.addBooks("Take me out");
        central_lib.addBooks("Nope means Nope");
        central_lib.getAllBooks();

        central_lib.issueBooks("Take me out");
        central_lib.getAllBooks();
        central_lib.returnedBook("Take me out");
        central_lib.getAllBooks();
    }

}
