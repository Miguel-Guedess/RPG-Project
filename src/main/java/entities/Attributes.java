package entities;

import enums.CharacterClass;
import enums.Race;

public class Attributes {

    private double str, dex, cons, inl, wisd, cha;

    public Attributes(double str, double dex, double inl, double cons, double wisd, double cha) {
        this.str = str;
        this.dex = dex;
        this.inl = inl;
        this.cons = cons;
        this.wisd = wisd;
        this.cha = cha;
    }

    public void calculateAtributes(Race race, CharacterClass characterClass){
        this.str = str + race.getStrBonus() + characterClass.getStrBonus();
        this.dex = dex + race.getDexBonus() + characterClass.getDexBonus();
        this.cons = cons + race.getConsBonus() + characterClass.getConsBonus();
        this.inl = inl + race.getInlBonus() + characterClass.getInlBonus();
        this.wisd = wisd + race.getWisdBonus() + characterClass.getWisdBonus();
        this.cha = cha + race.getChaBonus() + characterClass.getChaBonus();
    }


    public double getBonus(double valor){
         return Math.floor((valor - 10.0) / 2.0);
    }

    public double getStr() {
        return str;
    }

    public double getDex() {
        return dex;
    }

    public double getCons() {
        return cons;
    }

    public double getInl() {
        return inl;
    }

    public double getWisd() {
        return wisd;
    }

    public double getCha() {
        return cha;
    }

    @Override
    public String toString() {
        return String.format(
                        "+--------+--------+---------+\n" +
                        "| ATRIB. | VALOR  | BÔNUS   |\n" +
                        "+--------+--------+---------+\n" +
                        "| STR    | %5.1f  | %+6.0f  |\n" +
                        "| DEX    | %5.1f  | %+6.0f  |\n" +
                        "| CONS   | %5.1f  | %+6.0f  |\n" +
                        "| INT    | %5.1f  | %+6.0f  |\n" +
                        "| WISD   | %5.1f  | %+6.0f  |\n" +
                        "| CHA    | %5.1f  | %+6.0f  |\n" +
                        "+--------+--------+---------+",
                str, getBonus(str), dex, getBonus(dex), cons, getBonus(cons),
                inl, getBonus(inl), wisd, getBonus(wisd), cha, getBonus(cha));
    }
}
