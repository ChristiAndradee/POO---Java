public class TesteBiciclete {

    public static void main(String[] args) {
        Bicicleta caloi = new Bicicleta();

        caloi.nome = "Caloi";
        caloi.marcha = 5;
        caloi.modelo = "ABC-123";

        Bicicleta k = new Bicicleta();
        k.nome = "Fast Caloi";
        k.marcha = 7;
        k.modelo = "FAST";

        caloi.imprimir();
        k.imprimir();
    }

    
}
