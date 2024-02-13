import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class PastryTest {

    Pastry pastry;

    @BeforeEach
    public void setUp() {
        pastry = new Pastry("Croissant");
    }

    @Test
    public void canBake() {
        assertThat(pastry.bake()).isEqualTo("Croissant (pastry) has finished baking!");
    }

}
