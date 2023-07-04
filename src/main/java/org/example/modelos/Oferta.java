package org.example.modelos;

import java.time.LocalDate;

public class Oferta {
    public Integer id;
    public String titulo;
    public String descripcion;
    public LocalDate fechaInicio;
    public LocalDate fechaFin;
    public Double costoPersona;
    public Integer idLocal;

    public Oferta() {
    }
}
