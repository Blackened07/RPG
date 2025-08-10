package Character;

public class Char {
    private final String NAME;
    private final String CHARCLASS;

    private int level;
    private double experience;

    private double health;
    private double mana;
    private double attackPower;
    private double evasion;
    private double spellPower;
    private double armor;
    private double precision;

    private double strength;
    private double stamina;
    private double intellect;
    private double agility;

    public Char(String NAME, String CHARCLASS) {
        this.NAME = NAME;
        if (CHARCLASS.equals("Cane") || CHARCLASS.equals("cane")) CHARCLASS = "Mage";
        else if (CHARCLASS.equals("Knife") || CHARCLASS.equals("knife")) CHARCLASS = "Rogue";
        else if (CHARCLASS.equals("Axe") || CHARCLASS.equals("axe")) CHARCLASS = "Warrior";
        else System.out.println("Некорректный ввод");
        this.CHARCLASS = CHARCLASS;
    }

    public void setStats (String CHARCLASS) {
        if (CHARCLASS.equals("Mage")) {
            this.intellect = 10;
            this.stamina = 7;
            this.agility = 4;
            this.strength = 4;
            this.health = this.stamina * 5;
            this.mana = this.intellect * 5;
            this.spellPower = this.intellect * 0.8;
            this.attackPower = this.strength * 0.8;
            this.armor = this.strength * 0.2;
            this.evasion = this.agility * 5;
            this.precision = this.agility * 5;
            this.level = 1;
            this.experience = 0;
    } else if (CHARCLASS.equals("Rogue")) {
            this.intellect = 7;
            this.stamina = 5;
            this.agility = 10;
            this.strength = 4;
            this.health = this.stamina * 5;
            this.mana = this.intellect * 5;
            this.spellPower = this.intellect * 0.8;
            this.attackPower = this.strength * 0.8;
            this.armor = this.strength * 0.2;
            this.evasion = this.agility * 5;
            this.precision = this.agility * 5;
            this.level = 1;
            this.experience = 0;
        }
     else {
            this.intellect = 4;
            this.stamina = 10;
            this.agility = 1;
            this.strength = 10;
            this.health = this.stamina * 5;
            this.mana = this.intellect * 5;
            this.spellPower = this.intellect * 0.8;
            this.attackPower = this.strength * 0.8;
            this.armor = this.strength * 0.2;
            this.evasion = this.agility * 5;
            this.precision = this.agility * 5;
            this.level = 1;
            this.experience = 0;
        }
    }

    public String getNAME() {
        return NAME;
    }

    public String getCHARCLASS() {
        return CHARCLASS;
    }

    public double getStrength() {
        return strength;
    }

    public double getStamina() {
        return stamina;
    }

    public double getIntellect() {
        return intellect;
    }

    public double getAgility() {
        return agility;
    }

    public double getHealth() {
        return health;
    }

    public double getMana() {
        return mana;
    }

    public double getAttackPower() {
        return attackPower;
    }

    public double getEvasion() {
        return evasion;
    }

    public double getSpellPower() {
        return spellPower;
    }

    public double getArmor() {
        return armor;
    }

    public double getPrecision() {
        return precision;
    }

    public void getInfo() {
        System.out.println("Ваше имя: " + getNAME() + ", " + " Ваш класс: " + getCHARCLASS());
        System.out.println("Интеллект: " + getIntellect() + ", " + "Сила: " + getStrength() +
                ", " + "Ловкость: " + getAgility() + ", " + "Выносливость: " + getStamina());
        System.out.println("Health: " + getHealth() + ", " + "Mana: " + getMana() + ", " + "Attack Power: " + getAttackPower() +
                ", " + "Spell Power: " + getSpellPower() + ", " + "Precision: " + getPrecision() + ", " +
                "Evasion: " + getEvasion() + ", " + "Armor: " + getArmor());
    }

}
