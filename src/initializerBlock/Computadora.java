package initializerBlock;

public class Computadora {

    static {
        System.out.println("Sistema encendido");
    }

    {
        System.out.println("Configurando computadora...");
    }

    public Computadora() {
        System.out.println("Computadora lista");
    }

}
