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

}
