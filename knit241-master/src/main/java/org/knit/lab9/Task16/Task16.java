package org.knit.lab9.Task16;

public class Task16 {
    public static void execute(){
        for (Rank rank: Rank.values()){
            for (SuitEnum suit: SuitEnum.values()){
                System.out.println(suit.getSuit() + " " + rank.getName());
            }
        }
    }
}