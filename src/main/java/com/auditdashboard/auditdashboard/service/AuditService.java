package com.auditdashboard.auditdashboard.service;

import com.auditdashboard.auditdashboard.dao.AuditDAO;
import org.springframework.stereotype.Service;

import java.util.List;

public interface AuditService {

    List<AuditDAO> list(Integer page, String event, String type, String ipAddress, String url, String oldValues, String newValues);

}
