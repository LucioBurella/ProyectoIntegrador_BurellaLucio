package com.lucio.backend.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Data;

@Entity
@Data
public class Experiencia {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull
    @Size(min = 1, max = 30, message = "no cumple la longitud")
    private String titulo;

    @NotNull
    @Size(min = 1, max = 20, message = "no cumple la longitud")
    private String fecha;
    
    @NotNull
    @Size(min = 1, max = 80, message = "no cumple la longitud")
    private String descripcion;

}
