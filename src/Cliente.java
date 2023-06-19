public class Cliente {
    private int dni;
    private String nombre;
    private String apellido;
    private int telefono;
    private int celular;
    private String direccion;
    private String mail;

    public Cliente(int dni, String nombre, String apellido, int telefono, int celular, String direccion, String mail) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.celular = celular;
        this.direccion = direccion;
        this.mail = mail;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void mostrarCliente(){
        System.out.print("Dni: " + this.getDni() +
                        "\nNombre: " + this.getNombre() +
                        "\nApellido: " + this.getApellido() +
                        "\nTelefono: " + this.getTelefono() +
                        "\nCelular: " + this.getCelular() +
                        "\nDirección: " + this.getDireccion() +
                        "\nMail: " + this.getMail());
    }
}
