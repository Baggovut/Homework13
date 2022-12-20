public class Main {
    public static void main(String[] args) {
        Author a1 = new Author("Ivan","Ivanov");
        Author a2 = new Author("Stepan","Sidorov");

        Book b1 = new Book(a1, "Title 1",1990);
        Book b2 = new Book(a2, "Title 2",2000);

        System.out.println(
                "Имя автора: "+b1.getAuthorFirstName()+"\n"
                        +"Фамилия автора: "+b1.getAuthorLastName()+"\n"
                        +"Название книги: "+b1.getTitle()+"\n"
                        +"Год выпуска книги: "+b1.getReleaseYear()+"\n");

        System.out.println(
                "Имя автора: "+b2.getAuthorFirstName()+"\n"
                        +"Фамилия автора: "+b2.getAuthorLastName()+"\n"
                        +"Название книги: "+b2.getTitle()+"\n"
                        +"Год выпуска книги: "+b2.getReleaseYear()+"\n");

        b2.setReleaseYear(2001);
        System.out.println("Изменённый год выпуска книги: "+b2.getReleaseYear());

        System.out.println();
        System.out.println(b1);
    }
}