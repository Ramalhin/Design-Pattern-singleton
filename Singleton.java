public class Singleton {
    
   
    private static Singleton instanciaUnica;

    private Singleton() {
       
    }

  
    public static Singleton getInstancia() {
        if (instanciaUnica == null) {
            instanciaUnica = new Singleton();
        }
        return instanciaUnica;
    }

   
    public void mostrarMensagem() {
        System.out.println("Exemplo de Singleton!");
    }
}

public class Main {
    public static void main(String[] args) {
       
        Singleton instancia = Singleton.getInstancia();

        
        instancia.mostrarMensagem();
    }
}
