package src;

// This is the interface
// An interface is a template that can be applied to a class, it specifies what a class must do, like a blueprint/outline
// All cards

public interface IPokemonCard {
    String getName();
    String getDescription();
    double getPrice();
    int getDamage();
    void setName(String name);
    void setDescription(String description);
    void setPrice(double price);
    void setDamage(int damage);
    void printCard();

}
