package dio.me.model;

public class Vendedor extends FuncionarioCLT implements calculaBonificacao {
    private  double valorDaBonificacao;

    @Override
    public void calculaBonificacao(double porcentagemBonificacao) {
    this.valorDaBonificacao = super.valorSalario * (porcentagemBonificacao/100d);
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "valorDaBonificacao=" + valorDaBonificacao +
                ", nome='" + nome + '\'' +
                ", documento='" + documento + '\'' +
                ", valorSalario=" + valorSalario +
                ", endereco=" + endereco.getRua() +
                '}';
    }


}
