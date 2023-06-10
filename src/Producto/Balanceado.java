package Producto;

public class Balanceado extends Producto{
    int peso;



    public Balanceado(String marca,int peso, int codigoProducto,String descripción, float precioProducto, int cantidadProducto, String animal) {
super(marca,animal,"Alimento Balanceado",codigoProducto,descripción,precioProducto,cantidadProducto);
    this.peso = peso;


    }

    @Override
    public void mostrarProducto() {
        super.mostrarProducto();
        System.out.println
                ("\nPeso: " + this.peso + "Kg");
    }
}
