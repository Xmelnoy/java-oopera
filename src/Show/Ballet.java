package Show;

import Person.Actor;
import Person.Director;

import java.util.ArrayList;

public class Ballet extends MusicalShow {

    private String choreographer;

    public Ballet(String title, int duration, Director director, ArrayList<Actor> actor,
                  String musicAuthor, String librettoText, String choreographer) {
        super(title, duration, director, actor, musicAuthor, librettoText);
        this.choreographer = choreographer;
    }
    @Override
    public String toString() {
        return super.toString() + "\nХореограф: " + choreographer;
    }
}
