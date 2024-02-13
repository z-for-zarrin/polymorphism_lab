public class Pastry implements IBake{

    private String name;

    public Pastry(String name) {
        this.name = name;
    }

    public String bake() {
        return this.name + " (pastry) has finished baking!";
    }

}
