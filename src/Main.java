import javax.swing.plaf.basic.BasicGraphicsUtils;
import java.time.Period;

public class Main {

    public static void main(String[] args) {
        System.out.println("Домашнее задание");

        Author author1 = new Author("Герберт", "Шильдт");
        Author author2 = new Author("Кэти", "Сьерра");

        Book javaCompleteGuide = new Book("Java. Полное руководство", 2022, author1);
        Book learnJava = new Book("Изучаем Java", 2012,  author2);
        learnJava.setPublicationYear(2021);

        System.out.println("Книга 1: " + javaCompleteGuide.getNameBook() + " Автор: " + author1.getFirstName() + " "+ author1.getLastName() + " ; Год издания " + javaCompleteGuide.getPublicationYear());
        System.out.println("Книга 2: " + learnJava.getNameBook()    + " Автор: " + author2.getFirstName() + " " + author2.getLastName()  + " ; Год издания " + learnJava.getPublicationYear());

    }
}
