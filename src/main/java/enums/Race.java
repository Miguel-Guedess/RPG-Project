package enums;

public enum Race {
    HUMAN(1, 1, 0, 1, 1, 1),
    ELF(0, 2, 0, 2, 1,0),
    DWARF(2, 0, 3, 0, 0,0),
    ORC(3, 0, 2, 0, 0,0);

    private final int strBonus, dexBonus, consBonus, inlBonus, wisdBonus, chaBonus;

    Race(int strBonus, int dexBonus, int consBonus, int inlBonus, int wisdBonus, int chaBonus) {
        this.strBonus = strBonus;
        this.dexBonus = dexBonus;
        this.consBonus = consBonus;
        this.inlBonus = inlBonus;
        this.wisdBonus = wisdBonus;
        this.chaBonus = chaBonus;
    }

    public int getStrBonus() {
        return strBonus;
    }

    public int getDexBonus() {
        return dexBonus;
    }

    public int getConsBonus() {
        return consBonus;
    }

    public int getInlBonus() {
        return inlBonus;
    }

    public int getWisdBonus(){
        return wisdBonus;
    }

    public int getChaBonus() {
        return chaBonus;
    }
}
