package hu.nive.ujratervezes.oopcollection.army;

public abstract class MilitaryUnit {
    protected int hitPoints;
    protected int attackPower;
    protected boolean isArmored;

    public int getHitPoints() {
        return hitPoints;
    }

    int doDamage() {
        return attackPower;
    }

    abstract void sufferDamage(int damage);

}
