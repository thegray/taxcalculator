package pbkurnianto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import pbkurnianto.entity.result.AddItemResult;
import pbkurnianto.entity.result.GetBillResult;
import pbkurnianto.service.BillService;

@RestController
public class BillController {

    @Autowired
    BillService billService;

    @PostMapping("/bill/create")
    public AddItemResult createBill() {
        return billService.createNewBill();
    }

    @GetMapping("/bill/{id}")
    public GetBillResult getBillById(@PathVariable String id) {
        int billId = Integer.parseInt(id);
        GetBillResult bill = billService.getBillById(billId);

        return bill;
    }
}
