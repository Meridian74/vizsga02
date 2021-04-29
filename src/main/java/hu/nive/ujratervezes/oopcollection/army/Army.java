package hu.nive.ujratervezes.oopcollection.army;

import java.util.ArrayList;
import java.util.List;

public class Army {

    private List<MilitaryUnit> army = new ArrayList<>();

    public void addUnit(MilitaryUnit militaryUnit) {
        army.add(militaryUnit);
    }

    public void damageAll(int damage) {

        for (int i = 0; i < getArmySize(); i++) {
            army.get(i).sufferDamage(damage);
            if (army.get(i).getHitPoints() < 25) {
                army.remove(i);
                i--;
            }
        }
    }

    public int getArmyDamage() {
        int sumDamages = 0;
        for (MilitaryUnit unit : army) {
            sumDamages += unit.doDamage();
        }
        return sumDamages;
    }

    public int getArmySize() {
        return army.size();
    }
}