
package lojadecarros.pi;



import java.time.Year;



public class Veiculo {
    private String marcaVeiculo;
    private String modeloVeiculo;
    private String corVeiculo;
    private String cambioVeiculo;
    private Year anoVeiculo;
    private String acessorio;
    private float quilometragem;
    private String condicaoVeiculo;
    private String statusManutencao;
    private float precoVeiculo;
    private String garantia;
    private Funcionario funcionario;
    private RegistroVeiculo registroveiculo;

    public Veiculo(String marcaVeiculo, String modeloVeiculo, String corVeiculo, String cambioVeiculo, Year anoVeiculo, String acessorio, float quilometragem, String condicaoVeiculo, String statusManutencao, float precoVeiculo, String garantia, Funcionario funcionario, RegistroVeiculo registroveiculo) {
        this.marcaVeiculo = marcaVeiculo;
        this.modeloVeiculo = modeloVeiculo;
        this.corVeiculo = corVeiculo;
        this.cambioVeiculo = cambioVeiculo;
        this.anoVeiculo = anoVeiculo;
        this.acessorio = acessorio;
        this.quilometragem = quilometragem;
        this.condicaoVeiculo = condicaoVeiculo;
        this.statusManutencao = statusManutencao;
        this.precoVeiculo = precoVeiculo;
        this.garantia = garantia;
        this.funcionario = funcionario;
        this.registroveiculo = registroveiculo;
    }

    public String getMarcaVeiculo() {
        return marcaVeiculo;
    }

    public void setMarcaVeiculo(String marcaVeiculo) {
        this.marcaVeiculo = marcaVeiculo;
    }

    public String getModeloVeiculo() {
        return modeloVeiculo;
    }

    public void setModeloVeiculo(String modeloVeiculo) {
        this.modeloVeiculo = modeloVeiculo;
    }

    public String getCorVeiculo() {
        return corVeiculo;
    }

    public void setCorVeiculo(String corVeiculo) {
        this.corVeiculo = corVeiculo;
    }

    public String getCambioVeiculo() {
        return cambioVeiculo;
    }

    public void setCambioVeiculo(String cambioVeiculo) {
        this.cambioVeiculo = cambioVeiculo;
    }

    public Year getAnoVeiculo() {
        return anoVeiculo;
    }

    public void setAnoVeiculo(Year anoVeiculo) {
        this.anoVeiculo = anoVeiculo;
    }

    public String getAcessorio() {
        return acessorio;
    }

    public void setAcessorio(String acessorio) {
        this.acessorio = acessorio;
    }

    public float getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(float quilometragem) {
        this.quilometragem = quilometragem;
    }

    public String getCondicaoVeiculo() {
        return condicaoVeiculo;
    }

    public void setCondicaoVeiculo(String condicaoVeiculo) {
        this.condicaoVeiculo = condicaoVeiculo;
    }

    public String getStatusManutencao() {
        return statusManutencao;
    }

    public void setStatusManutencao(String statusManutencao) {
        this.statusManutencao = statusManutencao;
    }

    public float getPrecoVeiculo() {
        return precoVeiculo;
    }

    public void setPrecoVeiculo(float precoVeiculo) {
        this.precoVeiculo = precoVeiculo;
    }

    public String getGarantia() {
        return garantia;
    }

    public void setGarantia(String garantia) {
        this.garantia = garantia;
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
  

   
    
    @Override
    public String toString(){
        return  "Marca: " + marcaVeiculo + "\n" +
                "Modelo: " + modeloVeiculo + "\n" +
                "Cor: " + corVeiculo + "\n" +
                "Câmbio: " + cambioVeiculo + "\n" +
                "Ano: " + anoVeiculo + "\n" +
                "Acessórios: " + acessorio + "\n" +
                "Quilometragem: " + quilometragem + "Km" + "\n" +
                "condição: " + condicaoVeiculo + "\n" +
                "Status da manutenção: " + statusManutencao + "\n" +
                "Preço: R$" + precoVeiculo + "\n" +
                "Garantia: " + garantia + "\n" +
                "Cadastro do veículo feito por " + funcionario.getNome() + "\n" +
                "Data do registro: " + registroveiculo.getDataRegistro() + "\n";
                
                
    }
}
