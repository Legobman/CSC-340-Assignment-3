package com.example.demo.turtle;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface TurtleRepository extends JpaRepository<Turtle, Long>{
    @Query(value = "select * from turtles t where t.species like %?1% ", nativeQuery = true)
    List<Turtle> getTurtleBySpecies(String species);

    @Query(value = "select * from students t where s.name like %?1% ", nativeQuery = true)
    List<Turtle> getTurtlesByName(String name);
}
