public class Dispositivo {
    private String modelo;

    public Dispositivo(String modelo) {
        this.modelo = modelo;
    }

    public void ligarDispositivo() {
        System.out.println("Dispositivo ligado.");
    }

    public void desligarDispositivo() {
        System.out.println("Dispositivo desligado.");
    }
}