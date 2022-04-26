package dio.me.model;

public abstract class FuncionarioCLT {
    //atributos
    protected static  String nome;
    protected static  String documento;
    protected static double valorSalario;
    protected static Endereco endereco;

    public FuncionarioCLT(String nome, String documento, double valorSalario, Endereco endereco) {
        FuncionarioCLT.nome = nome;
        FuncionarioCLT.documento = documento;
        FuncionarioCLT.valorSalario = valorSalario;
        FuncionarioCLT.endereco = endereco;

    }

    public FuncionarioCLT() {
    }

    public String getNome() {
        return nome;
    }

    public static void setNome(String nome) {
        FuncionarioCLT.nome = nome;
    }

    public String getDocumento() {
        return documento;
    }

    public static void setDocumento(String documento) {
        FuncionarioCLT.documento = documento;
    }

    public double getValorSalario() {
        return valorSalario;
    }

    public static void setValorSalario(double valorSalario) {
        FuncionarioCLT.valorSalario = valorSalario;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public static void setEndereco(Endereco endereco) {
        FuncionarioCLT.endereco = endereco;
    }

    @Override
    public String toString() {
        return "FuncionarioCLT{" +
                "nome='" + nome + '\'' +
                ", documento='" + documento + '\'' +
                ", valorSalario=" + valorSalario +
                ", endereco=" + endereco +
                '}';
    }
}
