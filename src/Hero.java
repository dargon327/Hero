import java.util.Random;
public class Hero {
    private String name;
    private int hitPoints;
    private int heroWins;
    private int opponentWins;
    public Hero(String name) {
        this.name = name;
        hitPoints = 100;
    }
    public String toString() {
        return "Hero{name='" + name + "', hitPoints=" + hitPoints + "}";
    }
    public String getName() {
        return name;
    }
    public int getHitPoints() {
        return hitPoints;
    }
    public void attack(Hero opponent) {
        Random rand = new Random();
        double doub = rand.nextDouble();
        if (doub >= 0.5) {
            hitPoints -= 10;
        } else {
            opponent.hitPoints -= 10;
        }
    }
    public void senzuBean() {
        hitPoints = 100;
    }
    private void fightUntilTheDeathHelper(Hero opponent) {
        while (hitPoints > 0 && opponent.hitPoints > 0) {
            attack(opponent);
        }
    }
    public String fightUntilTheDeath(Hero opponent) {
        senzuBean();
        opponent.senzuBean();
        fightUntilTheDeathHelper(opponent);
        return name + ": " + hitPoints + "     " + opponent.name + ": " + opponent.hitPoints;
    }
    public void nFightsToTheDeathHelper(Hero opponent, int n) {

        for (int i = 0; i < n; i++) {
            senzuBean();
            opponent.senzuBean();
            fightUntilTheDeathHelper(opponent);
            if (hitPoints == 0) {
                opponentWins++;
            } else {
                heroWins++;
            }
        }

    }
    public String nFightsToTheDeath(Hero opponent, int n) {
        heroWins = 0;
        opponentWins = 0;
        nFightsToTheDeathHelper(opponent,n);
        String finish = name + ": " + heroWins + " wins\n" + opponent.name + ": " + opponentWins + " wins\n";
        if (opponentWins > heroWins) {
            finish += opponent.name + " wins!";
        } else if (opponentWins < heroWins) {
            finish += name + " wins!";
        } else {
            finish += "OMG! It was actually a draw!";
        }
        return finish;
    }
    public void dramaticFightToTheDeath(Hero opponent) {
        senzuBean();
        opponent.senzuBean();
        while (hitPoints > 0 && opponent.hitPoints > 0) {
            attack(opponent);
            System.out.println(name + ": " + hitPoints + "     " + opponent.name + ": " + opponent.hitPoints);
            System.out.println();
        }
        if (hitPoints == 0) {
            System.out.println(opponent.name + " wins!");
        } else {
            System.out.println(name + " wins!");
        }
    }
}
