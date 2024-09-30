
package lojadecarros.pi;


public class TipoCargo {
    private String descricao;
    private float salario;
    private float comissao;

    public TipoCargo(String descricao, float salario, float comissao) {
        this.descricao = descricao;
        this.salario = salario;
        this.comissao = comissao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float getComissao() {
        return comissao;
    }

    public void setComissao(float comissao) {
        this.comissao = comissao;
    }
}
