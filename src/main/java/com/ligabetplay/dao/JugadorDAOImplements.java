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
import com.ligabetplay.models.Jugador;

public class JugadorDAOImplements implements jugadorDAO {
    private final String FILE_PATH = "json/jugador.json";
    private Gson gson;
    private List<Jugador> jugadores;
    
    
    public JugadorDAOImplements(){
        gson = new GsonBuilder().setPrettyPrinting().create(); // crear nuevo json
    }

    // Agregar equipo
    @Override
    public void agregarJugador(Jugador jugador) {
        this.jugadores.add(jugador);
        
    }

    @Override
    public List<Jugador> cargarJugadores(){
        try (Reader reader = new FileReader(FILE_PATH)){

            Type listType = new TypeToken<List<Jugador>>() {}.getType();
            return gson.fromJson(reader, listType);

        } catch (FileNotFoundException e) {
            return new ArrayList<>();
        } catch(IOException e){
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    @Override
    public List<Jugador> getJugadores() {
        return this.jugadores;
    }


    @Override
    public void guadarJugadores(){
        try (Writer writer = new FileWriter(FILE_PATH)) {
            gson.toJson(jugadores, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
