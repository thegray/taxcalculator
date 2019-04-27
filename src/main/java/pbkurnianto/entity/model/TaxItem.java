package pbkurnianto.entity.model;

import javax.persistence.*;

@Entity
@Table(name = "tax_item")
public class TaxItem {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "taxCode")
    private int taxCode;

    @Column(name = "price")
    private double price;

    @Column(name = "billId")
    private int billId;

    public TaxItem() { }

    public TaxItem(String name, int taxCode, double price, int billId) {
        this.name = name;
        this.taxCode = taxCode;
        this.price = price;
        this.billId = billId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
