package pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class Planes {

    @JsonProperty("codigo")
    private String codigo;
    @JsonProperty("debito")
    private String debito;
    @JsonProperty("descripcion")
    private String descripcion;
    @JsonProperty("efectivo")
    private String efectivo;
    @JsonProperty("franquicia")
    private String franquicia;
    @JsonProperty("franquiciarobo")
    private String franquiciarobo;
    @JsonProperty("inspeccionable")
    private String inspeccionable;
    @JsonProperty("prima")
    private String prima;
    @JsonProperty("primaefectivo")
    private String primaefectivo;
    @JsonProperty("conRecuperador")
    private String conRecuperador;
    @JsonProperty("descripcionTipoPlan")
    private String descripcionTipoPlan;

    @JsonProperty("codigo")
    public String getCodigo() {
        return codigo;
    }

    @JsonProperty("codigo")
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @JsonProperty("debito")
    public String getDebito() {
        return debito;
    }

    @JsonProperty("debito")
    public void setDebito(String debito) {
        this.debito = debito;
    }

    @JsonProperty("descripcion")
    public String getDescripcion() {
        return descripcion;
    }

    @JsonProperty("descripcion")
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @JsonProperty("efectivo")
    public String getEfectivo() {
        return efectivo;
    }

    @JsonProperty("efectivo")
    public void setEfectivo(String efectivo) {
        this.efectivo = efectivo;
    }

    @JsonProperty("franquicia")
    public String getFranquicia() {
        return franquicia;
    }

    @JsonProperty("franquicia")
    public void setFranquicia(String franquicia) {
        this.franquicia = franquicia;
    }

    @JsonProperty("franquiciarobo")
    public String getFranquiciarobo() {
        return franquiciarobo;
    }

    @JsonProperty("franquiciarobo")
    public void setFranquiciarobo(String franquiciarobo) {
        this.franquiciarobo = franquiciarobo;
    }

    @JsonProperty("inspeccionable")
    public String getInspeccionable() {
        return inspeccionable;
    }

    @JsonProperty("inspeccionable")
    public void setInspeccionable(String inspeccionable) {
        this.inspeccionable = inspeccionable;
    }

    @JsonProperty("prima")
    public String getPrima() {
        return prima;
    }

    @JsonProperty("prima")
    public void setPrima(String prima) {
        this.prima = prima;
    }

    @JsonProperty("primaefectivo")
    public String getPrimaefectivo() {
        return primaefectivo;
    }

    @JsonProperty("primaefectivo")
    public void setPrimaefectivo(String primaefectivo) {
        this.primaefectivo = primaefectivo;
    }

    @JsonProperty("conRecuperador")
    public String getConRecuperador() {
        return conRecuperador;
    }

    @JsonProperty("conRecuperador")
    public void setConRecuperador(String conRecuperador) {
        this.conRecuperador = conRecuperador;
    }

    @JsonProperty("descripcionTipoPlan")
    public String getDescripcionTipoPlan() {
        return descripcionTipoPlan;
    }

    @JsonProperty("descripcionTipoPlan")
    public void setDescripcionTipoPlan(String descripcionTipoPlan) {
        this.descripcionTipoPlan = descripcionTipoPlan;
    }

}
