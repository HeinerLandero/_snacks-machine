package javaBeans;

import java.io.Serializable;

public class JavaBeans {
    public static void main(String[] args) {
        var persona1 = new Persona();
        persona1.setNombre("Heiner") ;
        persona1.setApellido("Landero");
        System.out.println(persona1.getNombre());
        System.out.println(persona1.getApellido());
        System.out.println(persona1);
    }
}

class Persona implements Serializable{
    private String nombre;
    private String apellido;

    public Persona(){
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }
}
