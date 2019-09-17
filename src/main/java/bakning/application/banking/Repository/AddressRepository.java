package bakning.application.banking.Repository;

import bakning.application.banking.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

/**
 * @author Varadharajan on 2019-09-17 16:05
 * @project name: banking
 */
public interface AddressRepository extends JpaRepository<Address, UUID> {
}
