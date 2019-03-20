package models.contact;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "contact", schema = "cit360contact")

/**
 * Created by Kristin Newill (aingealfire) on 3/19/2019.
 */

public class ContactPK implements Serializable {

    private int id;

    @Id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContactPK contactPK = (ContactPK) o;
        return Objects.equals(id, contactPK.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}
