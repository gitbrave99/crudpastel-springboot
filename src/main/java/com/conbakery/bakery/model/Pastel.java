package com.conbakery.bakery.model;

import javax.persistence.*;

@Entity
@Table(name ="pastel")
public class Pastel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_pastel")
    private Integer idPastel;

    private String nombre;

    private Integer existencia;

    public Integer getIdPastel() {
        return idPastel;
    }

    public void setIdPastel(Integer idPastel) {
        this.idPastel = idPastel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getExistencia() {
        return existencia;
    }

    public void setExistencia(Integer existencia) {
        this.existencia = existencia;
    }
}
