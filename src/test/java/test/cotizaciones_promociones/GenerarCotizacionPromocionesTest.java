package test.cotizaciones_promociones;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.qameta.allure.*;
import io.qameta.allure.testng.Tag;
import io.qameta.allure.testng.Tags;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.*;
import pojo.CotizarRequestPojo;
import pojo.CotizarResponsePojo;
import pojo.PromoOldPojo;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import static api.SpecBuilder.*;
import static io.restassured.RestAssured.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class GenerarCotizacionPromocionesTest {

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
    public void deberiaGenerarCotizacionYPromociones(String codigoMarca, String codigoPostal, String anio) throws JsonProcessingException {

        CotizarRequestPojo cotizarRequestPojo = new CotizarRequestPojo();
            cotizarRequestPojo.setCodigoMarca(codigoMarca);
            cotizarRequestPojo.setCodigoPostal(codigoPostal);
            cotizarRequestPojo.setAnio(anio);
         String nroPresupuesto = given(getRequestSpec()).
                body(cotizarRequestPojo).
                when().post().then().log().all()
               .extract().response().getBody().jsonPath().get("nroPresupuesto");
      System.out.println("Este es el numero de presupuesto : "+ nroPresupuesto);


        PromoOldPojo promoOldPojo = new PromoOldPojo();
        promoOldPojo.setCodPresup(nroPresupuesto);

        Response responseOld = given(getRequestPromoSpec()).body(promoOldPojo)
                .when().post().
                then().log().all().extract().response();

        PromoOldPojo promoNewPojo = new PromoOldPojo();
        promoNewPojo.setCodPresup(nroPresupuesto);

        Response responseNew =given(getRequestPromoNewSpec()).body(promoOldPojo)
                .when().post().
                then().log().all().extract().response();

        compararCuerposRespuestas(responseOld, responseNew);

    }

    @Step("comparamos las respuestas")
    private void compararCuerposRespuestas(Response responseOld, Response responseNew) throws JsonProcessingException {
    ObjectMapper objectMapper = new ObjectMapper();
    Map<String, Object> bodyOld = objectMapper.readValue(responseOld.getBody().asString(), Map.class);
    Map<String, Object> bodyNew = objectMapper.readValue(responseNew.getBody().asString(), Map.class);

    // Aserción para comparar el cuerpo de las respuestas
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


    @AfterMethod
    public void tearDownTest(){
        System.out.println("voy al final");
    }

}
