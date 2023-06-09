package Servicio;

import java.util.Date;

public class Servicio {
    String nombreServicio;
    double precio;
    Date fecha;
    String reporte;

    public String getNombreServicio() {
        return nombreServicio;
    }

    public void setNombreServicio(String nombreServicio) {
        this.nombreServicio = nombreServicio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = new Date();
    }

    public String getReporte() {
        return reporte;
    }

    public void setReporte(String reporte) {
        this.reporte = reporte;
    }
    public Servicio(String nombreServicio,double precio, String reporte){
        this.nombreServicio = nombreServicio;
        this.precio = precio;
        this.reporte = reporte;
        this.fecha = new Date();
    }
    public void mostrarServicio(){
        System.out.print(
               "\n-----------Detalles del servicio contratado--------" +
                "\nNombre Servicio: " + this.nombreServicio +
                "\nPrecio: " + this.precio +
                "\nReporte: " + this.reporte +
                "\nfecha: " + this.fecha);
    }


}

