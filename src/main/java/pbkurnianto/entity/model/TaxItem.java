package pbkurnianto.entity.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TaxItem {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;
    private int taxCode;
    private double price;
    private int billId;

    public TaxItem() { }

    public TaxItem(String name, int taxCode, double price, int billId) {
        this.name = name;
        this.taxCode = taxCode;
        this.price = price;
        this.billId = billId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTaxCode() {
        return taxCode;
    }

    public void setTaxCode(int taxCode) {
        this.taxCode = taxCode;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getBillId() {
        return billId;
    }

    public void setBillId(int billId) {
        this.billId = billId;
    }
}
