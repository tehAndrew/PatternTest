package Bridge;

import Strategy.IAttackStrategy;

public interface IWeapon {
    void use(IAttackStrategy strategy);
}
