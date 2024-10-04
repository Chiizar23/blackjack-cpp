public class Slime extends Enemy {
    public Slime() {
        super("Slime");
    }

    @Override
    protected void initializeStats() {
        stats.put(Stats.MAX_HP, 120);
        stats.put(Stats.HP, 120);
        stats.put(Stats.ATTACK, 20);
        stats.put(Stats.DEFENSE, 20);
        stats.put(Stats.SPEED, 4);
    }
}