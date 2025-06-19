package com.plurasight.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SandwichController {


    @GetMapping("/sandwich")
    public String getSandwich() {
        return "Here’s your tuna sandwich! 🐟🥪";
    }


    @GetMapping("/movies")
    public String getMovies() {
        return "Here are all your movies";
    }
}


// New HTML controller
@Controller
class SandwichHtmlController {


    @GetMapping("/sandwich-html")
    public String sandwichPage(Model model) {
        model.addAttribute("sandwich", "Grilled Cheese with Tomato 🍅🧀");
        return "sandwich"; // Maps to sandwich.html
    }

    @GetMapping("/movie-html")
    public String moviePage(Model model) {
        model.addAttribute("movie", "Avengers: Endgame");
        return "movie"; // Maps to sandwich.html
    }

    @GetMapping("/database-html")
    public String databasePage(Model model) {
        model.addAttribute("database", "Avengers: Endgame");
        return "database"; // Maps to sandwich.html
    }
}