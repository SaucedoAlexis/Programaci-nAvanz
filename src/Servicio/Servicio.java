package Servicio;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Servicio {
    String nombreServicio;
    double precio;
    String fecha;
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

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
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
        // Formateo de horario
        LocalDateTime fechaSinFormato = LocalDateTime.now();
        DateTimeFormatter formateoDeFecha = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        this.fecha = formateoDeFecha.format(fechaSinFormato);


    }
    public void mostrarServicio(){
        System.out.print(
               "\n-----------Detalles del servicio contratado--------" +
                "\nNombre Del Servicio: " + this.nombreServicio +
                "\nPrecio: " + this.precio +
                "\nReporte: " + this.reporte +
                "\nfecha: " + this.fecha);
    }


}

