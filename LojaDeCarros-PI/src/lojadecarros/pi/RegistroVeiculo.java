
package lojadecarros.pi;

import java.time.LocalDate;


public class RegistroVeiculo extends RegistroCarroVenda{
    private Funcionario funcionario; //associaçao da classe Funcionario 
    private Veiculo veiculo;

    public RegistroVeiculo(Funcionario funcionario, Veiculo veiculo, LocalDate dataRegistro) {
        this.funcionario = funcionario;
        this.dataRegistro = dataRegistro;
        this.veiculo = veiculo;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    @Override
    public LocalDate getDataRegistro() {
        return dataRegistro;
    }

    @Override
    public void setDataRegistro(LocalDate dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

   
}
