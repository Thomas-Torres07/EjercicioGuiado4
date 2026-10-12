package software;

public class Dispositivo {
    private String nombre;
    private String tipo;

    private static int contador = 0;

    public Dispositivo(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;

        contador++;
    }

    public static int getTotalCreados() {
        return contador;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.isBlank()) {
            this.nombre = nombre;
        } else {
            System.out.println("Error: El nombre no puede estar vacío.");
        }
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}