package pbkurnianto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pbkurnianto.entity.model.TaxItem;
import pbkurnianto.entity.result.AddItemResult;
import pbkurnianto.service.TaxItemService;
import pbkurnianto.utils.TaxCode;

import java.util.Map;

@RestController
public class TaxItemController {

    @Autowired
    TaxItemService taxItemService;

    @PostMapping("/taxitem")
    public AddItemResult insertTaxItem(@RequestBody Map<String, String> body) {
        String name = body.get("name");
        TaxCode taxcode = TaxCode.valueOf(Integer.parseInt(body.get("tax_code")));
        double price = Double.parseDouble(body.get("price"));
        int billId = Integer.parseInt(body.get("bill_id"));
        TaxItem newItem = new TaxItem(name, taxcode, price, billId);
        return taxItemService.insertTaxItem(newItem);
    }
}
