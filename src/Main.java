import Local.Local;
import Seminario.Seminario;

public class Main {
    public static void main(String[] args) {
        Local local = new Local("Rua D ");
       Seminario seminario = new Seminario("natureza humana", local);

       seminario.imprimir();

       
    }
}
