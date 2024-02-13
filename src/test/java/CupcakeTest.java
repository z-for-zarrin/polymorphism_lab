import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CupcakeTest {

    Cupcake cupcake;

    @BeforeEach
    public void setUp() {
        cupcake = new Cupcake("Red velvet", "red velvet");
    }

    @Test
    public void canDecorate() {
        cupcake.decorate("cream cheese frosting");
        assertThat(cupcake.getToppings().contains("cream cheese frosting")).isEqualTo(true);
    }

    @Test
    public void canBake() {
        assertThat(cupcake.bake()).isEqualTo("Red velvet has finished baking!");
    }

    @Test
    public void canDisplayBaseFlavour() {
        assertThat(cupcake.displayBaseFlavour()).isEqualTo("Red velvet cupcakes are made with red velvet cake");
    }

}
