

package com.mycompany.ejercicioclase1;

import com.mycompany.ejercicioclase1.validadorMateria.Alumno;
import com.mycompany.ejercicioclase1.validadorMateria.Inscripcion;
import com.mycompany.ejercicioclase1.validadorMateria.Materia;

public class EjercicioClase1 {

    public static void main(String[] args) {    
      // Instancio Materias y agrego correlativas a la lista
      Materia materia1 = new Materia  ("Algoritmos y Estructuras de Datos");
     
      Materia materia2 = new Materia ("Paradigmas de Programacion");
      materia2.agregarCorrelativa(materia1);
      
      Materia materia3 = new Materia ("Diseño de sistemas");
      materia3.agregarCorrelativa(materia1);
      materia3.agregarCorrelativa(materia2);
    
      //Intancio un Alumno y una Inscripcion
      Alumno alumno1 = new Alumno("Florencia Barria", "354351");
      Inscripcion inscripcion1 = new Inscripcion (alumno1, materia3);
      
        //Llamo a la funcion que me da el reultado por pantalla
        
        System.out.println(resultadoInscripcion (inscripcion1));
        
        System.out.println("----------------------------------------------"); 
        
       Alumno alumno2 = new Alumno("Franco Ammann", "354568");
      Inscripcion inscripcion2 = new Inscripcion (alumno2, materia1);
      
      
        System.out.println(resultadoInscripcion (inscripcion2));
        
    }
          //Funcion que devuleve String 
        private static String resultadoInscripcion(Inscripcion inscripcion) {
            if (inscripcion.aprobada()) {
        return "Felicitaciones, su inscripción fue exitosa!";
        } 
            else {
        return "No se puede inscribir en esta materia.";
    }
  }
}



    
    
 

