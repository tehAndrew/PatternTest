package Bridge;

import Strategy.IAttackStrategy;

public class Sword implements IWeapon {
    public void use(IAttackStrategy strategy) {
        System.out.print("Slash slash stab...");
        strategy.use();
    }
}
