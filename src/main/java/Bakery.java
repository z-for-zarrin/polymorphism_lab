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

    public void sell(IBake item) {
        this.stock.remove(item);
    }

    //overloads previous sell() method
    public void sell(ArrayList<IBake> items) {
        for(IBake item : items) {
            this.stock.remove(item);
        }
    }

}
