import org.junit.Test;
import pbkurnianto.entity.result.TaxItemResult;
import pbkurnianto.utils.TaxCode;

import static org.junit.Assert.assertTrue;

public class TaxItemResultTest {
    @Test
    public void calculateFinal_FoodShouldOK() {
        TaxItemResult taxRes = new TaxItemResult();
        taxRes.setTaxCode(TaxCode.FOOD);
        taxRes.setPrice(100);
        taxRes.calculateFinal();
        assertTrue(taxRes.getAmount() == 110);
        assertTrue(taxRes.getTax() == 10);
        assertTrue(taxRes.getRefundable() == "Yes");
    }

    @Test
    public void calculateFinal_TobaccoShouldOK() {
        TaxItemResult taxRes = new TaxItemResult();
        taxRes.setTaxCode(TaxCode.TOBACCO);
        taxRes.setPrice(100);
        taxRes.calculateFinal();
        assertTrue(taxRes.getAmount() == 112);
        assertTrue(taxRes.getTax() == 12);
        assertTrue(taxRes.getRefundable() == "No");
    }

    @Test
    public void calculateFinal_EntShouldOK() {
        TaxItemResult taxRes = new TaxItemResult();
        taxRes.setTaxCode(TaxCode.ENTERTAINMENT);
        taxRes.setPrice(200);
        taxRes.calculateFinal();
        assertTrue(taxRes.getAmount() == 201);
        assertTrue(taxRes.getTax() == 1);
        assertTrue(taxRes.getRefundable() == "No");
    }
}
