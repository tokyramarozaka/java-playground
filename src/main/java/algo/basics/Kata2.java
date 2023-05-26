package algo.basics;

import java.util.List;
import java.util.stream.Collectors;

public class Kata2 {
    public static int countByPromotion(int promotionYear, List<String> stdList){
        // On convertit l'année en string et on recupère les 2 dernières lettres
        String lastTwoLetters = String.valueOf(promotionYear).substring(2);

        // Filtrer la liste des STD et compter ce qui reste
        // Filtrer : ceux qui ont ces 2 dernières lettres juste après "STD"
        return stdList.stream()
                .filter(std -> std.substring(3,5).equals(lastTwoLetters))
                .collect(Collectors.toList())
                .size();

        // lorsque vous comparez des objets, utilisez "equals"
        // == marche seulement pour les types primitfs : int, float.
    }

    public static int countByCity(List<String> cities, String city){
        return cities.stream()
                .filter(address -> address.toLowerCase().contains(city.toLowerCase()))
                .collect(Collectors.toList())
                .size();
    }

    public static void main(String[] args) {
        List<String> list = List.of(
                "STD21001",
                "STD21002",
                "STD23005",
                "STD21015",
                "STD22088",
                "STD22103",
                "STD30009"
        );

        System.out.println(Kata2.countByPromotion(2021, list)); //3
        System.out.println(Kata2.countByPromotion(2022, list)); //2
        System.out.println(Kata2.countByPromotion(2030, list)); //1

    }
}
