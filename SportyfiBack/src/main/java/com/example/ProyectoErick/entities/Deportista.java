package com.example.ProyectoErick.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.Date;

@Data
@Entity
public class Deportista extends InformacionBasica {
    private String club;
    //private Date fechaNacimiento;
    @Lob
    @Basic(fetch = FetchType.LAZY)
    private byte[] foto;

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

}
