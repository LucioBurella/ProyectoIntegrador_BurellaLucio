
package com.lucio.backend.Service;

import com.lucio.backend.Entity.Experiencia;
import com.lucio.backend.Interface.IExperienciaService;
import com.lucio.backend.Repository.IExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class ImpExperienciaService implements IExperienciaService {
@Autowired IExperienciaRepository iExperenciaRepository;
    @Override
    public List<Experiencia> getExperiencia() {
         List<Experiencia> experiencia = iExperenciaRepository.findAll();
       return experiencia;
    }

    @Override
    public void saveExperiencia(Experiencia experiencia) {
        iExperenciaRepository.save(experiencia);
    }

    @Override
    public void deleteExperiencia(int id) {
       iExperenciaRepository.deleteById(id);
    }

    @Override
    public Experiencia findExperiencia(int id) {
      Experiencia experiencia = iExperenciaRepository.findById(id).orElse(null);
                return experiencia;
    }
    
}
