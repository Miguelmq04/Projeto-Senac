
package lojadecarros.pi;


public class Cliente extends Pessoa{
    
    public Cliente(String nome, String telefone, String CPF) {
        super(nome, telefone, CPF);
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
    
    @Override
    public String toString (){
        return "Nome: " + nome + "\n" +
        "Telefone: " + telefone + "\n" +
        "CPF: " + CPF + "\n";
    }
    
}
