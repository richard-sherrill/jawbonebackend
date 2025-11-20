package com.jawbonepottery.jawbonebackend.controllers;

import com.jawbonepottery.jawbonebackend.models.Expense;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Controller class for managing Expense entities.
 */
@RestController
@RequestMapping("/expenses")
public class ExpenseController {

    @PostMapping("/create")
    public String createExpense(@RequestBody final Expense expense) {
        // Logic to save the expense would go here
        return "Expense created!";
    }

    @PutMapping("/update")
    public String updateExpense(@RequestBody final Expense expense) {
        // Logic to update the expense would go here
        return "Expense updated!";
    }

    @DeleteMapping("/delete/{id}")
    public String deleteExpense(@PathVariable final Long id) {
        // Logic to delete the expense would go here
        return "Expense deleted!";
    }

    @GetMapping("/get/{id}")
    public Expense getExpense(@PathVariable final Long id) {
        // Logic to retrieve the expense would go here
        return new Expense("Sample Expense", null, null, null, null);
    }

    @GetMapping("/all")
    public List<Expense> getAllExpenses() {
        // Logic to retrieve all expenses would go here
        return List.of();
    }

}
