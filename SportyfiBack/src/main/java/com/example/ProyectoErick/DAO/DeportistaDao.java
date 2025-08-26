package com.example.ProyectoErick.DAO;

import com.example.ProyectoErick.entities.Deportista;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface DeportistaDao extends JpaRepository<Deportista, Long> {
    @Transactional
    Deportista findByCorreoAndPassword(String correo, String password);
}
