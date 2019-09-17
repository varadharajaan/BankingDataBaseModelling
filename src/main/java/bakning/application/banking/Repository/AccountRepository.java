package bakning.application.banking.Repository;

import bakning.application.banking.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Varadharajan on 2019-09-17 16:04
 * @project name: banking
 */
public interface AccountRepository extends JpaRepository<Account,String> {
}
