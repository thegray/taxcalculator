package pbkurnianto.entity.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Bill {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Temporal(TemporalType.TIMESTAMP)
    private Date created;

    public Bill() {
    }

    public Bill(int id, Date created) {
        this.id = id;
        this.created = created;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }
}
