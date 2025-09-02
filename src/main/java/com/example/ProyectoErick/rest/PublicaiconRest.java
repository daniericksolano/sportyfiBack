package com.example.ProyectoErick.rest;

import com.example.ProyectoErick.entities.Deportista;
import com.example.ProyectoErick.entities.Publicacion;
import com.example.ProyectoErick.service.PublicacionService;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.annotation.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/publicacion")
@CrossOrigin(origins = "*", methods = {RequestMethod.POST, RequestMethod.GET})
public class PublicaiconRest {
    @Autowired
    private PublicacionService publicacionService;

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public Publicacion save(@RequestBody @RequestParam("publicacion") String publicaionS,
                            @Nullable @RequestBody @RequestParam("foto") MultipartFile foto) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        Publicacion publicacion = mapper.readValue(publicaionS, Publicacion.class);
        if (foto != null) {
            publicacion.setImagen(foto.getBytes());
        }
        return publicacionService.save(publicacion);
    }
    @GetMapping
    public List<Publicacion> getAll() {
        return publicacionService.getAll();
    }
    @GetMapping("/{id}")
    public Publicacion getById(@PathVariable long id) {
        return publicacionService.getById(id);
    }
}
