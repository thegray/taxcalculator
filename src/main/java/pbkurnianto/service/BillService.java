package pbkurnianto.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pbkurnianto.dao.BillDao;
import pbkurnianto.dao.TaxItemDao;
import pbkurnianto.entity.result.AddItemResult;
import pbkurnianto.entity.result.GetBillResult;
import pbkurnianto.entity.result.TaxItemResult;

import java.util.ArrayList;
import java.util.List;

@Service
public class BillService {

    @Autowired
    BillDao billDao;

    @Autowired
    TaxItemDao taxItemDao;

    public AddItemResult createNewBill() {
        AddItemResult resp = new AddItemResult("Failed", -1);
        int stat = billDao.create();
        int id = -1;
        if (stat == 1) {
            id = billDao.getLastInsertId();
            resp.setResult("Success");
            resp.setCreated_id(id);
        }
        return resp;
    }

    public GetBillResult getBillById(int id) {
        List<Object[]> list = taxItemDao.getTaxItemsByBillId(id);
        GetBillResult bill = new GetBillResult();
        double priceSubTotal = 0;
        double taxSubTotal = 0;
        double grandTotal = 0;
        List<TaxItemResult> itemRes = new ArrayList<TaxItemResult>();

        if (list.size() > 0) {
            for (Object[] arrObj: list) {
                TaxItemResult taxRes = new TaxItemResult();
                taxRes.setName(String.valueOf(arrObj[1]));
                int taxCode = (int) arrObj[2];
                taxRes.setTaxCode(taxCode);
                taxRes.setPrice((double) arrObj[3]);
                taxRes.setTaxRelated();
                priceSubTotal += taxRes.getPrice();
                taxSubTotal += taxRes.getTax();
                grandTotal += taxRes.getAmount();
                itemRes.add(taxRes);
            }
            bill.setItemRes(itemRes);
            bill.setPriceSubTotal(priceSubTotal);
            bill.setTaxSubTotal(taxSubTotal);
            bill.setGrandTotal(grandTotal);
        }
        return bill;
    }

}
