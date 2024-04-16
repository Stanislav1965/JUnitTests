import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class BookTests {

    @Test
    public void testEstimatePrice() {
        Book book = new Book("И грянул гром", 1954, 30, new Author("Peй","Бредбери",3));
        int expected = 250;
        int actial = book.estimatePrice();
        Assertions.assertEquals(actial,expected);
    }

    @ParameterizedTest
    @CsvSource({
            "грянул",
            "и",
            "гром"
    })
    public void testMatches(String word) {
        Book book = new Book("И грянул гром", 1954, 30, new Author("Peй", "Бредбери", 3));
        boolean actial = book.matches(word);
        Assertions.assertTrue(actial);
    }

    @ParameterizedTest
    @CsvSource({
            "451 градус по Фаренгейту, 1953, 249",
            "Вино из одуванчиков, 1954, 60",
            "И грянул гром, 1954, 30"
    })
    public void testIsBigFalse(String title, int releaseYear, int pages) {
        Author author = new Author( "Peй","Бредбери",3);
        Book book = new Book(title,releaseYear,pages,author);
        boolean actial = book.isBig();
        Assertions.assertFalse(actial);
    }

    @ParameterizedTest
    @CsvSource({
            "Основание, 1951, 800",
            "Оснoвание и империя, 1953, 900",
            "Я робот, 1951, 501"
    })
    public void testIsBigTrue(String title, int releaseYear, int pages) {
        Author author = new Author( "Айзек","Азимов",4);
        Book book = new Book(title,releaseYear,pages,author);
        boolean actial = book.isBig();
        Assertions.assertTrue(actial);
    }

}
