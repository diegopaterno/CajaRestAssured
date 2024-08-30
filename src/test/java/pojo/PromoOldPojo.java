package pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PromoOldPojo {

    @JsonProperty("codCia")
    private Integer codCia = 1;
    @JsonProperty("codSecc")
    private Integer codSecc = 4;
    @JsonProperty("codRamo")
    private Integer codRamo = 1;
    @JsonProperty("codPresup")
    private String codPresup = "2603201";
    @JsonProperty("email")
    private String email = "die@gmail.com";

    @JsonProperty("codCia")
    public Integer getCodCia() {
        return codCia;
    }

    @JsonProperty("codCia")
    public void setCodCia(Integer codCia) {
        this.codCia = codCia;
    }

    @JsonProperty("codSecc")
    public Integer getCodSecc() {
        return codSecc;
    }

    @JsonProperty("codSecc")
    public void setCodSecc(Integer codSecc) {
        this.codSecc = codSecc;
    }

    @JsonProperty("codRamo")
    public Integer getCodRamo() {
        return codRamo;
    }

    @JsonProperty("codRamo")
    public void setCodRamo(Integer codRamo) {
        this.codRamo = codRamo;
    }

    @JsonProperty("codPresup")
    public String getCodPresup() {
        return codPresup;
    }

    @JsonProperty("codPresup")
    public void setCodPresup(String codPresup) {
        this.codPresup = codPresup;
    }

    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

}