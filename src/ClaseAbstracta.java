public class ClaseAbstracta {
    public static void main(String[] args) {
      FiguraGeometrica figuraGeometrica = new Rectangulo();
      FiguraGeometrica figuraGeometrica2 = new Triangulo();
      figuraGeometrica2.dibujar();
      figuraGeometrica.dibujar();
    }
}

abstract class FiguraGeometrica{
    public abstract void dibujar();
}

class Rectangulo extends FiguraGeometrica{
    @Override
    public void dibujar() {
        System.out.println("Se dibuja un rectangulo");
    }
};

class Triangulo extends  FiguraGeometrica{
    @Override
    public void dibujar(){
        System.out.println("Se dibuja un triangulo");
    }
}