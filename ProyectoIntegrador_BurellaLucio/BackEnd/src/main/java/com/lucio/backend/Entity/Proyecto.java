
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
public class Proyecto {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)  
  private int id;
   
  @NotNull
  @Size(min = 1, max = 50, message = "no cumple la longitud")
  private String titulo_proyecto;
   
  @NotNull
  @Size(min = 1, max = 50, message = "no cumple la longitud")  
  private String nombre_Proyecto;

   @NotNull
  @Size(min = 1, max = 250, message = "no cumple la longitud")  
  private String sobre_proyecto;
  
   @Size(min = 1, max = 50, message = "no cumple la longitud")
    
    private String img;
   
    
}
