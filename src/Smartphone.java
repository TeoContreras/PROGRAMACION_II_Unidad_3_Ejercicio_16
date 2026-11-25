public class Smartphone extends Dispositivo {
    private int megapixelesCamara;
    private int almacenamiento;

    public Smartphone(String marca, String modelo, double precioBase, int megapixelesCamara, int almacenamiento) {
        super(marca, modelo, precioBase);
        this.megapixelesCamara = megapixelesCamara;
        this.almacenamiento = almacenamiento;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Camara: " + megapixelesCamara + " MP - Almacenamiento: " + almacenamiento + " GB");
    }
}