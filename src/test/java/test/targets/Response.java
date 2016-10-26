package test.targets;

public class Response {

    private final String code;
    private final String data;

    public Response(String code, String data) {
        this.code = code;
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public String getData() {
        return data;
    }
}
