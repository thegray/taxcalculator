package pbkurnianto.entity.result;

import pbkurnianto.entity.model.TaxItem;
import pbkurnianto.utils.TaxCode;

public class TaxItemResult {
    private String name;
    private TaxCode taxCode;
    private double price;
    private String type;
    private String refundable;
    private double tax;
    private double amount;

    public TaxItemResult() {
    }

    public TaxItemResult(String name, TaxCode taxCode, double price, String type, String refundable, double tax, double amount) {
        this.name = name;
        this.taxCode = taxCode;
        this.price = price;
        this.type = type;
        this.refundable = refundable;
        this.tax = tax;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TaxCode getTaxCode() {
        return taxCode;
    }

    public void setTaxCode(TaxCode taxCode) {
        this.taxCode = taxCode;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
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

    public void calculateFinal() {
        switch (this.taxCode) {
            case FOOD: {
                this.refundable = "Yes";
                this.type = "Food & Beverage";
                this.tax = this.price * 0.1;
            }
            break;
            case TOBACCO: {
                this.refundable = "No";
                this.type = "Tobacco";
                this.tax = (this.price * 0.02) + 10;
            }
            break;
            case ENTERTAINMENT: {
                this.refundable = "No";
                this.type = "Entertainment";
                if (this.price >= 100) {
                    double calcTax = price - 100;
                    this.tax = calcTax * 0.01;
                } else
                    this.tax = 0;
            }
            break;
            default:
            break;
        }
        this.amount = this.tax + this.price;
    }
}
