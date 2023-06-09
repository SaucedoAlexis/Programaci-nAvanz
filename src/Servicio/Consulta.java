package Servicio;

import java.util.Date;

public class Consulta extends Servicio{
    String tratamiento;

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }

    public Consulta(double precio,String reporte, String tratamiento){
        super("Consulta",precio,reporte);
        this.tratamiento = tratamiento;

    }

    @Override
    public void mostrarServicio() {
        super.mostrarServicio();
        System.out.println("\nTratamiento: " + this.tratamiento);
    }
}
