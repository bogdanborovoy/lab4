package classes;

import java.util.UUID;

public class Clothes {
    @Override
    public String toString() {
        return "Одежда";
    }
    public UUID hashcode(){
        return UUID.randomUUID();
    }
    @Override
    public boolean equals (Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Clothes that = (Clothes) o;

        return this.hashcode() == that.hashcode();
    }
}
