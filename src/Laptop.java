public class Laptop extends Dispositivo {
    private String procesador;
    private int memoriaRam;

    public Laptop(String marca, String modelo, double precioBase, String procesador, int memoriaRam) {
        super(marca, modelo, precioBase);
        this.procesador = procesador;
        this.memoriaRam = memoriaRam;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Procesador: " + procesador + " - RAM: " + memoriaRam + " GB");
    }
}