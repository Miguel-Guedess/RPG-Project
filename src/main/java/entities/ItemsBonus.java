package entities;

public class ItemsBonus {

        private int str, dex, cons, inl, wisd, cha;

        public ItemsBonus(int str, int dex, int cons, int inl, int wisd, int cha) {
            this.str = str;
            this.dex = dex;
            this.cons = cons;
            this.inl = inl;
            this.wisd = wisd;
            this.cha = cha;
        }

        public int getStr() { return str; }
        public int getDex() { return dex; }
        public int getCons() { return cons; }
        public int getInl() { return inl; }
        public int getWisd() { return wisd; }
        public int getCha() { return cha; }

    @Override
    public String toString() {
        return String.format(
                "\n+--------+-------+\n" +
                        "| ATRIB. | BONUS |\n" +
                        "+--------+-------+\n" +
                        "| STR    |  %d    |\n" +
                        "| DEX    |  %d    |\n" +
                        "| CONS   |  %d    |\n" +
                        "| INT    |  %d    |\n" +
                        "| WISD   |  %d    |\n" +
                        "| CHA    |  %d    |\n" +
                        "+--------+-------+",
                str, dex, cons, inl, wisd, cha
        );
    }

}

