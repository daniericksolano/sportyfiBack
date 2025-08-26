package com.example.ProyectoErick.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Cazatalentos extends InformacionBasica {
    private String tipo;
    private String organizacionPertenece;
}
