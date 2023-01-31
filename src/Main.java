public class Main {
    public static void main(String[] args) {

        HeroTester hero = new HeroTester();
        hero.TestAllMethodsHaveBeenImplemented();
        hero.TestAttack();
        hero.TestConstructorHitPoints();
        hero.TestConstructorName();
        hero.TestFightToTheDeath();
        hero.TestFightToTheDeathHpZero();
        hero.TestFightToTheDeathNTimes();
        hero.TestFightUntilTheDeathHelperHasBeenImplemented();
        hero.TestFightUntilTheDeathNTimesHelperHasBeenImplemented();
        hero.TestSenzuBean();
        hero.TestSenzuBeanMethodHasBeenImplemented();
        hero.TestToString();
    }
}