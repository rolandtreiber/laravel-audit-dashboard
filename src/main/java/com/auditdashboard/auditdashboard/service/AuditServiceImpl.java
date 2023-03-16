package com.auditdashboard.auditdashboard.service;

import com.auditdashboard.auditdashboard.dao.AuditDAO;
import com.auditdashboard.auditdashboard.entity.Audit;
import com.auditdashboard.auditdashboard.repository.AuditRepository;
import com.auditdashboard.auditdashboard.resource.PaginatedAuditResource;
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
    public PaginatedAuditResource list(Integer page, String event, String type, String ipAddress, String url, String oldValues, String newValues) {
        System.out.println("Page: "+page);
        Pageable pageable = PageRequest.of(page, 25);
        Page<Audit> audits = auditRepository.findAllByEventContainsIgnoreCaseAndAuditableTypeContainsIgnoreCaseAndIpAddressContainsIgnoreCaseAndUrlContainsIgnoreCaseAndOldValuesContainsIgnoreCaseAndNewValuesContainsIgnoreCaseOrderByCreatedAtDesc(event, type, ipAddress, url, oldValues, newValues, pageable);
        long total = auditRepository.countByEventContainsIgnoreCaseAndAuditableTypeContainsIgnoreCaseAndIpAddressContainsIgnoreCaseAndUrlContainsIgnoreCaseAndOldValuesContainsIgnoreCaseAndNewValuesContainsIgnoreCaseOrderByCreatedAtDesc(event, type, ipAddress, url, oldValues, newValues);

        return new PaginatedAuditResource(
                audits.stream().map(AuditDAO::new).toList(),
                total,
                page
        );
    }

    @Override
    public List<String> eventNames() {
        List<String> result = auditRepository.findGroupByEventWithJPQL();

        System.out.println(result);
        return result.stream().toList();
    }

    @Override
    public List<String> auditableTypes() {
        List<String> result = auditRepository.findGroupByAuditableTypeWithJPQL();

        System.out.println(result);
        return result.stream().toList();
    }


}
