package helpers;

import base.RequestBase;
import enums.RequestHeaders;
import enums.RequestMethods;
import io.restassured.RestAssured;
import io.restassured.config.HttpClientConfig;
import io.restassured.config.RestAssuredConfig;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public class RestAssuredHelper {
    /**
     * Crea una especificacion de solicitud (RequestSpecification) basada en los detalles proporcionados
     * en una instancia de RequestBase
     *
     * @param requestBase La instancia de RequestBase que contiene los detalles de la solicitud.
     *
     * @return Una especificacion de solicitud configurada.
     */
    public static RequestSpecification createRequestSpecification(RequestBase requestBase){
        final int TIMEOUT = 60000;
        RestAssuredConfig config = RestAssured.config().httpClient(
                HttpClientConfig
                        .httpClientConfig()
                        .setParam("http.connection.timeout", TIMEOUT) // TIMEOUT de conexion en milisegundos
                        .setParam("http.socket.timeout", TIMEOUT)
        );
        RequestSpecification requestSpecification =
                given().
                        config(config).
                        log().all().relaxedHTTPSValidation("").baseUri(requestBase.getUrl());

        if (requestBase.getPath() != null){
            requestSpecification.basePath(requestBase.getPath());
        }
    return requestSpecification;

    }
    /**
     * Ejecuta una solicitud HTTP basada en la especificacion de solicitud y el metodo
     * de solicitud proporcionados.
     *
     * @param requestSpecification La especificacion de solicitud configurada.
     * @param requestMethod        El metodo de solicitud HTTP (GET, POST, etc).
     * @return La respuesta de la solicitud HTTP.
     */
    public static Response execute(RequestSpecification requestSpecification, RequestMethods requestMethod){
        return requestSpecification.when().request(requestMethod.getType()).then().extract().response();
    }





}
