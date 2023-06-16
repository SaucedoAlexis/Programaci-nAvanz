package Producto;

public class Producto {
    String tipoProducto;
    int codigoProducto;
    String descripcion;
    float precioProducto;
    int cantidadProducto;
    String animal;
    String marca;

    public Producto(String marca, String animal, String tipoProducto, int codigoProducto, String descripcion, float precioProducto, int cantidadProducto) {
        this.tipoProducto = tipoProducto;
        this.codigoProducto = codigoProducto;
        this.descripcion = descripcion;
        this.precioProducto = precioProducto;
        this.cantidadProducto = cantidadProducto;
        this.animal = animal;
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public int getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(int codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(float precioProducto) {
        this.precioProducto = precioProducto;
    }

    public int getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    public void mostrarProducto(){
        System.out.print(
                "\n-----------Detalles del producto comprado--------" +
                        "\nTipo de Producto: " + this.tipoProducto +
                        "\nCodigo Del Producto: " + this.codigoProducto +
                        "\nDescripción: " + this.descripcion +
                        "\nPrecio unitario: " + this.precioProducto +
                        "\nCantidad: " + this.cantidadProducto +
                        "\nAnimal: " + this.animal +
                        "\nMarca: " + this.marca);
    }

}
