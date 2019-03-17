import Bridge.*;
import State.*;
import Strategy.*;

public class Main {
    public static void main(String[] args) {
        Hero hero = new Hero(new Gun(), new AliveState());
        hero.status();
        hero.resurrect();
        hero.useWeapon(new HardStrategy());
        hero.useWeapon(new AccurateStrategy());
        hero.setWeapon(new Sword());
        hero.useWeapon(new HardStrategy());
        hero.useWeapon(new AccurateStrategy());
        hero.kill();
        hero.status();
        hero.kill();
        hero.useWeapon(new HardStrategy());
        hero.resurrect();
        hero.status();
    }
}
