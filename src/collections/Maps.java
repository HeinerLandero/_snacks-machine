package collections;

import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        Map<String, String> persona = new HashMap<>();
        persona.put("Nombre" , "Heiner");
        persona.put("Apellido" , "Landero");
        persona.put("Edad", "28");
        persona.entrySet();
        System.out.println(persona);
        persona.remove("Apellido");
        persona.entrySet();
        System.out.println(persona);

    }
}
