import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] ags) {
        CadastrarFuncionarios funcionario = new CadastrarFuncionarios();
        CargosComissionais cargoEspecial = new CargosComissionais();

        Scanner entrada = new Scanner(System.in);

        int cargo;
        System.out.println("Cadastro de Funcionários!");
        System.out.println("Escolha conforme menu: ");
        System.out.println("1 para cargo comissionado");
        System.out.println("2 para outros cargos");
        cargo = entrada.nextInt();
        entrada.nextLine();

        if (cargo == 1){
            //Cargo comissionado
            cargoEspecial.cadastrarFunc(entrada);
            cargoEspecial.cadastrarComis(entrada);

            System.out.println("Fucionários Cadastros: ");
            System.out.println("Nome: "+cargoEspecial.nome);
            System.out.println("Endereço: "+cargoEspecial.endereco);
            System.out.println("Telefone:"+cargoEspecial.telefone);
            System.out.println("Data de admissão: "+cargoEspecial.dataAdmissao);
            System.out.println("Caro: "+cargoEspecial.cargo);
            System.out.println("Salário Inicial: "+cargoEspecial.salarioInicial);
            System.out.println("Participação nos Lucros: "+cargoEspecial.partLucros);
            System.out.println("Quantidade de Cotas: "+cargoEspecial.qtdQuotas);

        }else {
            //Cargo normal
            funcionario.cadastrarFunc(entrada);
            System.out.println("Fucionários Cadastros: ");
            System.out.println("Nome: "+funcionario.nome);
            System.out.println("Endereço: "+funcionario.endereco);
            System.out.println("Telefone:"+funcionario.telefone);
            System.out.println("Data de admissão: "+funcionario.dataAdmissao);
            System.out.println("Caro: "+funcionario.cargo);
            System.out.println("Salário Inicial: "+funcionario.salarioInicial);


        }

    }
}