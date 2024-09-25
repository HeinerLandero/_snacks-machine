package creacion_de_archivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CrearArchivo {
    public static void main(String[] args) {
        var nombre_archivo = "mi_archivo1.js";
        var archivo = new File(nombre_archivo);
        try {
            if(archivo.exists()){
                System.out.println("Archivo ya existe!");
            }else{
                var salida = new PrintWriter(new FileWriter(archivo));
                salida.close();
                System.out.println("Se ha creado el archivo");
            }
        }catch (IOException e){
            System.out.println("Error al crear nuevo archivo");
            e.printStackTrace();
        }

    }
}
