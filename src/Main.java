import Person.*;
import Show.Ballet;
import Show.Opera;
import Show.Show;


import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Actor actor1 = new Actor("Иван", "Смирнов", Gender.MALE, 170);
        Actor actor2 = new Actor("Владимир", "Кузнецов", Gender.MALE, 183);
        Actor actor3 = new Actor("Мария", "Петрова", Gender.FEMALE, 162);

        Director director1 = new Director("Олег", "Скворцов", Gender.MALE, 11);
        Director director2 = new Director("Анна", "Полякова", Gender.FEMALE, 7);

        String musicAuthor = "Пётр Чайковский";
        String choreographer = "Милана Птицина";

        Show regular = new Show("Комедия Ошибок", 120, director2, new ArrayList<>());
        Opera opera = new Opera("Кармен", 145, director2, new ArrayList<>(),
                "Жорж Бизе", "Судьба женщины Кармен", 40);
        Ballet ballet = new Ballet("Лебединое Озеро", 130, director1, new ArrayList<>(),
                musicAuthor, "Превращенная в лебедя принцесса", choreographer);

        //добавляем актеров в каждое шоу
        regular.addActor(actor1);
        regular.addActor(actor3);

        opera.addActor(actor2);
        opera.addActor(actor3);

        ballet.addActor(actor1);
        ballet.addActor(actor3);

        System.out.println();

        //выводим списки актеров и режиссеров на каждое шоу
        System.out.println("Список актеров для спектакля: ");
        regular.printAllActors();
        regular.printDirector();

        System.out.println();

        System.out.println("Список актеров для оперы: ");
        opera.printAllActors();
        opera.printDirector();

        System.out.println();

        System.out.println("Список актеров для баллета: ");
        ballet.printAllActors();
        ballet.printDirector();

        System.out.println();

        //Замена актера в Спектакле
        System.out.println("Замена актера");
        regular.replaceActor(actor1, actor2);

        System.out.println("Обновленный список: ");
        regular.printAllActors();

        System.out.println();

        //замена актера в опере
        System.out.println("Попытка замены несуществующего актера");
        Actor fakeActor = new Actor("Неизвестный", "Человек", Gender.FEMALE, 170);
        ballet.replaceActor(actor3, fakeActor);

        System.out.println();

        //либретто для оперы
        System.out.println("Либретто оперы: ");
        opera.printLibrettoText();

        System.out.println();

        //либретто для баллета
        System.out.println("Либретто баллета: ");
        ballet.printLibrettoText();


    }
}
