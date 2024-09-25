public class ArgumentosVariables {
    public static void main(String[] args) {
        imprimirNumeros(1, 4, 3, 2, 5);
        variosArgumentos("mi nombre", 5 , true);
    }

    private static void variosArgumentos(String miNombre, int i, boolean b) {
    }


    static void imprimirNumeros(int... numeros){
        for (var i = 0 ; i < numeros.length; i++){
            System.out.print((i * numeros[i]) + " ");
        }
    }

}
