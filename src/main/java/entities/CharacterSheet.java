package entities;

import enums.CharacterClass;
import enums.Race;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class CharacterSheet {
    private UUID id;
    private String name;
    private CharacterClass characterClass;
    private Race race;
    private List<Items> inventory = new ArrayList<>();
    private Attributes attributes;

    public CharacterSheet(UUID id, String name, CharacterClass characterClass, Race race, List<Items> inventory, Attributes attributes) {
        this.id = id;
        this.name = name;
        this.characterClass = characterClass;
        this.race = race;
        this.inventory = inventory;
        this.attributes = attributes;
        this.attributes.calculateAtributes(race, characterClass);
    }

    public CharacterClass getCharacterClass() {
        return characterClass;
    }

    public Race getRace() {
        return race;
    }

    public List<Items> getInventory() {
        return inventory;
    }

    public void addItens(Items item) {
        inventory.add(item);
    }

    @Override
    public String toString() {
        return String.format(
                "Personagem: %s\n" +
                        "Raça: %s\n" +
                        "Classe: %s\n" +
                        attributes +
                        "\nINVENTARIO" + inventory,
                        name, race, characterClass);
    }

}

