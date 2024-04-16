public class Main {
    public static void main(String[] args) {

        Book book = new Book("451 градус по Фаренгейту", 1953, 224, new Author("Рей","Бредбери",3));
        System.out.println(book);
        System.out.println("Это большая книга? " + book.isBig());
        String findWord = "Рей";
        System.out.println("Есть в заголовке книги или имени автора слово '" + findWord + "'?  "+ book.matches(findWord));
        System.out.println("Стоимость книги " + book.estimatePrice() + " рублей");

        System.out.println();
        Book book2 = new Book("Основание и Империя" , 1952, 670, new Author("Айзек","Азимов",4));
        System.out.println(book2);
        System.out.println("Это большая книга ? " + book2.isBig());
        findWord = "Основание";
        System.out.println("Есть в заголовке книги или имени автора слово '" + findWord + "'?  "+ book2.matches(findWord));
        System.out.println("Стоимость книги " + book2.estimatePrice() + " рублей");

        System.out.println();
        Book book3= new Book("Абсолютное оружие", 1951, 15, new Author("Роберт","Шекли",9));
        System.out.println(book3);
        System.out.println("Это большая книга ? " + book3.isBig());
        findWord = "Основание";
        System.out.println("Есть в заголовке книги или имени автора слово '" + findWord + "'?  "+ book3.matches(findWord));
        System.out.println("Стоимость книги " + book3.estimatePrice() + " рублей");
    }
}
