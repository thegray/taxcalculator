import org.junit.Test;
import pbkurnianto.utils.TaxCode;

import static org.junit.Assert.assertTrue;

public class TaxCodeEnumTest {
    @Test
    public void TaxCode_ShouldNull() {
        TaxCode test = TaxCode.valueOf(4);
        assertTrue(test == null);
    }

    @Test
    public void TaxCode_ShouldOk() {
        TaxCode test = TaxCode.valueOf(1);
        assertTrue(test == TaxCode.FOOD);
    }
}
