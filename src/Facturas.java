public class Facturas {
    private Integer codfactura;
    private String fechafactura;
    private Integer codcliente;
    private String codproducto;
    private String codservicio;
    private String baseimp;
    private String total;


    public Integer getCodfactura() {
        return codfactura;
    }

    public void setCodfactura(Integer codfactura) {
        this.codfactura = codfactura;
    }

    public String getFechafactura() {
        return fechafactura;
    }

    public void setFechafactura(String fechafactura) {
        this.fechafactura = fechafactura;
    }
    public Integer getCodcliente() {
        return codcliente;
    }

    public void setCodcliente(Integer codcliente) {
        this.codcliente = codcliente;
    }
    public String getCodproducto() {
        return codproducto;
    }
    public void setCodproducto(String codproducto) {
        this.codproducto = codproducto;
    }

    public String getCodservicio() {
        return codservicio;
    }
    public void setCodservicio(String codservicio) {
        this.codservicio = codservicio;
    }

    public String getBaseimp() {
        return baseimp;
    }
    public void setBaseimp(String baseimp) {
        this.baseimp = baseimp;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }
}
