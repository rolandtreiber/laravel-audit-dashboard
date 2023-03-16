package com.auditdashboard.auditdashboard.service;

import com.auditdashboard.auditdashboard.dao.AuditDAO;
import com.auditdashboard.auditdashboard.entity.Audit;
import com.auditdashboard.auditdashboard.repository.AuditRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("auditService")
public class AuditServiceImpl implements AuditService{

    @Autowired
    AuditRepository auditRepository;


    @Override
    public List<AuditDAO> list(Integer page, String event, String type, String ipAddress, String url, String oldValues, String newValues) {
        System.out.println("Page: "+page);
        Pageable pageable = PageRequest.of(page, 25);
        Page<Audit> audits = auditRepository.findAllByEventContainsIgnoreCaseAndAuditableTypeContainsIgnoreCaseAndIpAddressContainsIgnoreCaseAndUrlContainsIgnoreCaseAndOldValuesContainsIgnoreCaseAndNewValuesContainsIgnoreCaseOrderByCreatedAtDesc(event, type, ipAddress, url, oldValues, newValues, pageable);

        return audits.stream().map(AuditDAO::new).toList();
    }

}
