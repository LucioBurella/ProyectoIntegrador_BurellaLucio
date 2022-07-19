
package com.lucio.backend.Service;

import com.lucio.backend.Entity.Persona;
import com.lucio.backend.Interface.IPersonaService;
import com.lucio.backend.Repository.IPersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpPersonaService implements IPersonaService{
    @Autowired IPersonaRepository ipersonarepository;
    @Override
    public List<Persona> getPersona() {
       List<Persona> persona = ipersonarepository.findAll();
       return persona;
    }

    @Override
    public void savePersona(Persona persona) {
        ipersonarepository.save(persona);
    }

    @Override
    public void deletePersona(int id) {
        ipersonarepository.deleteById(id);
    }

    @Override
    public Persona findPersona(int id) {
        Persona persona = ipersonarepository.findById(id).orElse(null);
                return persona;
    }
    
}
