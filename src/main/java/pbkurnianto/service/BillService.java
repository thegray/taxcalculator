package pbkurnianto.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pbkurnianto.dao.BillDao;
import pbkurnianto.entity.model.Bill;

@Service
public class BillService {

    @Autowired
    BillDao billDao;

    public void createNewBill() {
        billDao.create();
        //System.out.printf("create done, result: ", res);
        int lastId = billDao.getLastInsertId();
        System.out.printf("last insert, id %d", lastId);
    }

    public void getBillById(int id) {
        Bill opo = billDao.findOne(id);
        System.out.printf("id: %d\n", opo.getId());
        System.out.printf("date: %s\n", opo.getCreated());
    }

}
