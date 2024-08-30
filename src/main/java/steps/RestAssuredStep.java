package steps;

import base.RequestBase;
import base.ResponseBase;
import enums.RequestMethods;
import enums.RequestHeaders;
import helpers.RestAssuredHelper;
import com.fasterxml.jackson.databind.JsonNode;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.*;

public class RestAssuredStep {


    /*public ResponseBase excecute(){
        return new ResponseBase();
    }
    /**
    *
    * @param authConfig JsonNode que contiene toda la info para ejecutar la peticion http
    */
    /*public String getToken(JsonNode authConfig){
        RequestBase authRequest = new RequestBase(authConfig.get("url_token").textValue(), RequestMethods.POST);
        authRequest.setFormData("grant_type",authConfig.get("client_credentials").textValue());
        //authRequest.setHeader(RequestHeaders.CONTENT_TYPE(""));
        authRequest.setHeaders(RequestHeaders.CONTENT_TYPE, "application/x-www-form-urlencoded");
        RequestSpecification requestSpecification = RestAssuredHelper.createRequestSpecification(authRequest);
        //attachRequestFile(authRequest);//objeto de Allure para dejar el archivo en el reporte
        Response response = RestAssuredHelper.execute(requestSpecification,authRequest.getMethod());
        ResponseBase authResponse = new ResponseBase(response);
        return token;
    }*/
}
