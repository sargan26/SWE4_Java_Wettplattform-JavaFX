package src.main.classes;

public class Mannschaft {
    private static int idCounter = 0;
    private final int id;
    private String name;
    private double strength;

    public Mannschaft(String name, double strength) {
        this.id = idCounter++;
        this.name = name;
        this.strength = strength;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getStrength() {
        return strength;
    }

    public void setStrength(double strength) {
        this.strength = strength;
    }

    @Override
    public String toString() {
        return "Mannschaft{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", strength=" + strength +
                '}';
    }
}
