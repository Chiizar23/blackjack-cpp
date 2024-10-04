import javax.swing.*;

/** Duende **/
public class Duende extends Enemy {
    public Duende(String name) {
        super(name);
    }

    @Override
    protected void initializeStats() {
        stats.put(Stats.MAX_HP, 70);
        stats.put(Stats.HP, 70);
        stats.put(Stats.ATTACK, 30);
        stats.put(Stats.DEFENSE, 8);
        stats.put(Stats.SPEED, 12);
    }

    /**Calcula ataque**/
    @Override
    public void attack(Player player) {
        JOptionPane.showMessageDialog(null, name + " lanza un hechizo a " + player.getName());
        super.attack(player);
    }
}