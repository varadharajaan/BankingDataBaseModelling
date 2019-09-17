package bakning.application.banking.entity;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

import java.io.Serializable;

/**
 * @author Varadharajan on 2019-09-17 15:21
 * @project name: banking
 */
public class AccountIdGenerator implements IdentifierGenerator {

    @Override
    public Serializable generate(SharedSessionContractImplementor sharedSessionContractImplementor, Object o) throws HibernateException {

        String prefix="IND";

        return prefix.concat(String.valueOf(Math.random()));
    }
}
