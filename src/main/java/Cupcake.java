import java.util.ArrayList;

public class Cupcake extends Cake{

    private ArrayList<String> toppings;

    public Cupcake(String name, String flavour) {
        super(name, flavour);
        this.toppings = new ArrayList<>();
    }

    public void decorate(String topping) {
        this.toppings.add(topping);
    }

    public ArrayList<String> getToppings() {
        return this.toppings;
    }

}
