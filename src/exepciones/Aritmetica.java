package exepciones;

public class Aritmetica {
    public static int division(int numerador, int denominador){
        if(denominador == 0){
            throw new RuntimeException("Division entre cero");
        }
        return numerador/denominador;
    }
    public static void main(String[] args) {
        try{
        int producto = division(2,5);
        int resultado = Integer.valueOf(producto);
        System.out.println(resultado);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
