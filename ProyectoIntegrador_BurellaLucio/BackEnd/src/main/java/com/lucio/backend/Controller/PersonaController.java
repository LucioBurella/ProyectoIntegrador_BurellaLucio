
package com.lucio.backend.Controller;

import com.lucio.backend.Entity.Persona;
import com.lucio.backend.Interface.IPersonaService;
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
public class PersonaController {
    @Autowired IPersonaService ipersonaService;

   @GetMapping("personas/traer") 
public List<Persona> getPersona(){
    return ipersonaService.getPersona();
}
    
@PostMapping("/personas/crear")
public String createPersona(@RequestBody Persona persona){
    ipersonaService.savePersona(persona);
    return "La persona fue creada correctamente";
}
@DeleteMapping("/personas/borrar/{id}")
public void deletePersona(@PathVariable int id){
   ipersonaService.deletePersona(id);
}
@PutMapping("/personas/editar/{id}")
    public Persona editPersona(@PathVariable("id") int id,
                              @RequestBody Persona persona)
    {
        persona.setId(id);
    
    ipersonaService.savePersona(persona);
    return persona;
    }
 @GetMapping(path = {"/personas/{id}"})
    public Persona findPersona(@PathVariable("id")int id){
        return ipersonaService.findPersona(id);
    }    
}
