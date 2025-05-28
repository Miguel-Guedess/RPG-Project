package controller;
import entities.Items;
import entities.ItemsBonus;
import enums.CharacterClass;
import enums.Race;
import entities.Attributes;
import entities.CharacterSheet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Items> inventory = new ArrayList<>();

        try {
            System.out.print("Raça do personagem: ");
            Race race = Race.valueOf(sc.nextLine().toUpperCase());

            System.out.print("Classe do personagem: ");
            CharacterClass characterClass = CharacterClass.valueOf(sc.nextLine().toUpperCase());

            System.out.print("Nome do personagem: ");
            String name = sc.nextLine();

            System.out.println("Digite os atributes:");

            System.out.print("Força (STR): ");
            double str = sc.nextDouble();

            System.out.print("Destreza (DEX): ");
            double dex = sc.nextDouble();

            System.out.print("Constituição (CONS): ");
            double cons = sc.nextDouble();

            System.out.print("Inteligencia (INT): ");
            double inl = sc.nextDouble();

            System.out.print("Sabedoria (SAB): ");
            double wisd = sc.nextDouble();

            System.out.print("Carisma (CAR): ");
            double cha = sc.nextDouble();

            System.out.printf("Adicione Itens no seu Inventario (s/n): ");
            String option = sc.next();

            while (option.equalsIgnoreCase("s")) {
                sc.nextLine(); // Consome a quebra de linha pendente

                System.out.print("Nome do item: ");
                String itemName = sc.nextLine();

                System.out.print("Descrição do item: ");
                String description = sc.nextLine();

                System.out.print("Bônus de Força (STR): ");
                int strBonus = sc.nextInt();

                System.out.print("Bônus de Destreza (DEX): ");
                int dexBonus = sc.nextInt();

                System.out.print("Bônus de Constituição (CONS): ");
                int consBonus = sc.nextInt();

                System.out.print("Bônus de Inteligência (INT): ");
                int inlBonus = sc.nextInt();

                System.out.print("Bônus de Sabedoria (SAB): ");
                int wisdBonus = sc.nextInt();

                System.out.print("Bônus de Carisma (CAR): ");
                int chaBonus = sc.nextInt();

                ItemsBonus itemBonus = new ItemsBonus(strBonus, dexBonus, consBonus, inlBonus, wisdBonus, chaBonus);
                Items item = new Items(itemBonus, name, description);
                inventory.add(item);

                System.out.print("Adicionar outro item? (s/n): ");
                option = sc.next();

            }

            // Cria os objetos
            UUID characterId = UUID.randomUUID();
            Attributes attributes = new Attributes(str, dex, cons, inl, wisd, cha);
            CharacterSheet sheet = new CharacterSheet(characterId, name, characterClass, race, inventory, attributes);


            // Mostra a ficha criada
            System.out.println("\nFicha criada:");
            System.out.println(sheet);
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }
}