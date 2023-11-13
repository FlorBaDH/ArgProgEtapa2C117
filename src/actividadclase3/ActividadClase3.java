 
package actividadclase3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ActividadClase3 {

   
    public static void main(String[] args) {
        // ejercicio 1
        List <String> listaOriginal = new ArrayList <>();
        listaOriginal.add ("Hola");
        listaOriginal.add ("que");
        listaOriginal.add ("tal");
        listaOriginal.add ("como");
        listaOriginal.add ("estan");
        listaOriginal.add ("todos");
        //imprimo la lista origina
        System.out.println("La lista otorgada es "+ listaOriginal);
        System.out.println("-------------------------------------");
        //aplico el metodo para tranformar e imprimo la lista en mayuscula
        List <String> listaNueva = convertirMayus (listaOriginal);
        
        System.out.println("La lista tranformada es: " + listaNueva);
        System.out.println("-------------------------------------");
       
        //Ejercicio 2
        //aplico el metodo e imprimo las palabras que cumplen la condicion.
        String palabrasFiltradas = listaFiltrada (listaOriginal);
        
        System.out.println("Las palabras con mas de 4 caracteres son: " + palabrasFiltradas);
    }
    //metodo para tranformar ejercicio 1
    public static List <String> convertirMayus(List <String> lista){
            return lista.stream()
                   .map(String :: toUpperCase)
                   .collect(Collectors.toList());
    }
    
    //metodo que filtra palabras segun cantidad de caracteres
    public static String listaFiltrada (List <String>lista ){
            return lista.stream()
                   .filter(palabra -> palabra.length() > 4)
                   .collect(Collectors.joining(", "));
    }
}
