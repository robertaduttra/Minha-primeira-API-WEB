package dio.web.api.handler;

import java.util.Date;

public class ResponseError {

    private Date timestamp = new Date();
    private String status = "error";
    private int statusCode = 400;
    private String error;

    // timestamp momento exato da geração da exceção
    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    // status campo customizado de acordo com o dominio do negocio
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // dicionario de erro da apolicação
    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    // mensagem de erro apresentada ao usuario.
    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
