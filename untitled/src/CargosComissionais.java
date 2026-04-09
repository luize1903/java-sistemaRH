import java.util.Scanner;

public class CargosComissionais extends CadastrarFuncionarios{
    double partLucros;
    double qtdQuotas;

    public void cadastrarComis(Scanner entrada){
        System.out.println("Participação nos Lucros(%): ");
        partLucros = entrada.nextDouble();
        System.out.println("Quantidade de quotas: ");
        qtdQuotas = entrada.nextDouble();

    }

}
