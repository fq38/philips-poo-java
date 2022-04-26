package dio.me.model;

public class Gerente extends FuncionarioPJ implements calculaBonificacao {
    private  double valorBonificacao;

    @Override
    public void calculaBonificacao(double porcentagemBonificacao) {
        this.valorBonificacao = (super.getValorRemuneracao() * (porcentagemBonificacao/100) + 100d);

    }

    @Override
    public String toString() {
        return "Gerente{" +
                "nome='" + super.getNome() + '\'' +
                ", documento='" + super.getDocumento() + '\'' +
                ", endereco=" + super.getEndereco().getBairro() +
                ", horasTrabalhadas=" + super.getHorasTrabalhadas() +
                ", valorHora=" + super.getValorHora() +
                ", valorRemuneracao=" + super.getValorRemuneracao() +
                ", valorBonificacao=" + this.valorBonificacao +
                '}';
    }



}
