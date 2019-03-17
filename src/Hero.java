import Bridge.IWeapon;
import State.IHeroState;
import Strategy.IAttackStrategy;

public class Hero {
    private IWeapon weapon;
    private IHeroState state;

    public Hero(IWeapon weapon, IHeroState state) {
        this.weapon = weapon;
        this.state = state;
    }

    public  void setWeapon(IWeapon weapon) {
        this.weapon = weapon;
    }

    public void kill() {
        state = state.kill();
    }

    public void resurrect() {
        state = state.resurrect();
    }

    public void status() {
        state.status();
    }

    public void useWeapon(IAttackStrategy strategy) {
        state.useWeapon(weapon, strategy);
    }
}
