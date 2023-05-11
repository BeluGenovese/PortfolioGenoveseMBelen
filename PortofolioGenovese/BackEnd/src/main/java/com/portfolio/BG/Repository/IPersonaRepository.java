package com.portfolio.BG.Repository;

import com.portfolio.BG.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IPersonaRepository extends JpaRepository <Persona,Long> {
    
    
    
}
