package enums;

public enum RequestHeaders {
    AUTHORIZATION("Authorization"),
    CONTENT_TYPE("Content-Type");

    private final String description;

    RequestHeaders(String description){
        this.description=description;
    }
    public String getDescription(){
        return description;
    }
}
