import java.util.ArrayList;

public class Bakery {

    private ArrayList<Cake> cakes;

    public Bakery() {
        cakes = new ArrayList<>();
    }

    public int countCakes() {
        return this.cakes.size();
    }

}
