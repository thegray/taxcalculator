package pbkurnianto.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pbkurnianto.entity.model.Bill;
import pbkurnianto.entity.model.TaxItem;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface BillDao extends JpaRepository<Bill, Integer> {

    @Modifying
    @Query(value = "insert into bill () values ()", nativeQuery = true)
    @Transactional
    int create();

    @Query(value = "SELECT LAST_INSERT_ID()", nativeQuery = true)
    int getLastInsertId();
}
