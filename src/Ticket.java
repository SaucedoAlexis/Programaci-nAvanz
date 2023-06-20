import java.util.ArrayList;
import Producto.*;
import Servicio.*;

public class Ticket {
    private String nombreCliente;
    private String nombreVendedor;
    private ArrayList<Producto> productosVendidos;

    private ArrayList<Servicio> serviciosVendidos;

    private String precioTotal;
    private String horario;


    public Ticket(Venta venta){
        this.nombreCliente = venta.getCliente().getNombre();
        this.nombreVendedor = venta.getVendedor().getNombre();
        this.productosVendidos = venta.getProductos();
        this.serviciosVendidos = venta.getServicios();
        this.precioTotal = String.valueOf(venta.getTotalVendido());
        this.horario = venta.getFechaYHora();
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getNombreVendedor() {
        return nombreVendedor;
    }

    public void setNombreVendedor(String nombreVendedor) {
        this.nombreVendedor = nombreVendedor;
    }

    public ArrayList<Producto> getProductosVendidos() {
        return productosVendidos;
    }

    public void setProductosVendidos(ArrayList<Producto> productosVendidos) {
        this.productosVendidos = productosVendidos;
    }

    public ArrayList<Servicio> getServiciosVendidos() {
        return serviciosVendidos;
    }

    public void setServiciosVendidos(ArrayList<Servicio> serviciosVendidos) {
        this.serviciosVendidos = serviciosVendidos;
    }

    public String getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(String precioTotal) {
        this.precioTotal = precioTotal;
    }

    public void mostrarTicket(){
        System.out.println(
                "------------Datos del ticket------------" +
                "\nCliente: " + this.getNombreCliente() +
                        "\nVendedor: " + this.getNombreVendedor() +
                        "\nFecha y Horario: " + this.getHorario()
        );
        if (this.getProductosVendidos().size() > 0) {
            System.out.println("------------------Productos Adquiridos-----------------");
            System.out.println(String.format("%-10s %-20s %-10s %10s", "Codigo", "Tipo producto", "Cantidad", "Total"));
            for (Producto producto : this.getProductosVendidos()) {
                System.out.println(String.format("%-10s %-20s %5s %15s %1s", producto.getCodigoProducto(), producto.getTipoProducto()
                        ,producto.getCantidadProducto(), producto.getPrecioProducto() * producto.getCantidadProducto(), "$"));
            }

        }
        if(this.getServiciosVendidos().size() > 0) {
            System.out.println("-----------------Servicios Contratados-----------------");
            System.out.println(String.format("%-10s %10s", "Servicio", "Precio"));
            for (Servicio servicio : this.getServiciosVendidos()) {
                System.out.println(String.format("%-10s %10s %1s",
                                servicio.getNombreServicio(),
                                servicio.getPrecio() , "$"));
            }
        }
        String[] total = this.getPrecioTotal().split("\\.");
        try {
            System.out.println("----------Resumen-----------" +
                    "\nTotal de la venta: " + total[0] + "." + total[1].substring(0, 2) + "$");
        }
        catch (Exception e){
            System.out.println("----------Resumen-----------" +
                    "\nTotal de la venta: " + total[0] + "." + total[1] + "$");
        }
    }
    public void imprimirTicket(){
        System.out.println("¡Se ha impreso el ticket!");
    }
}
