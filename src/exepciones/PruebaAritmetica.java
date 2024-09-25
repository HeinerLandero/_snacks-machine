package exepciones;

public class PruebaAritmetica {
    public static void main(String[] args) {
        try{
            double resultado = Aritmetica.division(10 , 0);
            System.out.println(resultado);
        }catch (Exception e){
            System.out.println("la cagaste papi, como vas hacer esto?:" + e);
        }

    }
}
