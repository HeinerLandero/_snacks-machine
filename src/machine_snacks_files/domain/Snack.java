package machine_snacks_files.domain;

import java.io.Serializable;
import java.util.Objects;

public class Snack implements Serializable {
    private static int contador = 0;
    private int id_snack;
    private String nombre;
    private double precio;

    public Snack(String nombre, double precio){
        this.id_snack = ++Snack.contador;
        this.precio = precio;
        this.nombre = nombre;
    }

    public static int getContador() {
        return contador;
    }

    public int getId_snack() {
        return id_snack;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Snack{" +
                "id_snack=" + id_snack +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
    public String writeSnack(){
        return id_snack + "," + nombre + "," + precio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Snack snack = (Snack) o;
        return id_snack == snack.id_snack && Double.compare(precio, snack.precio) == 0 && Objects.equals(nombre, snack.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_snack, nombre, precio);
    }
}
