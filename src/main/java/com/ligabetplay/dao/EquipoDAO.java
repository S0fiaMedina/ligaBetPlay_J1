package com.ligabetplay.dao;

import java.util.List;
import com.ligabetplay.models.Equipo;
import com.ligabetplay.models.Jugador;

public interface EquipoDAO {
    
    public void agregarEquipo(Equipo equipo);  // registrar equipo


    public List<Equipo> getEquipos(); // retornar todos los equipos

    public List<Equipo> cargarEquipos(); // traer a los equipos del json

    public void guardarEquipos(); // guardar lo creado en un archivo

    
}
