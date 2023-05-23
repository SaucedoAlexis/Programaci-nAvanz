
import java.time.LocalDateTime;
import java.util.Date;

public class Venta {
    Vendedor vendedor;
    Productos[] productos;
    Servicios[] servicios;
    double totalVendido;
    LocalDateTime fechaYHora = LocalDateTime.now();
    Cliente cliente;

    public Venta(Vendedor vendedor, Productos[] productos, Servicios[] servicios, double totalVendido, Cliente cliente) {
        this.vendedor = vendedor;
        this.productos = productos;
        this.servicios = servicios;
        this.totalVendido = totalVendido;
        this.cliente = cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Productos[] getProductos() {
        return productos;
    }

    public void setProductos(Productos[] productos) {
        this.productos = productos;
    }

    public Servicios[] getServicios() {
        return servicios;
    }

    public void setServicios(Servicios[] servicios) {
        this.servicios = servicios;
    }

    public double getTotalVendido() {
        return totalVendido;
    }

    public void setTotalVendido(double totalVendido) {
        this.totalVendido = totalVendido;
    }

    public LocalDateTime getFechaYHora() {
        return fechaYHora;
    }

    public void setFechaYHora(LocalDateTime fechaYHora) {
        this.fechaYHora = fechaYHora;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void agregarServicio(Servicio servicio){
        Servicio[] lista = Servicio[Servicio.lenght + 1];

    }
}
