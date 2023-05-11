
package com.portfolio.BG.Interface;
import com.portfolio.BG.Entity.Persona;
import java.util.List;



public interface IPersonaService {
    //traer una persona
    public List <Persona> getPersona();
    //guardar
    public void savePersona(Persona persona);
    
    //borrar
    public void deletePersona(Long id);
    // buscar
    public Persona findPersona(Long id);
    
}
