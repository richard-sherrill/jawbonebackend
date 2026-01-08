package com.jawbonepottery.jawbonebackend.controllers;

import com.jawbonepottery.jawbonebackend.models.Commission;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

/**
 * Controller class for managing Commission entities.
 */
@RestController
@RequestMapping("/api/commissions")
public class CommissionController {

    @PostMapping
    public ResponseEntity<Commission> createEntity(@RequestBody Commission entity) {
        return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).build();
    }

    @GetMapping
    public ResponseEntity<List<Commission>> getAllEntities() {
        return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Commission> getEntity(@PathVariable Long id) {
        return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Commission> updateEntity(@PathVariable Long id, @RequestBody Commission entity) {
        return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEntity(@PathVariable Long id) {
        return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).build();
    }
}
