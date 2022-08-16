
package com.lucio.backend.Interface;

import com.lucio.backend.Entity.Skills;
import java.util.List;


public interface ISkillsService {
public List<Skills> getSkill();
public void saveSkill(Skills skill);
public void deleteSkill(int id);
public Skills findSkill(int id);
    
}
