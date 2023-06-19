public class Vendedor {
    private String nombre;

    public Vendedor(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Venta realizarVenta(Cliente cliente){
        Venta nuevaVenta = new Venta(this,cliente);
        return nuevaVenta;

    }

    public Cliente registrarCliente(int dni, String nombre, String apellido, int telefono, int celular, String direccion, String mail){
        Cliente nuevoCliente = new Cliente(dni,nombre,apellido,telefono,celular,direccion,mail);
        return nuevoCliente;
    }
}
