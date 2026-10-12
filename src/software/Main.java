package software;

public class Main {
    public static void main(String[] args) {

        System.out.println("Total: " + Dispositivo.getTotalCreados());

        Dispositivo d1 = new Dispositivo("Servidor Central", "Servidor");

        System.out.println("Total: " + Dispositivo.getTotalCreados());

        Dispositivo d2 = new Dispositivo("Router Principal", "Redes");
            Dispositivo d3 = new Dispositivo("Switch", "Elemento");

        System.out.println("Total: " + Dispositivo.getTotalCreados());

        System.out.println("\n--- Información inicial de los dispositivos ---");
        System.out.println("Dispositivo 1: " + d1.getNombre() + " | Tipo: " + d1.getTipo());
        System.out.println("Dispositivo 2: " + d2.getNombre() + " | Tipo: " + d2.getTipo());
        System.out.println("Dispositivo 3: " + d3.getNombre() + " | Tipo: " + d3.getTipo());

        System.out.println("\n--- Modificando datos del Dispositivo 1 ---");
        d1.setNombre("Servidor de Base de Datos");
        d1.setTipo("Servidor Crítico");

        d2.setNombre("  ");

        System.out.println("\n--- Información nueva del Dispositivo 1 ---");
        System.out.println("Nuevo nombre: " + d1.getNombre());
        System.out.println("Nuevo tipo: " + d1.getTipo());
    }
}