package classes;

import enums.EmotionalState;
import enums.Location;
import exceptions.BrokenPropellerException;
import exceptions.KarlsonCaughtFlyingException;
import interfaces.Flyable;

import java.util.UUID;

import static main.Main.getRandom;

public final class Karlson extends Person implements Flyable {
    public class Propeller {
        @Override
        public String toString() {
            return "пропеллер";
        }
        public UUID hashcode(){
            return UUID.randomUUID();
        }
        @Override
        public boolean equals (Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Propeller that = (Propeller) o;

            return this.hashcode() == that.hashcode();
        }
    }
    public Propeller propeller = null;
    public Karlson(String mood, String location) {
        this.name = "Карлсон";
        this.mood = EmotionalState.valueOf(mood);
        this.location = Location.valueOf(location);
    }
    public void checkPropeller() throws BrokenPropellerException {
        if (this.propeller==null){
            throw new BrokenPropellerException("Пропеллер Карлсона сломался!");
        }
    }
    @Override
    public String toString() {
        return "Карлсон";
    }

    @Override
    public boolean equals (Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Karlson that = (Karlson) o;

        return this.hashcode() == that.hashcode();
    }


    public void fly() throws KarlsonCaughtFlyingException {
        System.out.println(this+" взлетел");
        if (getRandom()>0.8){
            throw new KarlsonCaughtFlyingException("Карлсона заметили");
        }

    }
}
