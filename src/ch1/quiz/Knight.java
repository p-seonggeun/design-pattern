package ch1.quiz;

public class Knight extends Character {
    public Knight() {
        weapon = new SwordBehavior();
    }

    @Override
    public void fight() {
        weapon.useWeapon();

    }
}
