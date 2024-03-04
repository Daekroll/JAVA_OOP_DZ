package DZ_4;

public class LibraryCard<K,V> {
    private K number;
    private V bookInfo;

    public LibraryCard(K number, V bookInfo){
        this.bookInfo = bookInfo;
        this.number = number;
    }
    public V getBookInfo() {
        return bookInfo;
    }
    public K getNumber() {
        return number;
    }
    public void setBookInfo(V bookInfo) {
        this.bookInfo = bookInfo;
    }
    public void setNumber(K number) {
        this.number = number;
    }
    @Override
    public String toString() {
        return "№ " + number+  " Info: " + bookInfo;
    }
}
