package reports;

import io.qameta.allure.Attachment;
import base.RequestBase;
import io.restassured.response.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static java.lang.String.join;
import static java.lang.String.valueOf;
import static org.apache.commons.lang3.StringUtils.remove;

/**
 * La clase AllureReport proporciona métodos para adjuntar información a los reportes de Allure
 * Implementaciones:
 *  - Adjuntar información de solicitudes y respuestas HTTP a los informes de Allure.
 */
public class AllureReport {

    private static final Logger logger = LoggerFactory.getLogger(AllureReport.class);

    /**
     * Adjunta la información de la solicitud HTTP a los informes de Allure.
     *
     * @param requestBase La instancia de RequestBase que contiene los detalles de la solicitud.
     */
    public static void attachRequestFile(RequestBase requestBase) {
        String requestBaseUri = requestBase.getUrl();
       // String queryParamsString = requestBase.getQueryParams() != null ? buildQueryParamsString(requestBase.getQueryParams()) : new String();
        String pathString = requestBase.getPath();
       // String fullUrl = String.format("%s%s%s", requestBaseUri, queryParamsString, pathString);
       // String body = buildBodyString(requestBase);
       // attachFile("request", String.format("\nRequest: %s %s", fullUrl, body));
    }

    /**
     * Adjunta la información de la respuesta HTTP a los informes de Allure.
     *
     * @param response La respuesta HTTP de la cual se extraen los detalles.
     */
    public static void attachResponseFile(Response response) {
        String responseString = buildResponseString(response);
        attachFile("response", responseString);
    }

    /**
     * Construye una cadena con los detalles de la respuesta HTTP.
     *
     * @param response La respuesta HTTP de la cual se extraen los detalles.
     * @return Una cadena que representa los detalles de la respuesta.
     */
    private static String buildResponseString(Response response) {
        return String.format("Headers: %s\nCookies: %s\nBody: %s\nResponse Time: %s",
                response.getHeaders(), response.getCookies(), response.prettyPrint(), response.time());
    }

    /**
     * Construye una cadena con los detalles del cuerpo de la solicitud HTTP.
     *
     * @param requestBase La instancia de RequestBase que contiene los detalles de la solicitud.
     * @return Una cadena que representa el cuerpo de la solicitud.
     */
//    private static String buildBodyString(RequestBase requestBase) {
//        return requestBase.getBody() != null
//                ? String.format("\nBody: %s", requestBase.getBody().toPrettyString())
//                : new String();
//    }

    /**
     * Construye una cadena con los parámetros de consulta de la solicitud HTTP.
     *
     * @param queryParams Un mapa con los parámetros de consulta.
     * @return Una cadena que representa los parámetros de consulta.
     */
    private static String buildQueryParamsString(HashMap<String, Object> queryParams) {
        List<String> params = new ArrayList<>();
        queryParams.forEach((paramName, paramValue) -> params.add(paramValue + "=" + remove(remove(valueOf(paramValue), "["), "]")));
        return String.format("?%s", join("&", params));
    }

    /**
     * Adjunta un archivo al informe de Allure.
     *
     * @param name El nombre del archivo adjunto.
     * @param data Los datos a adjuntar.
     * @return Los datos adjuntos.
     */
    @Attachment(value = "{name}", type = "text/plain")
    public static String attachFile(String name, String data) {
        return data;
    }

}
