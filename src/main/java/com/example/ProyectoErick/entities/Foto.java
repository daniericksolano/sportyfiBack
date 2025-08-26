package com.example.ProyectoErick.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Foto {
    @Id
    @GeneratedValue
    private long id;
    @Lob
    @Basic(fetch = FetchType.LAZY)
    private byte[] foto;
}
