package DZ_4_Update;

import java.util.ArrayList;


public class Library implements Add{
    private ArrayList<LibraryCard<Integer,Book<String>>> library;
    private Integer number1 = 1;

    public Library(){
        this.library = new ArrayList<>();
    }
    public void setLibrary(ArrayList<LibraryCard<Integer, Book<String>>> library) {
        this.library = library;
    }
    public void getLibrary() {
        System.out.println(library);
    }

    @Override
    public void add(){

    }
    /*
     * Метод add был изначально, 
     * я подумал что это единственное что можно вынести наружу,
     * но мозгов придумать что-то получше не хватило, теперь он интерфейс 
     * метод которого я перегрузил добавлением аргумента
     */
    public void add(Book<String> book){
        LibraryCard<Integer, Book<String>> libraryCard = new LibraryCard<Integer,Book<String>>(number1++, book);
        library.add(libraryCard);
    }
}
   

