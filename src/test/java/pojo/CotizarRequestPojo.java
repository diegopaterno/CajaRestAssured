package pojo;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CotizarRequestPojo {

    @JsonProperty("productor")
    private String productor = "5660";
    @JsonProperty("tipoDocumento")
    private String tipoDocumento = "";
    @JsonProperty("numeroDocumento")
    private String numeroDocumento = "";
    @JsonProperty("iva")
    private String iva = "5";
    @JsonProperty("porcentajeAjuste")
    private String porcentajeAjuste = "";
    @JsonProperty("cuotaIrregular")
    private String cuotaIrregular = "N";
    @JsonProperty("modalidad")
    private String modalidad = "";
    @JsonProperty("patente")
    private String patente = "";
    @JsonProperty("codigoMarca")
    private String codigoMarca = "";
    @JsonProperty("ceroKM")
    private String ceroKM = "N";
    @JsonProperty("gnc")
    private String gnc = "N";
    @JsonProperty("fechaVigencia")
    private String fechaVigencia = "";
    @JsonProperty("grupoAfinidad")
    private String grupoAfinidad = "";
    @JsonProperty("generaCotizacion")
    private String generaCotizacion = "";
    @JsonProperty("apellido")
    private String apellido = "Pater";
    @JsonProperty("nombres")
    private String nombres = "Diego";
    @JsonProperty("prefijo")
    private String prefijo = "";
    @JsonProperty("telefono")
    private String telefono = "";
    @JsonProperty("uso")
    private String uso = "1";
    @JsonProperty("roboContenido")
    private String roboContenido = "";
    @JsonProperty("accesorios")
    private List<Object> accesorios;
    @JsonProperty("fechaNac")
    private String fechaNac = "";
    @JsonProperty("email")
    private String email = "die@gmail.com";
    @JsonProperty("prefijo2")
    private String prefijo2 = "";
    @JsonProperty("telefono2")
    private String telefono2 = "";
    @JsonProperty("prefijo3")
    private String prefijo3 = "";
    @JsonProperty("telefono3")
    private String telefono3 = "";
    @JsonProperty("prefijo4")
    private String prefijo4 = "";
    @JsonProperty("telefono4")
    private String telefono4 = "";
    @JsonProperty("chasis")
    private String chasis = "";
    @JsonProperty("motor")
    private String motor = "";
    @JsonProperty("idBol")
    private String idBol = "";
    @JsonProperty("nombreCons")
    private String nombreCons = "";
    @JsonProperty("telCons")
    private String telCons = "";
    @JsonProperty("sucursal")
    private String sucursal = "";
    @JsonProperty("administrador")
    private String administrador = "";
    @JsonProperty("vendedor")
    private String vendedor = "";
    @JsonProperty("valorGnc")
    private String valorGnc = "";
    @JsonProperty("valorVeh")
    private String valorVeh = "";
    @JsonProperty("codInfoAuto")
    private String codInfoAuto = "";
    @JsonProperty("codigoPostal")
    private String codigoPostal = "";
    @JsonProperty("telematica")
    private String telematica = "N";
    @JsonProperty("anio")
    private String anio = "";

    @JsonProperty("productor")
    public String getProductor() {
        return productor;
    }

    @JsonProperty("productor")
    public void setProductor(String productor) {
        this.productor = productor;
    }

    @JsonProperty("tipoDocumento")
    public String getTipoDocumento() {
        return tipoDocumento;
    }

    @JsonProperty("tipoDocumento")
    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    @JsonProperty("numeroDocumento")
    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    @JsonProperty("numeroDocumento")
    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    @JsonProperty("iva")
    public String getIva() {
        return iva;
    }

    @JsonProperty("iva")
    public void setIva(String iva) {
        this.iva = iva;
    }

    @JsonProperty("porcentajeAjuste")
    public String getPorcentajeAjuste() {
        return porcentajeAjuste;
    }

    @JsonProperty("porcentajeAjuste")
    public void setPorcentajeAjuste(String porcentajeAjuste) {
        this.porcentajeAjuste = porcentajeAjuste;
    }

    @JsonProperty("cuotaIrregular")
    public String getCuotaIrregular() {
        return cuotaIrregular;
    }

    @JsonProperty("cuotaIrregular")
    public void setCuotaIrregular(String cuotaIrregular) {
        this.cuotaIrregular = cuotaIrregular;
    }

    @JsonProperty("modalidad")
    public String getModalidad() {
        return modalidad;
    }

    @JsonProperty("modalidad")
    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }

    @JsonProperty("patente")
    public String getPatente() {
        return patente;
    }

    @JsonProperty("patente")
    public void setPatente(String patente) {
        this.patente = patente;
    }

    @JsonProperty("codigoMarca")
    public String getCodigoMarca() {
        return codigoMarca;
    }

    @JsonProperty("codigoMarca")
    public void setCodigoMarca(String codigoMarca) {
        this.codigoMarca = codigoMarca;
    }

    @JsonProperty("ceroKM")
    public String getCeroKM() {
        return ceroKM;
    }

    @JsonProperty("ceroKM")
    public void setCeroKM(String ceroKM) {
        this.ceroKM = ceroKM;
    }

    @JsonProperty("gnc")
    public String getGnc() {
        return gnc;
    }

    @JsonProperty("gnc")
    public void setGnc(String gnc) {
        this.gnc = gnc;
    }

    @JsonProperty("fechaVigencia")
    public String getFechaVigencia() {
        return fechaVigencia;
    }

    @JsonProperty("fechaVigencia")
    public void setFechaVigencia(String fechaVigencia) {
        this.fechaVigencia = fechaVigencia;
    }

    @JsonProperty("grupoAfinidad")
    public String getGrupoAfinidad() {
        return grupoAfinidad;
    }

    @JsonProperty("grupoAfinidad")
    public void setGrupoAfinidad(String grupoAfinidad) {
        this.grupoAfinidad = grupoAfinidad;
    }

    @JsonProperty("generaCotizacion")
    public String getGeneraCotizacion() {
        return generaCotizacion;
    }

    @JsonProperty("generaCotizacion")
    public void setGeneraCotizacion(String generaCotizacion) {
        this.generaCotizacion = generaCotizacion;
    }

    @JsonProperty("apellido")
    public String getApellido() {
        return apellido;
    }

    @JsonProperty("apellido")
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @JsonProperty("nombres")
    public String getNombres() {
        return nombres;
    }

    @JsonProperty("nombres")
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    @JsonProperty("prefijo")
    public String getPrefijo() {
        return prefijo;
    }

    @JsonProperty("prefijo")
    public void setPrefijo(String prefijo) {
        this.prefijo = prefijo;
    }

    @JsonProperty("telefono")
    public String getTelefono() {
        return telefono;
    }

    @JsonProperty("telefono")
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @JsonProperty("uso")
    public String getUso() {
        return uso;
    }

    @JsonProperty("uso")
    public void setUso(String uso) {
        this.uso = uso;
    }

    @JsonProperty("roboContenido")
    public String getRoboContenido() {
        return roboContenido;
    }

    @JsonProperty("roboContenido")
    public void setRoboContenido(String roboContenido) {
        this.roboContenido = roboContenido;
    }

    @JsonProperty("accesorios")
    public List<Object> getAccesorios() {
        return accesorios;
    }

    @JsonProperty("accesorios")
    public void setAccesorios(List<Object> accesorios) {
        this.accesorios = accesorios;
    }

    @JsonProperty("fechaNac")
    public String getFechaNac() {
        return fechaNac;
    }

    @JsonProperty("fechaNac")
    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    @JsonProperty("prefijo2")
    public String getPrefijo2() {
        return prefijo2;
    }

    @JsonProperty("prefijo2")
    public void setPrefijo2(String prefijo2) {
        this.prefijo2 = prefijo2;
    }

    @JsonProperty("telefono2")
    public String getTelefono2() {
        return telefono2;
    }

    @JsonProperty("telefono2")
    public void setTelefono2(String telefono2) {
        this.telefono2 = telefono2;
    }

    @JsonProperty("prefijo3")
    public String getPrefijo3() {
        return prefijo3;
    }

    @JsonProperty("prefijo3")
    public void setPrefijo3(String prefijo3) {
        this.prefijo3 = prefijo3;
    }

    @JsonProperty("telefono3")
    public String getTelefono3() {
        return telefono3;
    }

    @JsonProperty("telefono3")
    public void setTelefono3(String telefono3) {
        this.telefono3 = telefono3;
    }

    @JsonProperty("prefijo4")
    public String getPrefijo4() {
        return prefijo4;
    }

    @JsonProperty("prefijo4")
    public void setPrefijo4(String prefijo4) {
        this.prefijo4 = prefijo4;
    }

    @JsonProperty("telefono4")
    public String getTelefono4() {
        return telefono4;
    }

    @JsonProperty("telefono4")
    public void setTelefono4(String telefono4) {
        this.telefono4 = telefono4;
    }

    @JsonProperty("chasis")
    public String getChasis() {
        return chasis;
    }

    @JsonProperty("chasis")
    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    @JsonProperty("motor")
    public String getMotor() {
        return motor;
    }

    @JsonProperty("motor")
    public void setMotor(String motor) {
        this.motor = motor;
    }

    @JsonProperty("idBol")
    public String getIdBol() {
        return idBol;
    }

    @JsonProperty("idBol")
    public void setIdBol(String idBol) {
        this.idBol = idBol;
    }

    @JsonProperty("nombreCons")
    public String getNombreCons() {
        return nombreCons;
    }

    @JsonProperty("nombreCons")
    public void setNombreCons(String nombreCons) {
        this.nombreCons = nombreCons;
    }

    @JsonProperty("telCons")
    public String getTelCons() {
        return telCons;
    }

    @JsonProperty("telCons")
    public void setTelCons(String telCons) {
        this.telCons = telCons;
    }

    @JsonProperty("sucursal")
    public String getSucursal() {
        return sucursal;
    }

    @JsonProperty("sucursal")
    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    @JsonProperty("administrador")
    public String getAdministrador() {
        return administrador;
    }

    @JsonProperty("administrador")
    public void setAdministrador(String administrador) {
        this.administrador = administrador;
    }

    @JsonProperty("vendedor")
    public String getVendedor() {
        return vendedor;
    }

    @JsonProperty("vendedor")
    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    @JsonProperty("valorGnc")
    public String getValorGnc() {
        return valorGnc;
    }

    @JsonProperty("valorGnc")
    public void setValorGnc(String valorGnc) {
        this.valorGnc = valorGnc;
    }

    @JsonProperty("valorVeh")
    public String getValorVeh() {
        return valorVeh;
    }

    @JsonProperty("valorVeh")
    public void setValorVeh(String valorVeh) {
        this.valorVeh = valorVeh;
    }

    @JsonProperty("codInfoAuto")
    public String getCodInfoAuto() {
        return codInfoAuto;
    }

    @JsonProperty("codInfoAuto")
    public void setCodInfoAuto(String codInfoAuto) {
        this.codInfoAuto = codInfoAuto;
    }

    @JsonProperty("codigoPostal")
    public String getCodigoPostal() {
        return codigoPostal;
    }

    @JsonProperty("codigoPostal")
    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    @JsonProperty("telematica")
    public String getTelematica() {
        return telematica;
    }

    @JsonProperty("telematica")
    public void setTelematica(String telematica) {
        this.telematica = telematica;
    }

    @JsonProperty("anio")
    public String getAnio() {
        return anio;
    }

    @JsonProperty("anio")
    public void setAnio(String anio) {
        this.anio = anio;
    }

}