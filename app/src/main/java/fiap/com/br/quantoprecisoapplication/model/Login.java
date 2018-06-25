package fiap.com.br.quantoprecisoapplication.model;

import java.io.Serializable;

public class Login implements Serializable {
    private String rm;
    private String password;

    public Login() {

    }

    public String getRm() {
        return rm;
    }

    public void setRm(String rm) {
        this.rm = rm;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
