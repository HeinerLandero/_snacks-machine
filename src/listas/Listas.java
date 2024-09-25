package listas;
import java.util.ArrayList;
import java.util.List;

public class Listas {
    public static void main(String[] args) {
        List<Object> miLista = new ArrayList<>();
        miLista.add("Lunes");
        miLista.add("domingo");
        miLista.add("martes");
        miLista.add("sabado");
        miLista.add(2);
        System.out.println(miLista );
//ForEach en Java
        for (Object element  : miLista){
            System.out.println(element);
        }
    }

}
