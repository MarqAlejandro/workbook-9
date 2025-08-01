package com.plurasight.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Controller
public class VehicleHtmlController {
    private final VehicleRepository repo;
    public VehicleHtmlController(VehicleRepository repo) {
        this.repo = repo;
    }
    @GetMapping("/vehicles")
    public String getAllVehicles(Model model) {
        List<Vehicle> vehicles = repo.findAll();
        model.addAttribute("vehicles", vehicles);
        return "vehicles";
    }

    @GetMapping("/vehicle/{id}")
    public String getVehicleById(@PathVariable Long id, Model model) {
        return repo.findById(id)
                .map(vehicle -> {
                    model.addAttribute("vehicle", vehicle);
                    return "vehicle";  // This is your Thymeleaf file: vehicle.html
                })
                .orElse("not-found");  // Optional: a custom 404 page
    }



}
