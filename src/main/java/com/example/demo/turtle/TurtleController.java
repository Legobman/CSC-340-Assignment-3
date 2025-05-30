package com.example.demo.turtle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TurtleController {
    
    @Autowired
    private TurtleService turtleService;

    @GetMapping("/turtles")
    public Object getAllTurtles() {
        return turtleService.getAllTurtles();
    }

    @GetMapping("/turtles/{id}")
    public Turtle getTurtleById(@PathVariable long id) {
        return turtleService.getTurtleById(id);
    }

    @GetMapping("/turtles/name")
    public Object getTurtlesByName(@RequestParam String key) {
        if (key != null) {
        return turtleService.getTurtlesByName(key);
        } else {
        return turtleService.getAllTurtles();
        }
    }

    @GetMapping("/turtles/species/{species}")
    public Object getTurtleBySpecies(@PathVariable String species) {
        return turtleService.getTurtleBySpecies(species);
    }

    @PostMapping("/turtles")
    public Object addTurtle(@RequestBody Turtle turtle) {
        return turtleService.addTurtle(turtle);
    }

    @PutMapping("/turtles/{id}")
    public Turtle updateTurtle(@PathVariable Long id, @RequestBody Turtle turtle) {
        turtleService.updateTurtle(id, turtle);
        return turtleService.getTurtleById(id);
    }

    @DeleteMapping("/turtles/{id}")
    public Object deleteTurtle(@PathVariable Long id) {
        turtleService.deleteTurtle(id);
        return turtleService.getAllTurtles();
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
