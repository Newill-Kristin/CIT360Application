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

    @Id
    private int id;
    private String firstName;
    private String lastName;
    private String add1;
    private String city;
    private String state;
    private String zip;
    private String tele;
    private String email;

    public ContactPK() {

    }

    public ContactPK(String firstName, String lastName, String add1, String city, String state, String zip, String tele, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.add1 = add1;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.tele = tele;
        this.email = email;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAdd1() {
        return add1;
    }

    public void setAdd1(String add1) {
        this.add1 = add1;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getTele() {
        return tele;
    }

    public void setTele(String tele) {
        this.tele = tele;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContactPK contactPK = (ContactPK) o;
        return Objects.equals(id, contactPK.id) &&
                Objects.equals(firstName, contactPK.firstName) &&
                Objects.equals(lastName, contactPK.lastName) &&
                Objects.equals(add1, contactPK.add1) &&
                Objects.equals(city, contactPK.city) &&
                Objects.equals(state, contactPK.state) &&
                Objects.equals(zip, contactPK.zip) &&
                Objects.equals(tele, contactPK.tele) &&
                Objects.equals(email, contactPK.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, add1, city, state, zip, tele, email);
    }

}
