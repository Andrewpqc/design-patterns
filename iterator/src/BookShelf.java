public class BookShelf implements Aggregate {
    private Book[] books;
    private int cap;//书架容量
    private int num;//书的数量

    public BookShelf(int n) {
        books = new Book[n];
        cap = n;
        num = 0;
    }

    public void append(Book b) {
        if (num >= cap) throw new RuntimeException("book shelf is full");
        books[num++] = b;
    }

    public Book indexAt(int index) {
        if (index >= num) throw new RuntimeException("no book on index: " + index);
        return books[index];
    }

    public int getCap() {
        return cap;
    }

    public int getNum() {
        return num;
    }

    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }


}
