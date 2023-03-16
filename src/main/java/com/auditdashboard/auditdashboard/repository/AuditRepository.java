package com.auditdashboard.auditdashboard.repository;

import com.auditdashboard.auditdashboard.entity.Audit;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuditRepository extends JpaRepository<Audit, Long> {

    Page<Audit> findAllByEventContainsIgnoreCaseAndAuditableTypeContainsIgnoreCaseAndIpAddressContainsIgnoreCaseAndUrlContainsIgnoreCaseAndOldValuesContainsIgnoreCaseAndNewValuesContainsIgnoreCaseOrderByCreatedAtDesc(String event, String auditableType, String ipAddress, String url, String oldValues, String newValues, Pageable pageable);

}
