public class SandwichCake extends Cake {

    String filling;
    int layers;

    public SandwichCake(String name, String baseFlavour, String filling, int layers) {
        super(name, baseFlavour);
        this.filling = filling;
        this.layers = layers;
    }

    public int countLayers() {
        return this.layers;
    }

}
