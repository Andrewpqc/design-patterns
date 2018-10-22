public class BookShelfIterator implements Iterator<Book> {
    private int num;
    private int index;
    private BookShelf bs_;

    public BookShelfIterator(BookShelf bs) {
        num = bs.getNum();
        index = 0;
        bs_ = bs;
    }

    @Override
    public boolean hasNext() {
        return index !=num;
    }

    @Override
    public Book next() {
        return bs_.indexAt(index++);
    }
}
