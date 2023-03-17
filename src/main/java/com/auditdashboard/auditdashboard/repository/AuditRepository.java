package com.auditdashboard.auditdashboard.repository;

import com.auditdashboard.auditdashboard.entity.Audit;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AuditRepository extends JpaRepository<Audit, Long> {

    Page<Audit> findAllByEventContainsIgnoreCaseAndAuditableIdContainsIgnoreCaseAndAuditableTypeContainsIgnoreCaseAndIpAddressContainsIgnoreCaseAndUrlContainsIgnoreCaseAndOldValuesContainsIgnoreCaseAndNewValuesContainsIgnoreCaseOrderByCreatedAtDesc(String event, String auditableId, String auditableType, String ipAddress, String url, String oldValues, String newValues, Pageable pageable);

    long countByEventContainsIgnoreCaseAndAuditableIdContainsIgnoreCaseAndAuditableTypeContainsIgnoreCaseAndIpAddressContainsIgnoreCaseAndUrlContainsIgnoreCaseAndOldValuesContainsIgnoreCaseAndNewValuesContainsIgnoreCaseOrderByCreatedAtDesc(String event, String auditableId, String auditableType, String ipAddress, String url, String oldValues, String newValues);

    @Query(value =
            "SELECT "+
                    " event " +
                    "FROM Audit a " +
                    "GROUP BY a.event"
    )
    List<String> findGroupByEventWithJPQL();

    @Query(value =
            "SELECT "+
                    " auditableType " +
                    "FROM Audit a " +
                    "GROUP BY a.auditableType"
    )
    List<String> findGroupByAuditableTypeWithJPQL();

}
