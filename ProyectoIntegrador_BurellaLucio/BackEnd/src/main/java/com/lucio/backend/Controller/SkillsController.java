
package com.lucio.backend.Controller;

import com.lucio.backend.Entity.Skills;
import com.lucio.backend.Interface.ISkillsService;
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
public class SkillsController {
 @Autowired ISkillsService iskillservice;
 
   @GetMapping("skills/traer") 
public List<Skills> getSkill(){
    return iskillservice.getSkill();
}
@PostMapping("/skills/crear")
public void createSkill(@RequestBody Skills skill){
    iskillservice.saveSkill(skill);
}
@DeleteMapping("/skills/borrar/{id}")
public void deleteSkill(@PathVariable Integer id){
   iskillservice.deleteSkill(id);
}
@PutMapping("/skills/editar/{id}")
    public Skills editSkill(@PathVariable("id") int id,
                              @RequestBody Skills skill)
    {
        skill.setId(id);
    
    iskillservice.saveSkill(skill);
    return skill;
    }
@GetMapping(path = {"/skills/{id}"})
    public Skills findSkill(@PathVariable("id")int id){
        return iskillservice.findSkill(id);
    }    

}
