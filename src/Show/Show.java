package Show;

import Person.Actor;
import Person.Director;

import java.util.ArrayList;

public class Show {
    private String title;
    private int duration;
    private Director director;
    private ArrayList<Actor> actor;

    public Show (String title, int duration, Director director, ArrayList<Actor> actor) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.actor = actor;
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    public Director getDirector() {
        return director;
    }

    public ArrayList<Actor> getActor() {
        return actor;
    }

    public void printAllActors() {
        if (actor.isEmpty()) {
            System.out.println("Актеров нет");
            return;
        }

        for (Actor actors : actor) {
            System.out.println(actors);

        }
    }

    public void addActor(Actor actors) {
        if (actor.contains(actors)) {
            System.out.println("Актер: " + actors + " уже добавлен(а)!");
        } else {
            actor.add(actors);
            System.out.println("Актер " + actors + " добавлен(а)!");
        }
    }

    public boolean replaceActor(Actor oldActor, Actor newActor) {
        int index = actor.indexOf(oldActor);
        if (index >= 0) {
            actor.set(index, newActor);
            return true;
        }
        return false;
    }

    public void printDirector() {
        System.out.println("Режиссер спектакля: " + director);
    }

    @Override
    public String toString() {
        return "Спектакль: " + title + "\n" +
                "Длительность: " + duration + " мин\n" +
                "Режиссёр: " + director + "\n" +
                "Количество актёров: " + actor.size();
    }
}
