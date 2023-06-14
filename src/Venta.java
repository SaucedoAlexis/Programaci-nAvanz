import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import Producto.*;
import Servicio.*;

public class Venta {
    private Vendedor vendedor;
    private ArrayList<Producto> listaProductos = new ArrayList<>();
    private ArrayList<Servicio> listaServicios = new ArrayList<>();
    private double totalVendido;
    private String fechaYHora;
    private Cliente cliente;

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public ArrayList<Producto> getProductos() {
        return listaProductos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.listaProductos = productos;
    }

    public ArrayList<Servicio> getServicios() {
        return listaServicios;
    }

    public void setServicios(ArrayList<Servicio> servicios) {
        this.listaServicios = servicios;
    }

    public double getTotalVendido() {
        return totalVendido;
    }

    public void setTotalVendido(double totalVendido) {
        this.totalVendido = totalVendido;
    }

    public String getFechaYHora() {
        return fechaYHora;
    }

    public void setFechaYHora(String fechaYHora) {
        this.fechaYHora = fechaYHora;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Venta(Vendedor vendedor,Cliente cliente){
        this.vendedor = vendedor;
        this.cliente = cliente;
        // Formateo de horario
        LocalDateTime fechaSinFormato = LocalDateTime.now();
        DateTimeFormatter formateoDeFecha = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        //Asignación de horario
        this.fechaYHora = formateoDeFecha.format(fechaSinFormato);
    }

    public void agregarProducto(Producto producto){
        this.listaProductos.add(producto);
    }

    public void mostrarProductos(){
        ArrayList<Producto> productos = this.listaProductos;
        for ( Producto producto : productos){
            producto.mostrarProducto();
        }
    }
}
