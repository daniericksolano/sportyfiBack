package com.example.ProyectoErick.service;

import com.example.ProyectoErick.DAO.PublicacionDao;
import com.example.ProyectoErick.entities.Publicacion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PublicacionService {
    @Autowired
    private PublicacionDao publicacionDao;

    public Publicacion save(Publicacion publicacion) {
        return publicacionDao.save(publicacion);
    }
    public List<Publicacion> getAll() {
        return publicacionDao.findAll();
    }
    public Publicacion getById(long id) {
        return publicacionDao.findById(id).get();
    }


}
