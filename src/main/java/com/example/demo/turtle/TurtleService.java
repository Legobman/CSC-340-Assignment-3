package com.example.demo.turtle;

import java.io.IOException;
import java.io.File;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class TurtleService {
    
    @Autowired
    private TurtleRepository turtleRepository;

    public Object getAllTurtles() {
        return turtleRepository.findAll();
    }

    public Turtle getTurtleById(@PathVariable long turtleID) {
        return turtleRepository.findById(turtleID).orElse(null);
    }

    public Object getTurtleBySpecies(String species) {
        return turtleRepository.getTurtleBySpecies(species);
    }

    public Object getTurtlesByName(String name) {
        return turtleRepository.getTurtlesByName(name);
    }

    public Turtle addTurtle(Turtle turtle) {
        return turtleRepository.save(turtle);
    }

    public Turtle updateTurtle(Long turtleID, Turtle turtle) {
        return turtleRepository.save(turtle);
    }

    public void deleteTurtle(Long turtleID) {
        turtleRepository.deleteById(turtleID);
    }

    public String writeJson(Turtle turtle) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            objectMapper.writeValue(new File("turtles.json"), turtle);
            return "Turtle written to JSON file successfully";
        } catch (IOException e) {
            e.printStackTrace();
            return "Error writing turtle to JSON file";
        }
    }

    public Object readJson() {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.readValue(new File("turtles.json"), Turtle.class);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }

    }
}
