package main;

import classes.*;
import enums.EmotionalState;
import exceptions.BrokenPropellerException;
import exceptions.KarlsonCaughtFlyingException;



public class Main {
    public static void main(String[] args){
        Karlson karlson = new Karlson("HAPPY", "HOUSE");
        Baby baby = new Baby("ANXIOUS","HOUSE");
        MrPeck mrPeck = new MrPeck();

        karlson.propeller = karlson.new Propeller(); //non-static inner class

        try {
            karlson.checkPropeller();
        }
        catch (BrokenPropellerException bpe) {
                System.err.println(bpe.getMessage());
                System.exit(1);
        } //checked exception



        HouseObjects.Floor floor = new HouseObjects.Floor(); //static inner class
        HouseObjects.Carpet carpet = new HouseObjects.Carpet(); //static inner class

        Clothes cape = new Clothes(){
            @Override
            public String toString() {
                return "накидку";
            }
        }; //anonymous class



        karlson.dance();
        baby.displayThoughts("Что за дурацкий танец. Но это еще куда ни шло, только бы он не вздумал летать. О, только бы он не летал!");
        karlson.putOn(cape);
        baby.mood = EmotionalState.HAPPY;
        System.out.println();


        try {
            karlson.fly();
        }
        catch (KarlsonCaughtFlyingException e) {
            System.out.println();
            System.out.println(e.getMessage());
            mrPeck.faint();
            mrPeck.callReporters();
        } //unchecked exception

    }



    public static double getRandom(){
        return Math.random();
    }

}