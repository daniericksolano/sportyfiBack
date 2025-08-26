package com.example.ProyectoErick.service;

import com.example.ProyectoErick.DAO.DeportistaDao;
import com.example.ProyectoErick.entities.Deportista;
import com.example.ProyectoErick.entities.Login;
import com.example.ProyectoErick.entities.Perfil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {
    @Autowired
    private DeportistaDao deportistaDao;

    public Perfil validarDeportista(Login login) {
        Deportista deportista = deportistaDao.findByCorreoAndPassword(login.getCorreo(), login.getPassword());
        Perfil perfil = new Perfil();
        perfil.setId(deportista.getId());
        perfil.setNombre(deportista.getNombre());
        perfil.setTipoUsuario(deportista.getTipoUsuario());
        return perfil;
    }
}