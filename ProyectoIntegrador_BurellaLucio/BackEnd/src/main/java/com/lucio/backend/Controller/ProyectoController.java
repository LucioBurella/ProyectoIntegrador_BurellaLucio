
package com.lucio.backend.Controller;

import com.lucio.backend.Entity.Proyecto;
import com.lucio.backend.Interface.IProyectoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
public class ProyectoController {
   @Autowired IProyectoService iproyectoService;  
   
   @GetMapping("proyecto/traer") 
public List<Proyecto> getProyecto(){
    return iproyectoService.getProyecto();
}
 
@PostMapping("/proyecto/crear")
public String createProyecto(@RequestBody Proyecto proyecto){
    iproyectoService.saveProyecto(proyecto);
    return "La persona fue creada correctamente";
}

@DeleteMapping("/proyecto/borrar/{id}")
public void deleteProyecto(@PathVariable int id){
   iproyectoService.deleteProyecto(id);
}
@PutMapping("/proyecto/editar/{id}")
    public Proyecto editProyecto(@PathVariable("id") int id,
                              @RequestBody Proyecto proyecto)
    {
        proyecto.setId(id);
    
    iproyectoService.saveProyecto(proyecto);
    return proyecto;
    }
@GetMapping(path = {"/proyecto/{id}"})
    public Proyecto findProyecto(@PathVariable("id")int id){
        return iproyectoService.findProyecto(id);
    }    

}
