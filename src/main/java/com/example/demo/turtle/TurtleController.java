package com.example.demo.turtle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TurtleController {
    
    @Autowired
    private TurtleService turtleService;

    @GetMapping("/turtles")
    public Object getAllTurtles(Model model) {
        model.addAttribute("turtlesList", turtleService.getAllTurtles());
        model.addAttribute("title", "All Turtles");
        return "turtles-list";
    }

    @GetMapping("/turtles/{id}")
    public Object getTurtleById(@PathVariable long id, Model model) {
        model.addAttribute("turtle", turtleService.getTurtleById(id));
        model.addAttribute("title", "Turtle #: " + id);
        return "turtle-details";
    }

    @GetMapping("/turtles/name")
    public Object getTurtlesByName(@RequestParam String key, Model model) {
        if (key != null) {
            model.addAttribute("turtlesList", turtleService.getTurtlesByName(key));
            model.addAttribute("title", "Turtles By Name: " + key);
            return "turtles-list";
        } else {
            return "redirect:/turtles/";
        }
    }

    @GetMapping("/turtles/species/{species}")
    public Object getTurtleBySpecies(@PathVariable String species, Model model) {
        model.addAttribute("turtlesList", turtleService.getTurtleBySpecies(species));
        model.addAttribute("title", "Turtles By Major: " + species);
        return "turtles-list";
    }

    @GetMapping("/turtles/createForm")
    public Object showCreateForm(Model model) {
        Turtle turtle = new Turtle();
        model.addAttribute("turtle", turtle);
        model.addAttribute("title", "Create New Turtle");
        return "turtles-create";
    }

    @PostMapping("/turtles")
    public Object addTurtle(@RequestBody Turtle turtle) {
        Turtle newTurtle = turtleService.addTurtle(turtle);
        return "redirect:/turtles/" + newTurtle.getTurtleID();
    }

    @GetMapping("/turtles/updateForm/{id}")
    public Object showUpdateForm(@PathVariable Long id, Model model) {
        Turtle turtle = turtleService.getTurtleById(id);
        model.addAttribute("turtle", turtle);
        model.addAttribute("title", "Update Turtle: " + id);
        return "turtles-update";
    }

    @PutMapping("/turtles/{id}")
    public Object updateTurtle(@PathVariable Long id, Turtle turtle) {
        turtleService.updateTurtle(id, turtle);
        return "redirect:/turtles/" + id;
    }

    @DeleteMapping("/turtles/{id}")
    public Object deleteTurtle(@PathVariable Long id) {
        turtleService.deleteTurtle(id);
        return "redirect:/turtles/";
    }

    @PostMapping("/turtles/writeFile")
    public Object writeJson(@RequestBody Turtle turtle) {
        turtleService.writeJson(turtle);
        return turtleService.writeJson(turtle);
    }

    @GetMapping("/turtles/readFile")
    public Object readJson() {
        return turtleService.readJson();
    }
}
