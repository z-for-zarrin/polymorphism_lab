import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BakeryTest {

    Bakery bakery;
    Cake cake;
    Pastry pastry;

    @BeforeEach
    public void setUp() {
        bakery = new Bakery();
        cake = new Cupcake("Chocolate Fudge Cupcake", "chocolate");
        pastry = new Pastry("Croissant");
    }

    @Test
    public void canCountCakes() {
        assertThat(bakery.countStock()).isEqualTo(0);

    }

    @Test
    public void canAddCake() {
        bakery.addBakedGood(cake);
        bakery.addBakedGood(pastry);
        assertThat(bakery.countStock()).isEqualTo(2);
    }

    @Test
    public void canSellOneItem() {
        bakery.addBakedGood(cake);
        bakery.sell(cake);
        assertThat(bakery.countStock()).isEqualTo(0);
    }

    @Test
    public void canSellMultipleItems() {
        bakery.addBakedGood(cake);
        bakery.addBakedGood(pastry);
        ArrayList<IBake> items = new ArrayList<>();
        items.add(cake);
        items.add(pastry);
        bakery.sell(items);
        assertThat(bakery.countStock()).isEqualTo(0);
    }

}
