package com.auditdashboard.auditdashboard.service;

import com.auditdashboard.auditdashboard.dao.AuditDAO;
import com.auditdashboard.auditdashboard.resource.PaginatedAuditResource;
import org.springframework.stereotype.Service;

import java.util.List;

public interface AuditService {

    PaginatedAuditResource list(Integer page, String event, String id, String type, String ipAddress, String url, String oldValues, String newValues, String createdAt);

    List<String> eventNames();

    List<String> auditableTypes();

}
