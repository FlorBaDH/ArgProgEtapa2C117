
package actividadclase2;

import java.util.ArrayList;
import java.util.List;


public class ActividadClase2 {


    public static void main(String[] args) {
         List <String> listaPalabras = new ArrayList <>();
      listaPalabras.add("Hola");
      listaPalabras.add("argentina");
      listaPalabras.add("programa");
      listaPalabras.add("intermedio");
      
      System.out.println("las palabras son "+ listaPalabras);
   
      TransformadorMayuscula transformadorMayus = palabra -> palabra.toUpperCase();
      
      List <String> listaEnMayus = transformarLista(listaPalabras,transformadorMayus);
     
       System.out.println("las palabras transformadas son "+ listaEnMayus);
    }
    
    private static List <String> transformarLista (List<String> lista, TransformadorMayuscula transformador){
        List<String> listaTransformada = new ArrayList<>();
        for (String palabra : lista) {
            listaTransformada.add(transformador.transformar(palabra));
        }
        return listaTransformada;
    }
}
