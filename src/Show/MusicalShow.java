package Show;

import Person.Actor;
import Person.Director;

import java.util.ArrayList;

public class MusicalShow extends Show{
    private String musicAuthor;
    private String librettoText;

    public MusicalShow(String title, int duration, Director director,
                       ArrayList<Actor> actor, String musicAuthor, String librettoText) {
        super(title, duration, director, actor);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    public String getMusicAuthor() {
        return musicAuthor;
    }

    public String getLibrettoText() {
        return librettoText;
    }

    public void printLibrettoText() {
        System.out.println(librettoText);
    }

    @Override
    public String toString() {
        return super.toString() + "\nАвтор музыки: " + musicAuthor +
                "\nТекст либретто: " + librettoText;
    }
}
