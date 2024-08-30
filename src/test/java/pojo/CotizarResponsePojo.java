package pojo;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.restassured.specification.ResponseSpecification;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CotizarResponsePojo {

    @JsonProperty("accesorios")
    private Object accesorios;
    @JsonProperty("descripcionAuto")
    private String descripcionAuto;
    @JsonProperty("nroPresupuesto")
    private String nroPresupuesto;
    @JsonProperty("planes")
    private List<Planes> planes;
    @JsonProperty("provincia")
    private String provincia;
    @JsonProperty("tipoVehiculo")
    private String tipoVehiculo;
    @JsonProperty("valor")
    private String valor;
    @JsonProperty("accesoriosDetalle")
    private List<Object> accesoriosDetalle;
    @JsonProperty("provinciaId")
    private String provinciaId;
    @JsonProperty("tipoVehiculoId")
    private String tipoVehiculoId;
    @JsonProperty("codClaseId")
    private String codClaseId;
    @JsonProperty("codMarca")
    private Integer codMarca;
    @JsonProperty("importado")
    private String importado;
    @JsonProperty("urlCotizacion")
    private Object urlCotizacion;
    @JsonProperty("errorCode")
    private Integer errorCode;

    @JsonProperty("accesorios")
    public Object getAccesorios() {
        return accesorios;
    }

    @JsonProperty("accesorios")
    public void setAccesorios(Object accesorios) {
        this.accesorios = accesorios;
    }

    @JsonProperty("descripcionAuto")
    public String getDescripcionAuto() {
        return descripcionAuto;
    }

    @JsonProperty("descripcionAuto")
    public void setDescripcionAuto(String descripcionAuto) {
        this.descripcionAuto = descripcionAuto;
    }

    @JsonProperty("nroPresupuesto")
    public String getNroPresupuesto() {
        return nroPresupuesto;
    }

    @JsonProperty("nroPresupuesto")
    public void setNroPresupuesto(String nroPresupuesto) {
        this.nroPresupuesto = nroPresupuesto;
    }

    @JsonProperty("planes")
    public List<Planes> getPlanes() {
        return planes;
    }

    @JsonProperty("planes")
    public void setPlanes(List<Planes> planes) {
        this.planes = planes;
    }

    @JsonProperty("provincia")
    public String getProvincia() {
        return provincia;
    }

    @JsonProperty("provincia")
    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    @JsonProperty("tipoVehiculo")
    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    @JsonProperty("tipoVehiculo")
    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    @JsonProperty("valor")
    public String getValor() {
        return valor;
    }

    @JsonProperty("valor")
    public void setValor(String valor) {
        this.valor = valor;
    }

    @JsonProperty("accesoriosDetalle")
    public List<Object> getAccesoriosDetalle() {
        return accesoriosDetalle;
    }

    @JsonProperty("accesoriosDetalle")
    public void setAccesoriosDetalle(List<Object> accesoriosDetalle) {
        this.accesoriosDetalle = accesoriosDetalle;
    }

    @JsonProperty("provinciaId")
    public String getProvinciaId() {
        return provinciaId;
    }

    @JsonProperty("provinciaId")
    public void setProvinciaId(String provinciaId) {
        this.provinciaId = provinciaId;
    }

    @JsonProperty("tipoVehiculoId")
    public String getTipoVehiculoId() {
        return tipoVehiculoId;
    }

    @JsonProperty("tipoVehiculoId")
    public void setTipoVehiculoId(String tipoVehiculoId) {
        this.tipoVehiculoId = tipoVehiculoId;
    }

    @JsonProperty("codClaseId")
    public String getCodClaseId() {
        return codClaseId;
    }

    @JsonProperty("codClaseId")
    public void setCodClaseId(String codClaseId) {
        this.codClaseId = codClaseId;
    }

    @JsonProperty("codMarca")
    public Integer getCodMarca() {
        return codMarca;
    }

    @JsonProperty("codMarca")
    public void setCodMarca(Integer codMarca) {
        this.codMarca = codMarca;
    }

    @JsonProperty("importado")
    public String getImportado() {
        return importado;
    }

    @JsonProperty("importado")
    public void setImportado(String importado) {
        this.importado = importado;
    }

    @JsonProperty("urlCotizacion")
    public Object getUrlCotizacion() {
        return urlCotizacion;
    }

    @JsonProperty("urlCotizacion")
    public void setUrlCotizacion(Object urlCotizacion) {
        this.urlCotizacion = urlCotizacion;
    }

    @JsonProperty("errorCode")
    public Integer getErrorCode() {
        return errorCode;
    }

    @JsonProperty("errorCode")
    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

}