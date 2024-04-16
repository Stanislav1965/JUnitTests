public class Book {
    private static final int PRICE_PER_PAGE = 3;
    private static final int MIN_PRICE = 250;
    public String title;
    public int releaseYear;
    public Author author;
    public int pages;

    public Book (String title, int releaseYear, int pages, Author author){
        this.title = title;
        this.releaseYear = releaseYear;
        this.pages = pages;
        this.author = author;
    }

    public boolean isBig() {
        return (pages > 500);
    }
    public boolean matches(String word) {
        return title.contains(word) || author.name.contains(word) || author.surname.contains(word);
    }

    public int estimatePrice() {
        int bookPrice = PRICE_PER_PAGE*pages*(int)Math.floor(Math.sqrt(author.rating));
        if ( bookPrice> 250) return  bookPrice;
        return MIN_PRICE;
    }

    public String toString() {
        return "Книга: " + title + ",  Автор: " + author.name + " " + author.surname + ",  Год: " + releaseYear + ",  Страниц: " + pages;
    }

}

