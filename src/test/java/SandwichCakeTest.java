import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SandwichCakeTest {

    SandwichCake sandwichCake;

    @BeforeEach
    public void setUp() {
        sandwichCake = new SandwichCake("Victoria Sponge", "vanilla",
                                        "strawberry jam", 2);
    }

    @Test
    public void canCountLayers() {
        assertThat(sandwichCake.countLayers()).isEqualTo(2);
    }

    @Test
    public void canAddLayers() {
        sandwichCake.addLayers(1);
        assertThat(sandwichCake.countLayers()).isEqualTo(3);
    }

}
