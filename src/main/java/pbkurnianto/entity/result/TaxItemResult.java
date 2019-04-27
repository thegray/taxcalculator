package pbkurnianto.entity.result;

import pbkurnianto.entity.model.TaxItem;

public class TaxItemResult {
    private TaxItem item;
    private String type;
    private String refundable;
    private double tax;
    private double amount;

    public TaxItemResult() {
    }

    public TaxItemResult(TaxItem item, String type, String refundable, double tax, double amount) {
        this.item = item;
        this.type = type;
        this.refundable = refundable;
        this.tax = tax;
        this.amount = amount;
    }

    public TaxItem getItem() {
        return item;
    }

    public void setItem(TaxItem item) {
        this.item = item;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRefundable() {
        return refundable;
    }

    public void setRefundable(String refundable) {
        this.refundable = refundable;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
