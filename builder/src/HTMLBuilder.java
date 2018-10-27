public class HTMLBuilder extends Builder {
    @Override
    public void makeItems(String[] items) {
        System.out.println("<ul>");
        for (String s : items)
            System.out.println("<li>" + s + "<\\li>");
        System.out.println("<\\ul>");
    }

    @Override
    public void makeStrng(String string) {
        System.out.println("<p>" + string + "<\\p>");
    }

    @Override
    public void makeTitle(String title) {
        System.out.println("<h1>" + title + "<\\h1>");
    }

    @Override
    public void close() {
        System.out.println();
    }
}
