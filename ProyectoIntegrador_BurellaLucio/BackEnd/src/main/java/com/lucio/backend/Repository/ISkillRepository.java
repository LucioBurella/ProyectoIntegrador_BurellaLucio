
package com.lucio.backend.Repository;

import com.lucio.backend.Entity.Skills;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISkillRepository extends JpaRepository<Skills,Integer> {
    
}