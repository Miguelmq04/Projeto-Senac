
package lojadecarros.pi;


public class Cargo {
    private Funcionario funcionario; //associaçao da classe Funcionario
    private TipoCargo tipocargo; //associaçao da classe TipoCargo

    public Cargo(Funcionario funcionario, TipoCargo tipocargo) {
        this.funcionario = funcionario;
        this.tipocargo = tipocargo;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public TipoCargo getTipocargo() {
        return tipocargo;
    }

    public void setTipocargo(TipoCargo tipocargo) {
        this.tipocargo = tipocargo;
    }
}
