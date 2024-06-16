package com.ligabetplay.dao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.ligabetplay.team.Equipo;

public class EquipoDAOImplement implements EquipoDAO{

    private final String  FILE_PATH = "json/equipos.json";
    private Gson gson; // creacion de objeto gson
    private List<Equipo> equipos;


    public EquipoDAOImplement(){
        gson = new GsonBuilder().setPrettyPrinting().create(); // crear nuevo json
        equipos = this.cargarEquipos(); // carga de equipos;    
    }

    // Agregar equipo
    @Override
    public void agregarEquipo(Equipo equipo) {
        this.equipos.add(equipo);
        
    }
    // tomar todos los equipos
    @Override
    public List<Equipo> cargarEquipos() {
        try (Reader reader = new FileReader(FILE_PATH)){

            Type listType = new TypeToken<List<Equipo>>() {}.getType();
            return gson.fromJson(reader, listType);

        } catch (FileNotFoundException e) {
            return new ArrayList<>();
        } catch(IOException e){
            e.printStackTrace();
            return new ArrayList<>();
        }
        
    }

    // obtener todos los esquipos
    @Override
    public List<Equipo> getEquipos() {
        return this.equipos;
    }

    // guarda todos la lista de equipos
    public void guardarEquipos(){
        try (Writer writer = new FileWriter(FILE_PATH)) {
            gson.toJson(equipos, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    
}
