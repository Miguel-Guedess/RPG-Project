package entities;

public class Items {
    private String name;
    private ItemsBonus bonus;
    private String description;

    public Items(ItemsBonus bonus, String name, String description) {
        this.bonus = bonus;
        this.name = name;
        this.description = description;
    }

    @Override
    public String toString() {
        return "\nNome: " + name +
                "\nDescrição: " + description + bonus;
    }

}
