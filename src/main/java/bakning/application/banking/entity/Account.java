package bakning.application.banking.entity;

import bakning.application.banking.enums.AccType;
import bakning.application.banking.enums.Status;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

/**
 * @author Varadharajan on 2019-09-17 14:54
 * @project name: banking
 */

@Entity
@Table(name="BankAccount")
public class Account  extends  AuditEntity{

    @Id
    @GenericGenerator(name ="acc_id_gen" , strategy= "bakning.application.banking.entity.AccountIdGenerator")
    @GeneratedValue(generator = "acc_id_gen")
    private String accNumber;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinColumn(name="cus_id")
    private List<Customer> customer;

    @Enumerated(EnumType.STRING)
    @Column(name="AccType")
    private AccType accType;

    @Enumerated(EnumType.STRING)
    @Column(name="Status")
    private Status status;

    public String getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(String accNumber) {
        this.accNumber = accNumber;
    }

    public List<Customer> getCustomer() {
        return customer;
    }

    public void setCustomer(List<Customer> customer) {
        this.customer = customer;
    }

    public AccType getAccType() {
        return accType;
    }

    public void setAccType(AccType accType) {
        this.accType = accType;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
