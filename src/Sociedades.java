public class Sociedades implements Clientes {
    private String cif;
    private String nombre;
    private String poblacion;
    private String dirpostal;
    private String provincia;
    private String email;
    private String telefono;


    @Override
    public String getId() {
        return this.cif;
    }

    @Override
    public String getNombre() {
        return this.nombre;
    }

    @Override
    public String getEmail() {
        return this.email;
    }


    @Override
    public String getPoblacion() {
        return this.poblacion;
    }
    public void setDirpostal(String dirpostal) {
        this.dirpostal = dirpostal;
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

    public void setCif(String cif) {
        this.cif = cif;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
