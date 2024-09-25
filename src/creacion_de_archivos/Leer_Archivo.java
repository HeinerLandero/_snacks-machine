package creacion_de_archivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Leer_Archivo {
    public static void main(String[] args) {
        var nombreArchivo = "mi_archivo.txt";
        var archivo = new File(nombreArchivo);
        try{
            System.out.println("contenido del archivo : ");
            //Abrir archivo
            var entrada = new BufferedReader(new FileReader(archivo));
            //Leemos linea a linea
            var linea  = entrada.readLine();
            while (linea != null){
                System.out.println(linea);
                linea = entrada.readLine();
            }
            entrada.close();
        }catch (Exception e){
            System.out.println("Error al leer archivo : ");
        }
    }
}
