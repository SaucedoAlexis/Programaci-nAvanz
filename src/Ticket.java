import java.util.ArrayList;
import Producto.*;
import Servicio.*;

public class Ticket {
    private String nombreCliente;
    private String nombreVendedor;
    private ArrayList<Producto> productosVendidos;
    private ArrayList<Servicio> serviciosVendidos;
    private String precioTotal;

    public Ticket(Venta venta){
        this.nombreCliente = venta.getCliente().nombre;
        this.nombreVendedor = venta.getVendedor().nombre;
        this.productosVendidos = venta.getProductos();
        this.serviciosVendidos = venta.getServicios();
        this.precioTotal = String.valueOf(venta.getTotalVendido());
    }

}
