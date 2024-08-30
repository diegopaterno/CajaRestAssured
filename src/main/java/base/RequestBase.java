package base;

import enums.RequestHeaders;
import enums.RequestMethods;

import java.util.HashMap;

public class RequestBase {
    private String host;
    private String protocol;
    private RequestMethods method;
    private String path;
    private HashMap<String, String> formData;
    private HashMap<String, String> headers;
    public RequestBase(String url, RequestMethods method) {
        setBaseUrl(url);
        setMethod(method);
        this.headers = new HashMap<>();
        this.formData = new HashMap<>();
    }
    private void setBaseUrl(String url){
        if (!(url.split("://").length == 2)){
            throw new IllegalArgumentException("Invalid URL");
        }
        String[] parts = url.split("://");
        this.protocol = parts[0];
        this.host = parts[1];
    }

    public void setHeaders(HashMap<RequestHeaders, String> headers){
        headers.forEach((header, value ) -> this.headers.put(header.getDescription(), value));
    }
    public void setHeaders(RequestHeaders header, String value){
        this.headers.put(header.getDescription(), value);
    }

    public HashMap<String, String> getHeaders(){
        return headers;
    }

    public HashMap<String, String> getFormData() {
        return formData;
    }
    private void setMethod(RequestMethods method){this.method = method;}

    public RequestMethods getMethod() {
        return method;
    }


    public void setFormData(HashMap<String, String> formData){
        this.formData = formData;
    }
    public void setFormData(String key, String value){
        this.formData.put(key, value);
    }
    public String getUrl(){
        return String.format("%s://%s", this.protocol, this.host);
    }
    public String getPath(){return path;}

}
