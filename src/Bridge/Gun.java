package Bridge;

import Strategy.IAttackStrategy;

public class Gun implements IWeapon {
    public void use(IAttackStrategy strategy) {
        System.out.print("Pew pew pew...");
        strategy.use();
    }
}
