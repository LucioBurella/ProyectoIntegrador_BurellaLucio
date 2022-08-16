
package com.lucio.backend.Service;

import com.lucio.backend.Entity.Proyecto;
import com.lucio.backend.Interface.IProyectoService;
import com.lucio.backend.Repository.IProyectoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpProyectoService implements IProyectoService {
 @Autowired IProyectoRepository iproyectorepository;
    @Override
    public List<Proyecto> getProyecto() {
         List<Proyecto> proyecto = iproyectorepository.findAll();
       return proyecto;
    }

    @Override
    public void saveProyecto(Proyecto proyecto) {
       iproyectorepository.save(proyecto);
    }

    @Override
    public void deleteProyecto(int id) {
        iproyectorepository.deleteById(id);
    }

    @Override
    public Proyecto findProyecto(int id) {
       Proyecto proyecto = iproyectorepository.findById(id).orElse(null);
                return proyecto;
    }

   
    
}
