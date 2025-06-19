package com.plurasight.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class CitizenHtmlController {

    private final CitizenRepository repo;

    public CitizenHtmlController(CitizenRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/citizens")
    public String getAllCitizens(Model model) {
        List<Citizen> citizens = repo.findAll();
        model.addAttribute("citizens", citizens);
        return "citizens";
    }

    @GetMapping("/citizen/{id}")
    public String getACitizenById(@PathVariable Long id, Model model) {
        return repo.findById(id)
                .map(citizen -> {
                    model.addAttribute("citizen", citizen);
                    return "citizen";  // This is your Thymeleaf file: vehicle.html
                })
                .orElse("not-found");  // Optional: a custom 404 page
    }
}
