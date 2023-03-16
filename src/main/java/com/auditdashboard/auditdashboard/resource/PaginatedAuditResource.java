package com.auditdashboard.auditdashboard.resource;

import com.auditdashboard.auditdashboard.dao.AuditDAO;

import java.util.List;

public class PaginatedAuditResource {

    List<AuditDAO> data;
    long total;
    long page;

    public PaginatedAuditResource(List<AuditDAO> data, long total, long page) {
        this.data = data;
        this.total = total;
        this.page = page;
    }

    public List<AuditDAO> getData() {
        return data;
    }

    public long getTotal() {
        return total;
    }

    public long getPage() {
        return page;
    }
}
