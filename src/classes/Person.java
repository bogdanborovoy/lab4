package classes;

import enums.EmotionalState;
import enums.Location;

import java.util.UUID;

public abstract class Person {
    public Location location;
    public EmotionalState mood;
    public String name;
    @Override
    public String toString() {
        return "Человек";
    }
    public UUID hashcode(){
        return UUID.randomUUID();
    }
    @Override
    public boolean equals (Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person that = (Person) o;

        return this.hashcode() == that.hashcode();
    }
    public void lie(HouseObjects obj){
        System.out.println(this+" лёг на "+obj);
    }
    public void dance(){
        System.out.println(this + " танцует ");
    }
    public void displayThoughts(String thoughts){
        System.out.println(this +" подумал: "+ "\"" +thoughts + "\"");
    }
    public void putOn(Object cloth){
        System.out.println(this + " надел " + cloth);
    }
    public void faint(){}
    public void callReporters(){}
}
