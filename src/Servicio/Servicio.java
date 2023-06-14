package Servicio;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Servicio {
    private String nombreServicio;
    private double precio;
    private String reporte;

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



    }
    public void mostrarServicio(){
        System.out.print(
               "\n-----------Detalles del servicio contratado--------" +
                "\nNombre Del Servicio: " + this.nombreServicio +
                "\nPrecio: " + this.precio +
                "\nReporte: " + this.reporte);
    }


}

