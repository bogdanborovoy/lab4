package classes;

import enums.EmotionalState;
import enums.Location;

public final class Bimbo extends Dog{

    public Bimbo(String mood, String location) {
        this.name = "Бимбо";
        this.mood = EmotionalState.valueOf(mood);
        this.location = Location.valueOf(location);
    }

    @Override
    public String toString() {
        return "Бимбо";
    }

    @Override
    public boolean equals (Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Bimbo that = (Bimbo) o;

        return this.hashcode() == that.hashcode();
    }


    public void lie(HouseObjects obj){
        System.out.println(this+" лёг на "+obj);
    }
    public void buryHeadInto(Person person){
        System.out.println(this+" уткнулся в плечо "+person+"а");
    }
    public void closeEyes(){
        System.out.println(this+ " закрыл глаза");
    };
    public void bangTail(){
        System.out.println(this+" стучит хвостом");
    };
    public void yap(){
        System.out.println(this+ " лает");
    };
    public void jump(){
        System.out.println(this+" прыгает");
    };


}
