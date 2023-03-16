package com.auditdashboard.auditdashboard.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(	name = "audits")
public class Audit {

    public Audit() {
    }

    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "user_type")
    private String userType;

    @Column(name = "user_id", columnDefinition = "char")
    private String userId;

    @Column(name = "event")
    private String event;

    @Column(name = "auditable_type")
    private String auditableType;

    @Column(name = "auditable_id")
    private String auditableId;

    @Column(name = "old_values")
    private String oldValues;

    @Column(name = "new_values")
    private String newValues;

    @Column(name = "url")
    private String url;

    @Column(name = "ip_address", length = 45)
    private String ipAddress;

    @Column(name = "user_agent")
    private String userAgent;

    @Column(name = "tags")
    private String tags;

    @Column(name = "created_at")
    private Date createdAt;

    @Column(name = "updated_at")
    private Date updatedAt;

    public Integer getId() {
        return id;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public String getAuditableType() {
        return auditableType;
    }

    public void setAuditableType(String auditableType) {
        this.auditableType = auditableType;
    }

    public String getAuditableId() {
        return auditableId;
    }

    public void setAuditableId(String auditableId) {
        this.auditableId = auditableId;
    }

    public String getOldValues() {
        return oldValues;
    }

    public void setOldValues(String oldValues) {
        this.oldValues = oldValues;
    }

    public String getNewValues() {
        return newValues;
    }

    public void setNewValues(String newValues) {
        this.newValues = newValues;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getUserAgent() {
        return userAgent;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return "Audit{" +
                "id=" + id +
                ", userType='" + userType + '\'' +
                ", userId='" + userId + '\'' +
                ", event='" + event + '\'' +
                ", auditableType='" + auditableType + '\'' +
                ", auditableId='" + auditableId + '\'' +
                ", oldValues='" + oldValues + '\'' +
                ", newValues='" + newValues + '\'' +
                ", url='" + url + '\'' +
                ", ipAddress='" + ipAddress + '\'' +
                ", userAgent='" + userAgent + '\'' +
                ", tags='" + tags + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
