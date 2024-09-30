
package lojadecarros.pi;


public class Funcionario extends Pessoa{
    
    private LoginFuncionario loginfuncionario; //associaçao da classe LoginFuncionario
    private TipoCargo tipocargo; // associação da classe TipoCargo

    public Funcionario(LoginFuncionario loginfuncionario, String nome, String telefone, String CPF) {
        super(nome, telefone, CPF);
        this.loginfuncionario = loginfuncionario;
        
    }

    public Funcionario(LoginFuncionario loginfuncionario, TipoCargo tipocargo, String nome, String telefone, String CPF) {
        super(nome, telefone, CPF);
        this.loginfuncionario = loginfuncionario;
        this.tipocargo = tipocargo;
    }

    public LoginFuncionario getLoginfuncionario() {
        return loginfuncionario;
    }

    public void setLoginfuncionario(LoginFuncionario loginfuncionario) {
        this.loginfuncionario = loginfuncionario;
    }

    public TipoCargo getTipocargo() {
        return tipocargo;
    }

    public void setTipocargo(TipoCargo tipocargo) {
        this.tipocargo = tipocargo;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String getTelefone() {
        return telefone;
    }

    @Override
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String getCPF() {
        return CPF;
    }

    @Override
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    
    //Sera como as informações apareceram na sainda de dados
    @Override
    public String toString (){
        return "Nome: " + nome + "\n" +
        "Telefone: " + telefone + "\n" +
        "CPF: " + CPF + "\n" +
        "Cargo: " + tipocargo.getDescricao() + "\n" +
        "Salario: R$" + tipocargo.getSalario() + "\n" +
        "Comissao: " + tipocargo.getComissao() + "% " + "\n" +        
        "Login: " + loginfuncionario.getLogin() + "\n" +
        "Senha: " + loginfuncionario.getSenha() + "\n";
    }
    
}
