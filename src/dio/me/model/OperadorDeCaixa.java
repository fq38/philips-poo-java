package dio.me.model;

public class OperadorDeCaixa extends FuncionarioCLT {
    private double quebraDeCaixa;

    public OperadorDeCaixa(String nome, String documento, Double valorSalario, Endereco endereco){
        super(nome, documento, valorSalario, endereco);

    }

    @Override
    public String toString() {
        return "OperadorDeCaixa{" +
                "nome='" + nome + '\'' +
                ", documento='" + documento + '\'' +
                ", valorSalario=" + valorSalario +
                ", endereco=" + endereco.getBairro() +
                '}';
    }
}
