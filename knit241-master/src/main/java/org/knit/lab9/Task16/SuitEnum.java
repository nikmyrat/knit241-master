package org.knit.lab9.Task16;

enum SuitEnum {
    PEAKS("Пики"),
    HEARTS("Черви"),
    DIAMONDS("Буби"),
    CROSS("Крести");
    private final String suit;
    SuitEnum(String suit){
        this.suit = suit;
    }
    public String getSuit(){return suit;}
}