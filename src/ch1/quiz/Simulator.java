package ch1.quiz;

public class Simulator {
    public static void main(String[] args) {
        Character king = new King();
        king.fight();
        king.setWeapon(new SwordBehavior());
        king.fight();
    }
}
