import java.util.ArrayList;

public class Bakery {

    private ArrayList<IBake> stock;

    public Bakery() {
        stock = new ArrayList<>();
    }

    public int countStock() {
        return this.stock.size();
    }

    public void addBakedGood(IBake bakedGood) {
        this.stock.add(bakedGood);
    }

}
