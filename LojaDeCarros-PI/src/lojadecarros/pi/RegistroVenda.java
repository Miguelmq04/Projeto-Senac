
package lojadecarros.pi;

import java.time.LocalDate;


public class RegistroVenda extends RegistroCarroVenda{
     private Funcionario funcionario; // associaçao da classe Funcionario
     private RegistroVeiculo registroveiculo; // associação da classe RegistroVeiculo
     private Veiculo veiculo;
     private Cliente cliente;

    public RegistroVenda(Funcionario funcionario, RegistroVeiculo registroveiculo, Veiculo veiculo, Cliente cliente, LocalDate dataRegistro) {
        this.funcionario = funcionario;
        this.registroveiculo = registroveiculo;
        this.veiculo = veiculo;
        this.cliente = cliente;
        this.dataRegistro = dataRegistro;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public RegistroVeiculo getRegistroveiculo() {
        return registroveiculo;
    }

    public void setRegistroveiculo(RegistroVeiculo registroveiculo) {
        this.registroveiculo = registroveiculo;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

     @Override
    public LocalDate getDataRegistro() {
        return dataRegistro;
    }

     @Override
    public void setDataRegistro(LocalDate dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

    @Override
    public String toString(){
        return  "Marca: " + veiculo.getMarcaVeiculo() + "\n" +
                "Modelo: " + veiculo.getModeloVeiculo() + "\n" +
                "Cor: " + veiculo.getCorVeiculo() + "\n" +
                "Câmbio: " + veiculo.getCambioVeiculo() + "\n" +
                "Ano: " + veiculo.getAnoVeiculo() + "\n" +
                "Acessórios: " + veiculo.getAcessorio() + "\n" +
                "Quilometragem: " + veiculo.getQuilometragem() + "Km" + "\n" +
                "condição: " + veiculo.getCondicaoVeiculo() + "\n" +
                "Status da manutenção: " + veiculo.getStatusManutencao() + "\n" +
                "Preço: R$" + veiculo.getPrecoVeiculo() + "\n" +
                "Garantia: " + veiculo.getGarantia() + "\n" +
                "Cadastro do veículo feito por " + funcionario.getNome() + "\n" +
                "Data do registro do veículo: " + registroveiculo.getDataRegistro() + "\n" +
                "compra realizada por " + cliente.getNome() + "\n" +
                "Venda realizada por " + funcionario.getNome() + "\n" +
                "Data da venda: " + dataRegistro + "\n";
                
                
    }
   
}
