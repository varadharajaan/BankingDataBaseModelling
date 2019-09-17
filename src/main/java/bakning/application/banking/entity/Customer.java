package bakning.application.banking.entity;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.ManyToAny;

import javax.persistence.*;
import java.util.Objects;

/**
 * @author Varadharajan on 2019-09-17 14:29
 * @project name: banking
 */

@Entity
@Table(name ="customer")
public class Customer extends  AuditEntity {

    @Id
    @GenericGenerator(name ="seq_id_gen" , strategy= "")
    @GeneratedValue(generator = "seq_id_gen")
    @Column(name="customerId",unique= true, nullable = false)
    private String Id;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "account_id")
    private Account account;

    @Column(name="name")
    private String customerName;

    @Column(name="mobileNumber", unique = true, nullable = false)
    private String mobileNumber;

    @ManyToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name="address_id")
    private Address address;

    @OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name="document_id")
    private  BankDocument documents;

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public BankDocument getDocuments() {
        return documents;
    }

    public void setDocuments(BankDocument documents) {
        this.documents = documents;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(Id, customer.Id) &&
                Objects.equals(account, customer.account) &&
                Objects.equals(customerName, customer.customerName) &&
                Objects.equals(mobileNumber, customer.mobileNumber) &&
                Objects.equals(address, customer.address) &&
                Objects.equals(documents, customer.documents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id, account, customerName, mobileNumber, address, documents);
    }
}
