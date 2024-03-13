package DZ_4_Update;

public class Book<T> {
    private T name;
    private String author;
    
    public Book(T name, String author){
        this.name = name;
        this.author = author;
    }
    public T getName() {
        return name;
    }
    public String getAuthor() {
        return author;
    }
    @Override
    public String toString() {
        return "Название: " + name + " Автор: " + author+"\n";
    }
}
