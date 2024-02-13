public abstract class Cake implements IBake{

    private String name;
    private String baseFlavour;

    public Cake(String name, String flavour) {
        this.name = name;
        this.baseFlavour = flavour;
    }

    public String bake() {
        return this.name + " has finished baking!";
    }

}
