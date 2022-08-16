package com.lucio.backend.Controller;

import com.lucio.backend.Entity.Experiencia;
import com.lucio.backend.Interface.IExperienciaService;
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
public class ExperienciaController {

    @Autowired
    IExperienciaService iexperienciaService;

    @GetMapping("experiencia/traer")
    public List<Experiencia> getExperiencias() {
        return iexperienciaService.getExperiencia();
    }

    @PostMapping("/experiencia/crear")
    public String createPersona(@RequestBody Experiencia experiencia) {
        iexperienciaService.saveExperiencia(experiencia);
        return "La persona fue creada correctamente";
    }

    @DeleteMapping("/experiencia/borrar/{id}")
    public void deletePersona(@PathVariable int id) {
        iexperienciaService.deleteExperiencia(id);
    }

    @PutMapping("/experiencia/editar/{id}")
    public Experiencia editPersona(@PathVariable("id") int id,
            @RequestBody Experiencia experiencia) {
        experiencia.setId(id);

        iexperienciaService.saveExperiencia(experiencia);
        return experiencia;
    }

    @GetMapping(path = {"/experiencia/{id}"})
    public Experiencia findExperiencia(@PathVariable("id") int id) {
        return iexperienciaService.findExperiencia(id);
    }

}
