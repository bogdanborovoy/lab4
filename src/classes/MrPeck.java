package classes;

import enums.EmotionalState;
import enums.Location;

public class MrPeck extends Person{
    public MrPeck(String mood, String location) {
        this.name = "Господин Пек";
        this.mood = EmotionalState.valueOf(mood);
        this.location = Location.valueOf(location);
    }
    public MrPeck() {
        this.name = "Господин Пек";
    }

    @Override
    public String toString() {
        return "Господин Пек";
    }

    @Override
    public boolean equals (Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MrPeck that = (MrPeck) o;

        return this.hashcode() == that.hashcode();
    }

    public void faint(){
        System.out.println(this + " упал в обморок");
    }
    public void callReporters(){
        class Reporter extends Person{
            //local class
            Camera camera;
            public Reporter(){
                this.camera = new Camera();
            }
            @Override
            public String toString() {
                return "людей с телевизионными камерами";
            }

            @Override
            public boolean equals (Object o){
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;

                Reporter that = (Reporter) o;

                return this.hashcode() == that.hashcode();
            }

        }
        System.out.println(this + " позвал " + new Reporter());
    }
}
