package enums;

public enum CharacterClass {
        WARRIOR(2, 1, 0, -2, 0, 0),
        ROGUE(0, 2, -2, 0, 0,1),
        PALADIN(2, -2, 3, 0, 0,0),
        MAGE(-2, 0, 0, 2, 1,2);

        private final int strBonus, dexBonus, consBonus, inlBonus, wisdBonus, chaBonus;


        CharacterClass(int strBonus, int dexBonus, int consBonus, int inlBonus, int wisdBonus, int chaBonus) {
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
