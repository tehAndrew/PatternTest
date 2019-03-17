package Strategy;

public class AccurateStrategy implements IAttackStrategy {
    public void use() {
        System.out.println("The attack hit all the enemies, but not very hard.");
    }
}
