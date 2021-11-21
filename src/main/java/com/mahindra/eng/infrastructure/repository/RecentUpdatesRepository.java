package com.mahindra.eng.infrastructure.repository;

import com.mahindra.eng.infrastructure.entity.RecentUpdates;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecentUpdatesRepository extends JpaRepository<RecentUpdates, Long> {
}
