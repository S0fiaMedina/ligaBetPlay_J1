package com.ligabetplay.views;



import com.ligabetplay.Utileria;
import com.ligabetplay.models.Equipo;
import com.ligabetplay.views.EquipoView;

public class PartidoView {
    EquipoView equipoView = new EquipoView();
    // menu
    
    




    // inputs 
    public String getFechaPartido(){
        return Utileria.getStringInput(">> Digite la fecha del partido en formato dd/mm/yy: ");
    }
    public int getMarcador(){
        return Utileria.getIntInput(">> Digite el marcador del equipo durante el partido: ");
    }

    public Equipo getLocal(){
        return this.getEquipo("local");
    }
    public Equipo getVisitante(){
        return this.getEquipo("visitante");
    }

    public Equipo getEquipo(String tipoEquipo){
        System.out.println("\nSeleccione el equipo"+ tipoEquipo + " : ");
        Equipo equipoLocal = equipoView.getEquipoDeLista();
        return equipoLocal;

    }

    

    
    //inputs

}
