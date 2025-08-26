package com.example.ProyectoErick.DAO;

import com.example.ProyectoErick.entities.Publicacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PublicacionDao extends JpaRepository<Publicacion, Long> {
}
