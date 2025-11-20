package com.jawbonepottery.jawbonebackend.controllers;

import com.jawbonepottery.jawbonebackend.models.Commission;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/commissions")
public class CommissionController {

    @PostMapping("/create")
    public String createCommission(@RequestBody final Commission commission) {
        // Logic to create a commission would go here
        return "Commission created!";
    }

    @PutMapping("/update")
    public String updateCommission(@RequestBody final Commission commission) {
        // Logic to update a commission would go here
        return "Commission updated!";
    }

    @DeleteMapping("/delete/{id}")
    public String deleteCommission(@PathVariable final Long id) {
        // Logic to delete a commission would go here
        return "Commission deleted!";
    }

    @GetMapping("/get/{id}")
    public Commission getCommission(@PathVariable final Long id) {
        // Logic to retrieve a commission would go here
        return new Commission("Sample Name", null, null, null, null);
    }

    @GetMapping("/all")
    public List<Commission> getAllCommissions() {
        // Logic to retrieve all commissions would go here
        return List.of();
    }
}
