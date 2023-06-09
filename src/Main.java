import Servicio.Castrar;
import Servicio.Consulta;

public class Main {
    public static void main(String[] args) {
       Vendedor nuevoVendedor = new Vendedor("Alexis");
        //System.out.printf(nuevoVendedor.nombre);
        Cliente clienteRegistrado = nuevoVendedor.registrarCliente(26487564,"Sebastian","Perez",42388264,1155468794,"Amenedo 321","SebasAmenedo@gmail.com");
        clienteRegistrado.mostrarCliente();
        Castrar service = new Castrar(2500,"sin complicación", "incisión lateral");
        service.mostrarServicio();
        Consulta service_2 = new Consulta(1000,"Vomitos luego de ingerir balanceado","Protector estomacal y cambio de balanceado");
        service_2.mostrarServicio();
    }
}