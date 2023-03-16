package com.auditdashboard.auditdashboard.dao;

import com.auditdashboard.auditdashboard.entity.Audit;

import java.util.Date;

public class AuditDAO {

    public AuditDAO(Audit a) {
        this.id = a.getId();
        this.userType = a.getUserType();
        this.userId = a.getUserId();
        this.event = a.getEvent();
        this.auditableId = a.getAuditableId();
        this.auditableType = a.getAuditableType();
        this.oldValues = a.getOldValues();
        this.newValues = a.getNewValues();
        this.url = a.getUrl();
        this.ipAddress = a.getIpAddress();
        this.userAgent = a.getUserAgent();
        this.tags = a.getTags();
        this.createdAt = a.getCreatedAt();
        this.updatedAt = a.getUpdatedAt();
    }

    private Integer id;

    private String userType;

    private String userId;

    private String event;

    private String auditableType;

    private String auditableId;

    private String oldValues;

    private String newValues;

    private String url;

    private String ipAddress;

    private String userAgent;

    private String tags;

    private Date createdAt;

    private Date updatedAt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}
