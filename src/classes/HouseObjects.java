package classes;

import java.util.UUID;
import enums.Location;
public class HouseObjects {
    Location location = Location.HOUSE;
    @Override
    public String toString() {
        return "Объекты в доме";
    }
    public UUID hashcode(){
        return UUID.randomUUID();
    }
    @Override
    public boolean equals (Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HouseObjects that = (HouseObjects) o;

        return this.hashcode() == that.hashcode();
    }
    public static class Floor extends HouseObjects {
        @Override
        public String toString() {
            return "пол";
        }

        @Override
        public boolean equals (Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Floor that = (Floor) o;

            return this.hashcode() == that.hashcode();
        }
    }
    public static class Carpet extends HouseObjects{
        @Override
        public String toString() {
            return "ковёр";
        }

        @Override
        public boolean equals (Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Carpet that = (Carpet) o;

            return this.hashcode() == that.hashcode();
        }


    }

}
