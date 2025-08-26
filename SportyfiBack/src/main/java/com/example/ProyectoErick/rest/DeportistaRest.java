package com.example.ProyectoErick.rest;

import com.example.ProyectoErick.entities.Deportista;
import com.example.ProyectoErick.service.DeportistaService;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.annotation.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping("/deportista")
@CrossOrigin(origins = "*", methods = {RequestMethod.POST, RequestMethod.GET})
public class DeportistaRest {
    @Autowired
    private DeportistaService deportistaService;

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public Deportista save(@RequestBody @RequestParam("deportista") String deportistaS,
                           @Nullable @RequestBody @RequestParam("foto") MultipartFile foto) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        Deportista deportista = mapper.readValue(deportistaS, Deportista.class);
        if (foto != null) {
            deportista.setFoto(foto.getBytes());
        }
        return deportistaService.save(deportista);
    }

    @GetMapping("/{id}")
    public Deportista get(@PathVariable long id) {
        return deportistaService.get(id);
    }
}
