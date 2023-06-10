package Servicio;


public class Castrar extends Servicio {
    String metodo;

    public String getMetodo() {
        return metodo;
    }

    public void setMetodo(String metodo) {
        this.metodo = metodo;
    }

    public Castrar(double precio,String reporte, String metodo){
        super("Castrar",precio,reporte);

        this.metodo = metodo;


    }
    @Override
    public void mostrarServicio(){
        super.mostrarServicio();
        System.out.println("\nMetodo: " + this.metodo);
    }
}
