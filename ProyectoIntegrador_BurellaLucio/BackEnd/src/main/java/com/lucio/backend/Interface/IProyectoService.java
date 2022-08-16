
package com.lucio.backend.Interface;

import com.lucio.backend.Entity.Proyecto;
import java.util.List;


public interface IProyectoService {
  public List<Proyecto> getProyecto();
public void saveProyecto(Proyecto proyecto);
public void deleteProyecto(int id);
public Proyecto findProyecto(int id);

    
    
}
