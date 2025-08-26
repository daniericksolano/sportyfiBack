package com.example.ProyectoErick.service;

import com.example.ProyectoErick.DAO.DeportistaDao;
import com.example.ProyectoErick.entities.Deportista;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DeportistaService {
    @Autowired
    private DeportistaDao deportistaDao;

    public Deportista save(Deportista deportista) {
        Deportista deportistaSave = deportistaDao.save(deportista);
        if (deportistaSave.equals(null)) {
            throw  new IllegalArgumentException("No se guardo deportista");
        }
        return deportistaSave;
    }

    public Deportista get(long id) {
        Optional<Deportista> optDeportista = deportistaDao.findById(id);
        if (!optDeportista.isPresent()) {
            return null;
        }
        return  optDeportista.get();
    }
}
