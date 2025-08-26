package com.example.ProyectoErick.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Publicacion {
    @Id
    @GeneratedValue
    private long id;
    private String deporte;
    private String titulo;
    private String posicionDeporte;
    private String descripcion;
    @JoinColumn
    @ManyToOne
    private Deportista deportista;
    /*@Lob
    @Basic(fetch = FetchType.LAZY)
    private byte[] video;*/
    private String video;
    @Lob
    @Basic(fetch = FetchType.LAZY)
    private byte[] imagen;
}
