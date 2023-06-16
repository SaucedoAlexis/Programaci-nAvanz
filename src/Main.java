import Producto.*;
import Servicio.*;

public class Main {
    public static void main(String[] args) {
       Vendedor nuevoVendedor = new Vendedor("Alexis");
//        //System.out.printf(nuevoVendedor.nombre);
        Cliente clienteRegistrado = nuevoVendedor.registrarCliente(26487564,"Sebastian","Perez",42388264,1155468794,"Amenedo 321","SebasAmenedo@gmail.com");
//        clienteRegistrado.mostrarCliente();
        Castrar service = new Castrar(2500,"sin complicación", "incisión lateral");
//        service.mostrarServicio();
        Consulta service2 = new Consulta(1000,"Vomitos luego de ingerir balanceado","Protector estomacal y cambio de balanceado");
//        service2.mostrarServicio();
//
       Producto producto = new Producto
               ("Apetitus","Perro",
               "Hueso Anudado",55478,
               "El Hueso Anudado de Apetitus es un " +
               "snack para perros de larga duración. " +
               "Es un producto 100% natural de calidad muy sabroso" +
               " y apetecible que a tu perro le encantará mordisquear.",
               1155.51f,2);
//       producto.mostrarProducto();
//
       Medicamento medicamento = new Medicamento("Gato",3354,"Caja de pastillas antiparasitarias de 20 comprimidos",6648,1,"Curapets","20mg","pastillas");
//       medicamento.mostrarProducto();

//        Balanceado balanceado = new Balanceado("CatChow",8,123451,"Alimento balanceado sabor pescado",7000,1,"Gato");
//        balanceado.mostrarProducto();
        Venta venta = new Venta(nuevoVendedor,clienteRegistrado);
//        venta.agregarProducto(producto);
//        venta.agregarProducto(medicamento);
        venta.mostrarProductos();
//        venta.getCliente().mostrarCliente();

        venta.agregarServicio(service);
        venta.agregarServicio(service2);
//        venta.mostrarServicios();
        venta.calcularTotal();
        System.out.println(venta.getTotalVendido());
        Ticket ticket = venta.emitirTicket(venta);
        ticket.mostrarTicker();
        ticket.imprimirTicket();

    }
}