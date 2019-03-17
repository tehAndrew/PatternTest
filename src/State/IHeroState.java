package State;

import Strategy.IAttackStrategy;
import Bridge.IWeapon;

public interface IHeroState {
    IHeroState kill();
    IHeroState resurrect();
    void status();
    void useWeapon(IWeapon weapon, IAttackStrategy strategy);
}
