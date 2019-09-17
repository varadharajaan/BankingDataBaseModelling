package bakning.application.banking.entity;

import java.time.Instant;

/**
 * @author Varadharajan on 2019-09-17 14:38
 * @project name: banking
 */
public class AuditEntity {
    public Instant createdDate;
    public Instant modifyDate;
    public String ModifiedBy;
    public String createdBy;
}
