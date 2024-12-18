package com.example.SpringBootRest.repository;

import com.example.SpringBootRest.entities.Optica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OpticaRepository extends JpaRepository<Optica,Long> {

}
