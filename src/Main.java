import Producto.*;
import Servicio.*;

public class Main {
    public static void main(String[] args) {
       //Creación de vendedor
        Vendedor roberto = new Vendedor("Roberto");

        //------------Acciones del vendedor--------------

        //Registrar Cliente

        Cliente sebastian = roberto.registrarCliente(17546987,"Sebastian","Lopez",42365469,
                1150146478,"Alsina 2350,Banfield","Sebaslo@gmail.com");

        //Crear una nueva venta

        Venta venta = roberto.realizarVenta(sebastian);

        //Creando productos para agregar a la venta

        Producto hueso = new Producto("huesitos","Perro","Hueso corbata",
                                    4465,"Hueso masticable para perro",1500,2);
        Balanceado catchow = new Balanceado("CatChow",8,1003,"Comida para gato",3000,1,"Gato");
        Medicamento antiparasitario = new Medicamento("Gato",2003,"Pastilla anti parasitaria para gato",1233.21f,
                                        1,"Desparasite","1 cada 24hrs","Pastillas");

        //Creando Servicios para agregar a la venta

        Castrar castracion = new Castrar(4000,"Castración de gato hembra de 2 años","Corte inferior");
        Consulta consulta = new Consulta(1000,"El perro regurgita el alimento balanceado",
                "Protector estomacal VetGastril y cambio del alimento balancedo");

        //-----------------Acciones de la venta---------------

        //Agregando productos

        venta.agregarProducto(hueso);
        venta.agregarProducto(catchow);
        venta.agregarProducto(antiparasitario);

        //Agregando servicios
        venta.agregarServicio(castracion);
        venta.agregarServicio(consulta);

        //mostrando productos, servicios, mostrar total
        venta.mostrarProductos();
        venta.mostrarServicios();
        venta.calcularTotal();
        System.out.printf(String.valueOf(venta.getTotalVendido()));

        //Emitiendo el ticket

        Ticket ticket = venta.emitirTicket(venta);

        // Mostrando el ticket e imprimiendo el ticket
        System.out.println();
        ticket.mostrarTicket();
        ticket.imprimirTicket();





    }
}