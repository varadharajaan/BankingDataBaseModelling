package bakning.application.banking.entity;

import javax.persistence.*;
import java.util.UUID;

/**
 * @author Varadharajan on 2019-09-17 14:56
 * @project name: banking
 */

@Entity
@Table(name="Address")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name="address", nullable = false)
    private String address;
    @Column(name="zipcode", nullable = false)
    private String zipcode;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
}
