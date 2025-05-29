package com.example.demo.turtle;

import io.micrometer.common.lang.NonNull;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "turtles")
public class Turtle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long turtleID;
    @NonNull
    private String name;
    @NonNull
    private String description;
    private String species;
    private double age;

    public Turtle() {
    }

    public Turtle(Long turtleID, String name, String description, String species, double age) {
        this.turtleID = turtleID;
        this.name = name;
        this.description = description;
        this.species = species;
        this.age = age;
    }

    public Turtle(String name, String description, String species, double age) {
        this.name = name;
        this.description = description;
        this.species = species;
        this.age = age;
    }

    public Long getTurtleID() {
        return turtleID;
    }

    public void setTurtleID(Long id) {
        this.turtleID = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }
}