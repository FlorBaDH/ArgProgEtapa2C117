
package com.mycompany.ejercicioclase1.validadorMateria;

import java.util.ArrayList;
import java.util.List;


public class Alumno {
    private String nombreCompleto;
    private String legajo;
    private List <Materia> materiasAprobadas;

    public Alumno(String nombreCompleto, String legajo) {
        this.nombreCompleto = nombreCompleto;
        this.legajo = legajo;
        this.materiasAprobadas = new ArrayList <Materia>(); 
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public String getLegajo() {
        return legajo;
    }

    public List<Materia> getMateriasAprobadas() {
        return materiasAprobadas;
    }

    public boolean tenesCorrelativas(Materia materiaCorrelativa) {
       return this.materiasAprobadas.contains(materiaCorrelativa);
    }
    
    
}
