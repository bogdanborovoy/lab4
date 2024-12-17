package classes;

import enums.EmotionalState;
import enums.Location;

public final class Baby extends Person {
    public Baby(String mood, String location) {
        this.name = "Малыш";
        this.mood = EmotionalState.valueOf(mood);
        this.location = Location.valueOf(location);
    }

    @Override
    public String toString() {
        return "Малыш";
    }

    @Override
    public boolean equals (Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Baby that = (Baby) o;

        return this.hashcode() == that.hashcode();
    }

}
