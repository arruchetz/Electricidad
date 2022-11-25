public class Autonomos implements Clientes {
    private String dni;
    private String nombre;
    private String apellidos;
    private String dirpostal;
    private String poblacion;
    private String provincia;
    private String email;
    private String telefono;


    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public String getApellidos() {
        return apellidos;
    }

    @Override
    public String getId() {
        return this.dni;
    }

    @Override
    public String getNombre() {
        return this.nombre;
    }

    @Override
    public String getDirpostal() {
        return this.dirpostal;
    }

    @Override
    public String getPoblacion() {
        return this.poblacion;
    }

    @Override
    public String getProvincia() {
        return this.provincia;
    }

    @Override
    public String getEmail() {
        return this.email;
    }

    @Override
    public String getTelefono() {
        return this.telefono;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMailingAddress(String dirpostal) {
        this.dirpostal = dirpostal;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

}
