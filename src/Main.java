
public class Main {
    public static void main(String[] args) {
       Vendedor nuevoVendedor = new Vendedor("Alexis");
        //System.out.printf(nuevoVendedor.nombre);
        Cliente clienteRegistrado = nuevoVendedor.registrarCliente(26487564,"Sebastian","Perez",42388264,1155468794,"Amenedo 321","SebasAmenedo@gmail.com");
        clienteRegistrado.mostrarCliente();
    }
}