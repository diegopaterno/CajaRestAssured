package api;

import io.qameta.allure.Step;
import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;


import static reports.AllureReport.attachRequestFile;
import static reports.AllureReport.attachResponseFile;

public class SpecBuilder {
    private static final Logger logger = LoggerFactory.getLogger(SpecBuilder.class);

    @Step("request de cotizacion")
    public static RequestSpecification getRequestSpec(){
        String accessToken = getAccessToken();
        return new RequestSpecBuilder().
                setBaseUri("https://servicios-tst.lacaja.com.ar/autos-ws/v2").
                setBasePath("/cotizaciones/cotizar").
                addHeader("Authorization", "Bearer "+accessToken).
                addHeader("Cookie", "ZNPCQ003-32343800=2a85598c").
                setContentType(ContentType.JSON).
                addFilter(new AllureRestAssured()).
                log(LogDetail.ALL).
                build();
   }
   @Step("request de api Promo Old")
    public static RequestSpecification getRequestPromoSpec(){
        String accessToken = getAccessToken();
        return new RequestSpecBuilder().
                setBaseUri("http://beta.caja.com:9059").
                setBasePath("/promociones").
                addHeader("Authorization", "Bearer "+accessToken).
                addHeader("Cookie", "ZNPCQ003-32343800=2a85598c").
                setContentType(ContentType.JSON).
                addFilter(new AllureRestAssured()).
                log(LogDetail.ALL).
                build();
    }
    @Step("request de New Promo")
    public static RequestSpecification getRequestPromoNewSpec(){
        String accessToken = getAccessToken();
        return new RequestSpecBuilder().
                setBaseUri("http://beta.caja.com:9059").//http://beta.caja.com:9059
                setBasePath("/promociones2").
                addHeader("Authorization", "Bearer "+accessToken).
                addHeader("Cookie", "ZNPCQ003-32343800=2a85598c").
                setContentType(ContentType.JSON).
                addFilter(new AllureRestAssured()).
                log(LogDetail.ALL).
                build();
    }
   public static ResponseSpecification getResponseSpec(){
        return new ResponseSpecBuilder().log(LogDetail.ALL).build();
   }

    private static String getAccessToken() {
        RestAssured.baseURI = "https://servicios-tst.lacaja.com.ar";
        String token = "";
        Response  response =
                given().header("Authorization","Basic Y1VBd25xWGwzXzhrZmFtb1ZqQ1pUM1lvV01JYTpCVlVaTVY3M2FTSUpVeEp1bmY3VVRFamlNVm9h").
                        formParam("grant_type", "client_credentials").
                        post("/token?grant_type=client_credentials");
        Assert.assertEquals(response.getStatusCode(), 200, "estado de la repuesta es ok");
        token = response.jsonPath().getString("access_token");
        Assert.assertNotNull(token, "el token esta vacio");
        Assert.assertFalse(token.isEmpty(), "TOKEN VACIO");
        System.out.println("token obtenido : " + token);
        return token;
    }
    public void getAccesToken(){
        RestAssured.baseURI = "https://servicios-tst.lacaja.com.ar";
        String token = "";
        Response  response =
                given().header("Authorization","Basic Y1VBd25xWGwzXzhrZmFtb1ZqQ1pUM1lvV01JYTpCVlVaTVY3M2FTSUpVeEp1bmY3VVRFamlNVm9h").
                        formParam("grant_type", "client_credentials").
                        post("/token?grant_type=client_credentials");
        Assert.assertEquals(response.getStatusCode(), 200, "estado de la repuesta es ok");
        token = response.jsonPath().getString("access_token");
        Assert.assertNotNull(token, "el token esta vacio");
        Assert.assertFalse(token.isEmpty(), "TOKEN VACIO");
        System.out.println("token obtenido : " + token);
       // return token;

    }
}
