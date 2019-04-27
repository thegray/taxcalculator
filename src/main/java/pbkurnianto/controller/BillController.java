package pbkurnianto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import pbkurnianto.entity.result.BillResult;
import pbkurnianto.service.BillService;

@RestController
public class BillController {

    @Autowired
    BillService billService;

    @PostMapping("/bill/create")
    public void createBill() {
        billService.createNewBill();
    }

    @GetMapping("/bill/{id}")
    public BillResult getBillById(@PathVariable String id) {
        int billId = Integer.parseInt(id);
        billService.getBillById(billId);

        BillResult bill = new BillResult();
        return bill;
    }
}
