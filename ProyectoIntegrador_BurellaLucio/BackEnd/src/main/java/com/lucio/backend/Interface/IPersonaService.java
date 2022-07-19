
package com.lucio.backend.Interface;

import com.lucio.backend.Entity.Persona;

import java.util.List;

public interface IPersonaService {
public List<Persona> getPersona();
public void savePersona(Persona persona);
public void deletePersona(int id);
public Persona findPersona(int id);



}
