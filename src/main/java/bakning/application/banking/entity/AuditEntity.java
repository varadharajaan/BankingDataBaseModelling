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

    public Instant getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Instant createdDate) {
        this.createdDate = createdDate;
    }

    public Instant getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Instant modifyDate) {
        this.modifyDate = modifyDate;
    }

    public String getModifiedBy() {
        return ModifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        ModifiedBy = modifiedBy;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }
}
