package org.knit.lab9.Task15;

public class Task15 {
    public static void execute(){
        for (Seasons seasons: Seasons.values()){
            System.out.println(seasons + " "+ seasons.getHolyday()+ " "+seasons.getWeather());
        }
    }
}
