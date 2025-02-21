package ch1.quiz;

public class King extends Character {

    public King() {
        weapon = new BowAndArrowBehavior();
    }

    @Override
    public void fight() {
        weapon.useWeapon();
    }
}
