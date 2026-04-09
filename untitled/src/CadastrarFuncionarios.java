import java.lang.String;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;



public class CadastrarFuncionarios {
    String nome;
    String endereco;
    String telefone;
    Date dataAdmissao;
    String cargo;
    double salarioInicial;

    public void cadastrarFunc(Scanner entrada){
        System.out.println("Nome: ");
        nome = entrada.nextLine();
        System.out.println("Endereço: ");
        endereco = entrada.nextLine();
        System.out.println("Telefone: ");
        telefone = entrada.nextLine();
        System.out.println("Data de Admissão: ");
        String data = entrada.nextLine();
        SimpleDateFormat sdfFormat = new SimpleDateFormat(" (dd/MM/yyy): ");
        dataAdmissao = sdfFormat.parse(data);
        System.out.println("Cargo: ");
        cargo = entrada.nextLine();
        System.out.println("Salário inicial: ");
        salarioInicial = entrada.nextDouble();

        


    }

}
