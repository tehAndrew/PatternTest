package State;

import Strategy.IAttackStrategy;
import Bridge.IWeapon;

public class AliveState implements IHeroState {
    public IHeroState kill() {
        System.out.println("KILL: Hero was killed.");
        return new DeadState();
    }

    public IHeroState resurrect() {
        System.out.println("RESURRECT: Hero is already alive.");
        return this;
    }

    public void status() {
        System.out.println("STATUS: Hero is alive.");
    }

    public void useWeapon(IWeapon weapon, IAttackStrategy strategy) {
        System.out.print("ATTACK: ");
        weapon.use(strategy);
    }
}
