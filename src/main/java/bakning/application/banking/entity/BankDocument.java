package bakning.application.banking.entity;

import javax.persistence.*;
import java.util.UUID;

/**
 * @author Varadharajan on 2019-09-17 14:55
 * @project name: banking
 */
@Entity
@Table(name="bankdocument")
public class BankDocument {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name="s3URL", unique = true, nullable = true)
    private String s3URL;

    @Lob
    private byte[] document;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getS3URL() {
        return s3URL;
    }

    public void setS3URL(String s3URL) {
        this.s3URL = s3URL;
    }

    public byte[] getDocument() {
        return document;
    }

    public void setDocument(byte[] document) {
        this.document = document;
    }
}
