package Person;

import java.util.Objects;

public class Actor extends Person {

    private double height;

    public Actor(String name, String surname, Gender gender, double height) {
        super(name, surname, gender);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return name + " " + surname + " (" + height + " см" + " )";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Actor actor = (Actor) o;

        return Objects.equals(actor.name, name) &&
                Objects.equals(actor.surname, surname) &&
                actor.height == height;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, height);
    }
}
