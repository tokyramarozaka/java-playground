package algo.basics;

import java.util.Arrays;
import java.util.List;

public class SimpleCardGame {
    public static int getValue(String cardValue){
        return switch(cardValue){
            case "T" -> 10;
            case "J" -> 11;
            case "Q" -> 12;
            case "K" -> 13;
            case "A" -> 14;
            default -> Integer.parseInt(cardValue);
        };
    }

    public String winner_byRicka(String[] deckSteve, String[] deckJosh) {
        int a = 0, b = 0;
        for (int i = 0; i < deckJosh.length; i++) {
            if(SimpleCardGame.getValue(deckSteve[i]) > SimpleCardGame.getValue(deckJosh[i]))
                a++;
            else if(SimpleCardGame.getValue(deckSteve[i]) < SimpleCardGame.getValue(deckJosh[i]))
                b++;
        }
        if(a == b)
            return "Tie";

        return a > b ? "Steve win " + a + " to " + b : " Josh win " + b + " to " + a;
    }


    public String winner(String[] deckSteve, String[] deckJosh) {
        List<String> allCards = Arrays.asList(
                "2","3","4","5","6","7","8","9","T","J","Q","K","A"
        );
        int pointsJosh = 0, pointsSteve = 0;
        for (int i = 0; i < deckJosh.length; i++) {
            String cardJosh = deckJosh[i];
            String cardSteve = deckSteve[i];
            if(allCards.indexOf(cardSteve) > allCards.indexOf(cardJosh)){
                pointsSteve++;
            }else if (allCards.indexOf(cardSteve) < allCards.indexOf(cardJosh)){
                pointsJosh++;
            }
        }

        if (pointsJosh > pointsSteve){
            return "Josh win "+pointsJosh+" to "+pointsSteve;
        }else if (pointsJosh < pointsSteve){
            return "Steve win "+pointsSteve+" to "+pointsJosh;
        }
        return "Tie";
    }
}
