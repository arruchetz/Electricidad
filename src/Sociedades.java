public class Sociedades {
    private Integer codcliente;
    private String razonsocial;
    private Integer cif;
    private String dirpostal;
    private String poblacion;
    private String provincia;
    private String email;
    private Integer telefono;

    public Integer getCodcliente(){
        return codcliente;
    }
    public void setCodcliente(Integer codcliente){
        this.codcliente = codcliente;
    }

    public String getRazonsocial(){
        return razonsocial;
    }
    public void  setRazonsocial(String razonsocial){
        this.razonsocial = razonsocial;
    }

    public Integer getCif(){
        return cif;
    }
    public void  setCif(Integer cif){
        this.cif = cif;
    }

    public String getDirpostal(){
        return dirpostal;
    }
    public void  setDirpostal(String dirpostal){
        this.dirpostal = dirpostal;
    }

    public String getPoblacion(){
        return poblacion;
    }
    public void  setPoblacion(String poblacion){
        this.poblacion = poblacion;
    }

    public String getProvincia(){
        return provincia;
    }
    public void  setProvincia(String provincia){
        this.provincia = provincia;
    }

    public String getEmail(){
        return email;
    }
    public void  setEmail(String email){
        this.email = email;
    }

    public Integer getTelefono(){
        return telefono;
    }
    public void  setTelefono(Integer telefono){
        this.telefono = telefono;
    }
}
