public class Main {
    public static void main(String[] args) {
        Cuaderno cuaderno = new Cuaderno();

        cuaderno.agregarHoja();
        cuaderno.buscarHojaPorNumero(5);
        cuaderno.eliminarHoja(3);
        cuaderno.agregarHoja();
        cuaderno.eliminarHoja(10);
        cuaderno.buscarHojaPorNumero(3);
    }
}