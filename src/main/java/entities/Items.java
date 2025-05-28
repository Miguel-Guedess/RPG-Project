package entities;

public class Items {
    private String name;
    private ItemsBonus bonus;

    public Items(ItemsBonus bonus, String name) {
        this.bonus = bonus;
        this.name = name;
    }
}
