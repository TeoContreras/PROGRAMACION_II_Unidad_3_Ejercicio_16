public class main {
    public static void main(String[] args) {
        Smartphone celular = new Smartphone("Samsung", "A55", 500000, 50, 256);
        Laptop notebook = new Laptop("Lenovo", "IdeaPad", 900000, "Intel i5", 16);
        celular.mostrarInformacion();
        notebook.mostrarInformacion();
    }
}