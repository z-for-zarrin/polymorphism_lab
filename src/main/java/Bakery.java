import java.util.ArrayList;

public class Bakery {

    private ArrayList<IBake> stock;

    public Bakery() {
        stock = new ArrayList<>();
    }

    public int countStock() {
        return this.stock.size();
    }

    public void addBakeGood(Cake cake) {
        this.stock.add(cake);
    }

}
