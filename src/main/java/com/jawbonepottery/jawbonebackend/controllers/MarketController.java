package com.jawbonepottery.jawbonebackend.controllers;

import com.jawbonepottery.jawbonebackend.models.Market;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Controller class for managing Market entities.
 */
@RestController
@RequestMapping("/markets")
public class MarketController {

    @PostMapping("/create")
    public String createMarket(@RequestBody final Market market) {
        // Logic to save the market would go here
        return "Market created!";
    }

    @PutMapping("/update")
    public String updateMarket(@RequestBody final Market market) {
        // Logic to update the market would go here
        return "Market updated!";
    }

    @DeleteMapping("/delete/{id}")
    public String deleteMarket(@PathVariable final Long id) {
        // Logic to delete the market would go here
        return "Market deleted!";
    }

    @GetMapping("/get/{id}")
    public Market getMarket(@PathVariable final Long id) {
        // Logic to retrieve the market would go here
        return new Market("Sample Market", null, null, null, "This is a sample market", null);
    }

    @GetMapping("/all")
    public List<Market> getAllMarkets() {
        // Logic to retrieve all markets would go here
        return List.of();
    }

}
