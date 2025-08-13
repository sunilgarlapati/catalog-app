package com.cts.catalog.repository;

import com.cts.catalog.model.CatalogItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CatalogItemRepository extends JpaRepository<CatalogItem, Long> {
    // Search by name containing (case insensitive)
    List<CatalogItem> findByNameContainingIgnoreCase(String name);
}