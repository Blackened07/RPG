public class Fight {
    public static void Fighting(Orc orcWar, Elf elfDruid) {
        while (true) {
            if ( !orcWar.isAlive && elfDruid.isAlive) {
                System.out.println("Orc is Dead! Elf Wins!");
                break;
            }
            else if (orcWar.isAlive && !elfDruid.isAlive) {
                System.out.println(" Elf is dead! Orc Wins!");
                break;
            }
            else if (!orcWar.isAlive && !elfDruid.isAlive) {
                System.out.println("All is DEAD!");
                break;
            }

        if (orcWar.health <= 0)
            orcWar.isAlive = false;
        else orcWar.health -= elfDruid.attackPower;

        if (elfDruid.health <= 0)
            elfDruid.isAlive = false;
        else elfDruid.health -= orcWar.attackPower;

        }
    }
}
