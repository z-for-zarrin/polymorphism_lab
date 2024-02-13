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

    public abstract String displayBaseFlavour();

    public String getName() {
        return this.name;
    }

    public String getBaseFlavour() {
        return this.baseFlavour;
    }
}
