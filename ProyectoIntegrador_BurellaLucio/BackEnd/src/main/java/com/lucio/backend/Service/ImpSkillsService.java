
package com.lucio.backend.Service;
import com.lucio.backend.Entity.Skills;
import com.lucio.backend.Interface.ISkillsService;
import com.lucio.backend.Repository.ISkillRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ImpSkillsService implements ISkillsService{
    @Autowired ISkillRepository iskillrepository;

    @Override
    public List<Skills> getSkill() {
        List<Skills> skill = iskillrepository.findAll();
       return skill;
    }

    @Override
    public void saveSkill(Skills skill) {
     iskillrepository.save(skill);
    }

    @Override
    public void deleteSkill(int id) {
       iskillrepository.deleteById(id);
    }

    @Override
    public Skills findSkill(int id) {
      Skills skill = iskillrepository.findById(id).orElse(null);
                return skill;
    }
 
    



}
