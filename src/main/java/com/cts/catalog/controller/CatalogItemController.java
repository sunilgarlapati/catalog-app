package com.cts.catalog.controller;

import com.cts.catalog.model.CatalogItem;
import com.cts.catalog.repository.CatalogItemRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/catalog")
public class CatalogItemController {
    private final CatalogItemRepository catalogItemRepository;

    public CatalogItemController(CatalogItemRepository catalogItemRepository) {
        this.catalogItemRepository = catalogItemRepository;
    }

    // Create
    @PostMapping
    public CatalogItem createItem(@RequestBody CatalogItem item) {
        return catalogItemRepository.save(item);
    }

    // Read - Get all
    @GetMapping
    public List<CatalogItem> getAllItems() {
        return catalogItemRepository.findAll();
    }

    // Read - Search by name
    @GetMapping("/search")
    public List<CatalogItem> searchItems(@RequestParam String name) {
        return catalogItemRepository.findByNameContainingIgnoreCase(name);
    }

    // Read - Get by ID
    @GetMapping("/{id}")
    public ResponseEntity<CatalogItem> getItemById(@PathVariable Long id) {
        Optional<CatalogItem> item = catalogItemRepository.findById(id);
        return item.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    // Update
    @PutMapping("/{id}")
    public ResponseEntity<CatalogItem> updateItem(@PathVariable Long id, @RequestBody CatalogItem itemDetails) {
        Optional<CatalogItem> optionalItem = catalogItemRepository.findById(id);
        if (optionalItem.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        CatalogItem item = optionalItem.get();
        item.setName(itemDetails.getName());
        item.setDescription(itemDetails.getDescription());
        item.setPrice(itemDetails.getPrice());
        catalogItemRepository.save(item);
        return ResponseEntity.ok(item);
    }

    // Delete
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteItem(@PathVariable Long id) {
        if (!catalogItemRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        catalogItemRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}