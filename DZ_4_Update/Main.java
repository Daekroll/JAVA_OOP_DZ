package DZ_4_Update;

public class Main {
    public static void main(String[] args) {
        Book<String> book1 = new Book<>("Маша и медведь", "Кто-то");
        Book<String> book2 = new Book<>("Пикник на обочине", "Стругацкие");
        Library library = new Library();
        library.add(book2);
        library.add(book1);
        library.getLibrary();
    }
}
