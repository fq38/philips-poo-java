package dio.me.model;

import dio.me.model.Endereco;
import dio.me.model.Gerente;
import dio.me.model.OperadorDeCaixa;
import dio.me.model.Vendedor;

import static dio.me.model.FuncionarioCLT.*;

public class Main {
    public static void main(String[] args) {
        /*Endereco endereco = new Endereco();
        endereco.setRua("endereço da rua");
        System.out.println(endereco.getRua());*/

        Endereco endereco1 =
                new Endereco("Rua funcionário",
                        "Complemento endereço funcionário","bairro funcionário");
        System.out.println(endereco1);
        System.out.println("-----");

        Vendedor vendedor = new Vendedor();
        Vendedor.setNome("cameila vendededor");
        Vendedor.setDocumento("123.456.789-00");
        Vendedor.setValorSalario(1000d);
        vendedor.calculaBonificacao(2d);
        Vendedor.setEndereco(endereco1);
        System.out.println(vendedor);
        System.out.println("____");

        OperadorDeCaixa operadorCaixa =
                new OperadorDeCaixa("Camila Op Caixa",
                        "789.456.123-00",
                        2000d, endereco);
        System.out.println(operadorCaixa);
        System.out.println("-----");

        Gerente gerente = new Gerente();
        gerente.setNome("Camila Gerente");
        gerente.setDocumento("456.123.789-00");
        gerente.setEndereco(endereco);
        gerente.setHorasTrabalhadas(20);
        gerente.setValorHora(100d);
        gerente.calculaRemuneracao();
        gerente.calculaBonificacao(3d);
        System.out.println(gerente);

    }
}
