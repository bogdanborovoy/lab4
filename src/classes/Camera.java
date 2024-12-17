package classes;


import java.util.UUID;

public class Camera {
    @Override
    public String toString() {
        return "Камера";
    }
    public UUID hashcode(){
        return UUID.randomUUID();
    }
    @Override
    public boolean equals (Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Camera that = (Camera) o;

        return this.hashcode() == that.hashcode();
    }
}
