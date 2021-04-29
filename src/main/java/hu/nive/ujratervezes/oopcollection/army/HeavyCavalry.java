package hu.nive.ujratervezes.oopcollection.army;

public class HeavyCavalry extends MilitaryUnit{
    private boolean firstAttack = true;

    public HeavyCavalry() {
        hitPoints = 150;
        attackPower = 20;
        isArmored = true;

    }
    @Override
    int doDamage() {
        if (firstAttack) {
            firstAttack = false;
            return attackPower * 3;
        }
        else return attackPower;
    }


    @Override
    void sufferDamage(int damage) {
        if (isArmored) {
            hitPoints = hitPoints - (damage / 2);
        } else hitPoints = hitPoints - damage;
    }
}