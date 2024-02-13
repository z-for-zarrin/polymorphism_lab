import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BakeryTest {

    Bakery bakery;

    @BeforeEach
    public void setUp() {
        bakery = new Bakery();
    }

    @Test
    public void canCountCakes() {
        assertThat(bakery.countStock()).isEqualTo(0);

    }

    @Test
    public void canAddCake() {
        Cake cake = new Cupcake("Chocolate Fudge Cupcake", "chocolate");
        Pastry pastry = new Pastry("Croissant");
        bakery.addBakedGood(cake);
        bakery.addBakedGood(pastry);
        assertThat(bakery.countStock()).isEqualTo(2);
    }

}
