package base;

import com.fasterxml.jackson.databind.JsonNode;
import helpers.JsonNodeHelper;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

import java.util.Map;

/**
 * La clase ResponseBase proporciona una estructura para la manipulacion de las respuestas HTTP.
 * Esta clase incluye metodos para obtener el codigo de estado, tiempo de respuesta, body de la respuesta,
 * cookies y tipos de contenido de la respuesta
 */

public class ResponseBase {

    private int statusCode;
    private long time;
    private JsonNode body;
    private Map<String, String> cookies;
    private String contentTypes;

    /**
     * Constructor de ResponseBase que inicializa los atributos de la respuesta HTTP.
     *
     * @param response La respuesta HTTP  de la cual se extraen los atributos
     */

    public ResponseBase(Response response) {
        setStatusCode(response.statusCode());
        setCookies(response.getCookies());
        setTime(response.getTime());
        setBody(response.getBody());
        setContentTypes(response.getContentType());
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public JsonNode getBody() {
        return body;
    }

    public void setBody(ResponseBody  responseBody) {
        if(responseBody != null){
            this.body = JsonNodeHelper.createJsonNodeFromString(responseBody.asString());
        }
    }

    public Map<String, String> getCookies() {
        return cookies;
    }

    public void setCookies(Map<String, String> cookies) {
        this.cookies = cookies;
    }

    public String getContentTypes() {
        return contentTypes;
    }

    public void setContentTypes(String contentTypes) {
        this.contentTypes = contentTypes;
    }

    /**
     * Obtiene el codigo de estado de la respuesta HTTP
     *
     * @return El codigo de estado de la respuesta
     */
    public int getStatusCode() {
        return statusCode;
    }
}
