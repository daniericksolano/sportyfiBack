package com.example.ProyectoErick.rest;

import com.example.ProyectoErick.entities.Deportista;
import com.example.ProyectoErick.entities.Login;
import com.example.ProyectoErick.entities.Perfil;
import com.example.ProyectoErick.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@CrossOrigin(origins = "*", methods = {RequestMethod.POST})
public class AuthRest {
    @Autowired
    private AuthService authService;

    @PostMapping("/deportista")
    @ResponseStatus(HttpStatus.CREATED)
    public Perfil validarDeportista(@RequestBody Login login) {
        return authService.validarDeportista(login);
    }
}
