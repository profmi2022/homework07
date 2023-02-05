package lesson07;

public class Main {
    public static void main(String[] args) {

        Author bulgakov = new Author ("Михаил", "Булгаков");
        Author mandelshtam = new Author ("Осип", "Мандельштам");

        Book book1 = new Book("Мастер и Маргарита", bulgakov, 2023);
        Book book2 = new Book("Шум времени", mandelshtam, 1925);

        book2.setPublishingYear(2012);

        System.out.println(book1.getTitle()+", автор "+book1.getAuthor().getName()+" "+book1.getAuthor().getSurname()+
                ", год издания "+book1.getPublishingYear());
        System.out.println(book2.getTitle()+", автор "+book2.getAuthor().getName()+" "+book2.getAuthor().getSurname()+
                ", год издания "+book2.getPublishingYear());

    }
}