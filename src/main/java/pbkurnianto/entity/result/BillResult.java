package pbkurnianto.entity.result;

import pbkurnianto.entity.model.TaxItem;

import java.util.List;

public class BillResult {
    private List<TaxItemResult> itemRes;
    private double priceSubTotal;
    private double taxSubTotal;
    private double grandTotal;

}
