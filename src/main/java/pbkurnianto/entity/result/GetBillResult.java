package pbkurnianto.entity.result;

import pbkurnianto.entity.model.TaxItem;

import java.util.List;

public class GetBillResult {
    private List<TaxItemResult> itemRes;
    private double priceSubTotal;
    private double taxSubTotal;
    private double grandTotal;

    public GetBillResult() {
    }

    public GetBillResult(List<TaxItemResult> itemRes, double priceSubTotal, double taxSubTotal, double grandTotal) {
        this.itemRes = itemRes;
        this.priceSubTotal = priceSubTotal;
        this.taxSubTotal = taxSubTotal;
        this.grandTotal = grandTotal;
    }

    public List<TaxItemResult> getItemRes() {
        return itemRes;
    }

    public void setItemRes(List<TaxItemResult> itemRes) {
        this.itemRes = itemRes;
    }

    public double getPriceSubTotal() {
        return priceSubTotal;
    }

    public void setPriceSubTotal(double priceSubTotal) {
        this.priceSubTotal = priceSubTotal;
    }

    public double getTaxSubTotal() {
        return taxSubTotal;
    }

    public void setTaxSubTotal(double taxSubTotal) {
        this.taxSubTotal = taxSubTotal;
    }

    public double getGrandTotal() {
        return grandTotal;
    }

    public void setGrandTotal(double grandTotal) {
        this.grandTotal = grandTotal;
    }
}
