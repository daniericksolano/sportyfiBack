package com.example.ProyectoErick.entities;

import jakarta.persistence.*;
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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getPosicionDeporte() {
        return posicionDeporte;
    }

    public void setPosicionDeporte(String posicionDeporte) {
        this.posicionDeporte = posicionDeporte;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Deportista getDeportista() {
        return deportista;
    }

    public void setDeportista(Deportista deportista) {
        this.deportista = deportista;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public byte[] getImagen() {
        return imagen;
    }

    public void setImagen(byte[] imagen) {
        this.imagen = imagen;
    }
}
