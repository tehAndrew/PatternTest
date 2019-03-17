package State;

import Strategy.IAttackStrategy;
import Bridge.IWeapon;

public class DeadState implements IHeroState {
    public IHeroState kill() {
        System.out.println("KILL: Hero was killed even more, but is still just dead.");
        return this;
    }

    public IHeroState resurrect() {
        System.out.println("RESURRECT: Hero was resurrected.");
        return new AliveState();
    }

    public void status() {
        System.out.println("STATUS: Hero is very dead.");
    }

    public void useWeapon(IWeapon weapon, IAttackStrategy strategy) {
        System.out.println("ATTACK: Hero can't attack. Hero is dead af.");
    }
}
