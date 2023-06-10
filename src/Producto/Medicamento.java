package Producto;

public class Medicamento extends Producto{
    String dosis;
    String presentacion;

    public Medicamento(String animal,int codigoProducto,String descripción, float precioProducto, int cantidadProducto, String marca ,String dosis, String presentacion) {
        super(marca,animal,"Medicamento",45441,descripción,precioProducto,cantidadProducto);
        this.dosis = dosis;
        this.presentacion = presentacion;
    }

    public String getDosis() {
        return dosis;
    }

    public void setDosis(String dosis) {
        this.dosis = dosis;
    }

    public String getPresentacion() {
        return presentacion;
    }

    public void setPresentacion(String presentacion) {
        this.presentacion = presentacion;
    }
    @Override
    public void mostrarProducto(){
        super.mostrarProducto();
        System.out.println("\nDosis : " + this.dosis +
                "\nPresentación: " + this.presentacion);
    }
}
