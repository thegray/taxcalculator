package pbkurnianto.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pbkurnianto.dao.TaxItemDao;
import pbkurnianto.entity.model.TaxItem;
import pbkurnianto.entity.result.AddItemResult;

@Service
public class TaxItemService {

    @Autowired
    TaxItemDao taxItemDao;

    // should return something
    public AddItemResult insertTaxItem(TaxItem newItem) {
        AddItemResult resp = new AddItemResult("Failed", -1);
        TaxItem item = taxItemDao.save(newItem);
        if (item != null) {
            resp.setResult("Success");
            resp.setCreated_id(item.getId());
        }
        return resp;
    }
}
