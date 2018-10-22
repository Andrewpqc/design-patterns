public class Main {
    public static void main(String[] args) {

        BookShelf bookShelf = new BookShelf(10);
        bookShelf.append(new Book("A"));
        bookShelf.append(new Book("B"));
        bookShelf.append(new Book("C"));
        bookShelf.append(new Book("D"));
        Iterator<Book> bookShelfIterator = bookShelf.iterator();
        while (bookShelfIterator.hasNext()) {
            System.out.println(bookShelfIterator.next().getBookName());
        }
    }
}
