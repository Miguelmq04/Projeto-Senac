
package lojadecarros.pi;


public class LoginFuncionario {
    private String Login;
    private String senha;

    public LoginFuncionario(String Login, String senha) {
        this.Login = Login;
        this.senha = senha;
    }

    public String getLogin() {
        return Login;
    }

    public void setLogin(String Login) {
        this.Login = Login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
}
