package Show;

import Person.Actor;
import Person.Director;

import java.util.ArrayList;

public class Opera extends MusicalShow{

    private int choirSize;

    public Opera(String title, int duration, Director director, ArrayList<Actor> actor,
                 String musicAuthor, String librettoText, int choirSize){
        super(title, duration, director, actor, musicAuthor,librettoText);
        this.choirSize = choirSize;
    }

    @Override
    public String toString() {
        return super.toString() + "\nКоличество человек в хоре: " + choirSize;
    }
}
