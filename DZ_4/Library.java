package DZ_4;

import java.util.ArrayList;


public class Library {
    private ArrayList<LibraryCard<Integer,Book<String>>> library;
    private Integer number1 = 1;

    public Library(){
        this.library = new ArrayList<>();
    }
    public void addBook(Book<String> book){
        LibraryCard<Integer, Book<String>> libraryCard = new LibraryCard<Integer,Book<String>>(number1++, book);
        library.add(libraryCard);
    }
    public void getLibrary() {
        System.out.println(library);
    }
}
