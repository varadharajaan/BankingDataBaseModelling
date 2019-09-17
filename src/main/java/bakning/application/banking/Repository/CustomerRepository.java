package bakning.application.banking.Repository;

import bakning.application.banking.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Varadharajan on 2019-09-17 16:03
 * @project name: banking
 */
public interface CustomerRepository  extends JpaRepository<Customer,String> {
}
