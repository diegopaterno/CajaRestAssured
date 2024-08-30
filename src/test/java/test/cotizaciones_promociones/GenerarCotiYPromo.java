package test.cotizaciones_promociones;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.qameta.allure.*;
import io.qameta.allure.testng.Tag;
import io.qameta.allure.testng.Tags;
import io.restassured.response.Response;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pojo.CotizarRequestPojo;
import pojo.PromoOldPojo;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import static api.SpecBuilder.*;
import static io.restassured.RestAssured.given;

public class GenerarCotiYPromo  {

    @Epic("DIFERENCIAS APIS = '/promociones' vs. '/promociones2'")
    @Severity(SeverityLevel.CRITICAL)
    @Tags({@Tag("cotizar"), @Tag("promociones")})
    @Feature("Iteracion para evidenciar diferencias entre OldAPI & NewAPI")
    @Story("Consultar PROMOCIONES")
    @Description("DADA una determinada composicion del requerimiento de cotizacion\n " +
            "CUANDO se cotiza una poliza \n" +
            "ENTONCES se debe obtener una lista de Promociones & comparar las promociones \n" +
            "de la version anterior de la api de promociones con la nueva version")
    @Test(dataProvider = "iteracion",
            description = "Deberia generar 3 Cotizacion y brindar Promociones ")
    public void deberiaGenerarCotizacionYPromociones(String codigoMarca, String codigoPostal, String anio) throws Exception {
        CotizarRequestPojo cotizarRequestPojo = crearCotizarRequestPojo(codigoMarca, codigoPostal, anio);
        String nroPresupuesto = realizarCotizacion(cotizarRequestPojo);

        PromoOldPojo promoOldPojo = crearPromoOldPojo(nroPresupuesto);
        Response responseOld = realizarPeticionPromoOld(promoOldPojo);

        PromoOldPojo promoNewPojo = crearPromoNewPojo(nroPresupuesto);
        Response responseNew = realizarPeticionPromoNew(promoNewPojo);

        compararCuerposRespuestas(responseOld, responseNew);
    }

    @Step("Crear CotizarRequestPojo")
    private CotizarRequestPojo crearCotizarRequestPojo(String codigoMarca, String codigoPostal, String anio) {
        CotizarRequestPojo cotizarRequestPojo = new CotizarRequestPojo();
        cotizarRequestPojo.setCodigoMarca(codigoMarca);
        cotizarRequestPojo.setCodigoPostal(codigoPostal);
        cotizarRequestPojo.setAnio(anio);
        return cotizarRequestPojo;
    }

    @Step("Realizar cotización con: {0}")
    private String realizarCotizacion(CotizarRequestPojo cotizarRequestPojo) {
        String nroPresupuesto = given(getRequestSpec())
                .body(cotizarRequestPojo)
                .when().post()
                .then().log().all()
                .extract().response().getBody().jsonPath().get("nroPresupuesto");
        System.out.println("Este es el número de presupuesto: " + nroPresupuesto);
        return nroPresupuesto;
    }

    @Step("Crear PromoOldPojo")
    private PromoOldPojo crearPromoOldPojo(String nroPresupuesto) {
        PromoOldPojo promoOldPojo = new PromoOldPojo();
        promoOldPojo.setCodPresup(nroPresupuesto);
        return promoOldPojo;
    }

    @Step("Realizar petición de promoción antigua con: {0}")
    private Response realizarPeticionPromoOld(PromoOldPojo promoOldPojo) {
        return given(getRequestPromoSpec())
                .body(promoOldPojo)
                .when().post()
                .then().log().all()
                .extract().response();
    }

    @Step("Crear PromoNewPojo")
    private PromoOldPojo crearPromoNewPojo(String nroPresupuesto) {
        PromoOldPojo promoNewPojo = new PromoOldPojo();
        promoNewPojo.setCodPresup(nroPresupuesto);
        return promoNewPojo;
    }

    @Step("Realizar petición de promoción nueva con: {0}")
    private Response realizarPeticionPromoNew(PromoOldPojo promoNewPojo) {
        return given(getRequestPromoNewSpec())
                .body(promoNewPojo)
                .when().post()
                .then().log().all()
                .extract().response();
    }

    @Step("Comparar cuerpos de respuesta")
    private void compararCuerposRespuestas(Response responseOld, Response responseNew) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        Map<String, Object> bodyOld = objectMapper.readValue(responseOld.getBody().asString(), Map.class);
        Map<String, Object> bodyNew = objectMapper.readValue(responseNew.getBody().asString(), Map.class);
        Assert.assertEquals(bodyOld, bodyNew);
    }
    @DataProvider(name = "iteracion")
    public Object[][] getData() throws IOException {
        File file = new File("src/test/resources/data.json");

        ObjectMapper mapper = new ObjectMapper();
        CotizarRequestPojo[] requestPojos = mapper.readValue(file, CotizarRequestPojo[].class);

        Object[][] testData = new Object[requestPojos.length][3];

        for(int i = 0; i < requestPojos.length; i++){
            testData[i][0] = requestPojos[i].getCodigoMarca();
            testData[i][1] = requestPojos[i].getCodigoPostal();
            testData[i][2] = requestPojos[i].getAnio();
        };
        return testData;
    }
    /**
     * Construye una cadena con los detalles del cuerpo de la solicitud HTTP.
     *
     * @param promoOldPojo  La instancia de RequestBase que contiene los detalles de la solicitud.
     * @return Una cadena que representa el cuerpo de la solicitud.

    private static String buildBodyString(PromoOldPojo promoOldPojo) {
        return promoOldPojo.getBody() != null
                ? String.format("\nBody: %s", promoOldPojo.getBody().toPrettyString())
                : new String();
    }*/
}