//Interfacez
public interface Traductor {
    void traducir();

    default void iniciarTraductor(){
        System.out.println("Iniciando traduccion");
    }
}
class Ingles implements Traductor{
    @Override
    public void traducir() {
        System.out.println("Traduzco a ingles");
    }
}

class PruebaTraductor{
    public static void main(String[] args) {
        Traductor traductor = new Ingles();
        traductor.traducir();
        traductor.iniciarTraductor();
    }
}