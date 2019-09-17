package bakning.application.banking.Repository;

import bakning.application.banking.entity.BankDocument;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

/**
 * @author Varadharajan on 2019-09-17 16:06
 * @project name: banking
 */
public interface DocumentRepository  extends JpaRepository<BankDocument, UUID> {
}
