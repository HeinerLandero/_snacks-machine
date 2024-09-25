package funciones_lambda;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FuntionsLambda {
    public static void main(String[] args) {
        List<Object> miLista = new ArrayList<>();
        miLista.add("Lunes");
        miLista.add("domingo");
        miLista.add("martes");
        miLista.add("sabado");
        miLista.add(2);
        System.out.println(miLista );
//         ForEach en Java
//        for (Object element  : miLista){
//            System.out.println(element);
//        }
//        function lambda
//        miLista.forEach(element -> {
//            System.out.println("element = " + element);
//        });
//      metodo de referencia
        miLista.forEach(System.out::println);

        List<String> nombres = Arrays.asList("Juancho", "Guillo", "Lucho");
    }
}
