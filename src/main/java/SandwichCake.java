public class SandwichCake extends Cake {

    private String filling;
    private int layers;

    public SandwichCake(String name, String baseFlavour, String filling, int layers) {
        super(name, baseFlavour);
        this.filling = filling;
        this.layers = layers;
    }

    public int countLayers() {
        return this.layers;
    }

    public void addLayers(int amount) {
        this.layers += amount;
    }
}
