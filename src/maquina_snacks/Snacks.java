package maquina_snacks;

import java.util.ArrayList;
import java.util.List;

public class Snacks {
    private static final List<Snack> SNACKS ;
    // Bloque de tipo estatico
    static {
        SNACKS = new ArrayList<>();
        SNACKS.add(new Snack("Papas", 70));
        SNACKS.add(new Snack("Galletas", 170));
        SNACKS.add(new Snack("Gaseosas", 30));
        SNACKS.add(new Snack("Chips", 50));
        SNACKS.add(new Snack("Candies", 10));
    }
    public static void agregarSnacks(Snack snack){
        SNACKS.add(snack);
    }
    public static void mostrarSnacks(){
        var invertarioSnacks = "";
        for(var snack: SNACKS){
            invertarioSnacks += snack.toString() + "\n";
        }
        System.out.println("--- Snacks en el inventario ---");
        System.out.println(invertarioSnacks);
    }

    public static List<Snack> getSnacks(){
            return SNACKS;
    }

}
