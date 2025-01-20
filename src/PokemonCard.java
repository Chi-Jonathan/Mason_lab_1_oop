package src;

public class PokemonCard implements IPokemonCard {
    String name;
    String description;
    double price;
    int damage;

    public PokemonCard(String name, String description, double price, int damage) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
    public double getPrice() {
        return price;
    }
    public int getDamage() {
        return damage;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void printCard() {
        System.out.println("Name: " + name);
        System.out.println("Description: " + description);
        System.out.println("Price: " + price);
        System.out.println("Damage: " + damage);
    }
}
