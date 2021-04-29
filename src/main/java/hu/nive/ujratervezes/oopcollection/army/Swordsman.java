package hu.nive.ujratervezes.oopcollection.army;

public class Swordsman extends MilitaryUnit{
    private boolean isShielded;

    Swordsman(boolean hasArmor) {
        hitPoints = 100;
        attackPower = 10;
        isArmored = hasArmor;
        isShielded = true;
    }

    @Override
    void sufferDamage(int damage) {
        if (!isShielded) {
            if (isArmored) {
                hitPoints = hitPoints - (damage / 2);
            } else hitPoints = hitPoints - damage;
        } else isShielded = false;
    }
}