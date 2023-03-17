package com.auditdashboard.auditdashboard.controller;

import com.auditdashboard.auditdashboard.dao.AuditDAO;
import com.auditdashboard.auditdashboard.resource.PaginatedAuditResource;
import com.auditdashboard.auditdashboard.service.AuditService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("search")
public class AuditController {

    @Autowired
    AuditService auditService;

    @GetMapping("")
    public PaginatedAuditResource list(@Valid @RequestParam(value = "page", defaultValue = "0") Integer page,
                                       @RequestParam(value = "event", defaultValue = "") String event,
                                       @RequestParam(value = "auditable_id", defaultValue = "") String auditId,
                                       @RequestParam(value = "auditable_type", defaultValue = "") String auditType,
                                       @RequestParam(value = "ipAddress", defaultValue = "") String ipAddress,
                                       @RequestParam(value = "url", defaultValue = "") String url,
                                       @RequestParam(value = "old_values", defaultValue = "") String oldValues,
                                       @RequestParam(value = "new_values", defaultValue = "") String newValues
                               ) {
        return auditService.list(page, event, auditId, auditType, ipAddress, url, oldValues, newValues);
    }

    @GetMapping("event-types")
    public List<String> getEventNames() {
        return auditService.eventNames();
    }

    @GetMapping("auditable-types")
    public List<String> auditableTypes() {
        return auditService.auditableTypes();
    }

}
