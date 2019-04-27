package pbkurnianto.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import pbkurnianto.entity.model.TaxItem;
import pbkurnianto.entity.spec.TaxItemSpec;

import java.util.Map;

public class TaxItemController {

    @PostMapping("/taxitem")
    public void insertTaxItem(@RequestBody Map<String, String> body) {
        String name = body.get("name");
        int taxcode = Integer.parseInt(body.get("taxcode"));
        double price = Double.parseDouble(body.get("price"));
        int billId = Integer.parseInt(body.get("billid"));
        TaxItem newItem = new TaxItem(name, taxcode, price, billId);
        // call service
        // ...
    }
}
