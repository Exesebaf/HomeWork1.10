package com.company;

public class Main {
    public static void main(String[] args) {
        Author levTolstoy = new Author("lev", "Tolstoy");
        Book warAndPeace = new Book("War and Peace", 1965, levTolstoy);
        warAndPeace.setPublishDate(1865);
        System.out.println(warAndPeace);
        Author terryGoodkaind = new Author("Terry", "Goodkaind");
        Book swordOfTruth = new Book("Sword of truth", 1997, terryGoodkaind);
        System.out.println(swordOfTruth);
        Author levTolstoy1 = new Author("lev", "Tolstoy");
        Book annaKarenina = new Book("Anna Karenina", 1878, levTolstoy1);
        System.out.println(annaKarenina);

        System.out.println("Одинаковые ли авторы: " + levTolstoy.equals(terryGoodkaind));
        System.out.println("Одинаковые ли авторы: " + levTolstoy.equals(levTolstoy1));
        System.out.println("Одинаковые ли книги c автором: " + warAndPeace.equals(swordOfTruth));
        System.out.println("Значение хешкода для Льва Толстого:  " + levTolstoy.hashCode());
        System.out.println("Значение хешкода для Терри Гудкаин:" + swordOfTruth.hashCode());
        System.out.println("Значение хешкода для Льва Толстого: " + levTolstoy1.hashCode());

    }
}