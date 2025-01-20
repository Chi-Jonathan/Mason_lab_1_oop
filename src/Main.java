package src;

public class Main {
    public static void main(String[] args){

        PokemonCard mudkipCard = new PokemonCard("Mudkip", "Cute little guy", 1.99, 30);
        PokemonCard eeveeMunchCard = new PokemonCard("Eevee", "Scawy guy uwu", 792.39, 0);
        mudkipCard.printCard();
        System.out.println();
        eeveeMunchCard.printCard();
    }
}
