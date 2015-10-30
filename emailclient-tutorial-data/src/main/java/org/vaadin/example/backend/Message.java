package org.vaadin.example.backend;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Lob;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Message extends AbstractEntity {

    private boolean isRead;
    private boolean isTrashed;
    private String sender;
    @Enumerated(EnumType.STRING)
    private Flag flag;

    public enum Flag {
        FLAG_STAR
    }

    @Temporal(TemporalType.TIMESTAMP)
    private Date sent;
    private String subject;

    @Lob
    private String body;

    public boolean isRead() {
        return isRead;
    }

    public void setRead(boolean isRead) {
        this.isRead = isRead;
    }

    public boolean isTrashed() {
        return isTrashed;
    }

    public void setTrashed(boolean isTrashed) {
        this.isTrashed = isTrashed;
    }

    public Flag getFlag() {
        return flag;
    }

    public void setFlag(Flag flag) {
        this.flag = flag;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public Date getSent() {
        return sent;
    }

    public void setSent(Date sent) {
        this.sent = sent;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
