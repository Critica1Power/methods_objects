public class Main {
    public static void main(String[] args) {
        // Задание 1
        Author aPushkin = new Author("Александр", "Пушкин");
        Author fDostoevskiy = new Author("Федор", "Достоевский");
        Book evgeniyOnegin = new Book("Евгений Онегин", 1833, aPushkin);
        Book crimeAndPunishment = new Book("Преступление и наказание", 1866, fDostoevskiy);


        System.out.println(aPushkin);
        System.out.println(fDostoevskiy);
        System.out.println(evgeniyOnegin);
        System.out.println(crimeAndPunishment);

        crimeAndPunishment.setPublishDate(2022);
        System.out.println();
        System.out.println(crimeAndPunishment);
        System.out.println("Равны ли книги? - " + evgeniyOnegin.equals(crimeAndPunishment));
        System.out.println("Hashcode - " + evgeniyOnegin.hashCode());
    }
}