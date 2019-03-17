package Strategy;

public class HardStrategy implements IAttackStrategy {
    public void use() {
        System.out.println("The attack hit hard but missed most of the enemies.");
    }
}
