package pbkurnianto.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pbkurnianto.entity.model.TaxItem;

import java.util.List;

@Repository
public interface TaxItemDao extends JpaRepository<TaxItem, Integer> {

    @Query(nativeQuery = true, value = "select t.id, t.name, t.tax_code, t.price, t.bill_id " +
            "FROM tax_item t where t.bill_id = :id")
    List<Object[]> getTaxItemsByBillId(@Param("id")int id);
}
