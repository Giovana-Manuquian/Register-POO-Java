import java.util.Scanner;
import Model.Register;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Register objRegister = new Register();

        int opcao = 0;
        boolean opcaoValida = false;

        while (!opcaoValida) {
            System.out.println("Digite a opção que deseja fazer o cadastro:\n" +
                    "1 - Cadastro de Professores\n" +
                    "2 - Cadastro de Alunos\n" +
                    "3 - Cadastrar Ambos\n" +
                    "Opção: ");
            opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                    objRegister.RegisterProf();
                    opcaoValida = true;
                    break;
                case 2:
                    objRegister.RegisterStudent();
                    opcaoValida = true;
                    break;
                case 3:
                    objRegister.BothRegister();
                    opcaoValida = true;
                    break;
                default:
                    System.out.println("Opção inválida. Digite uma opção válida.");
                    break;
            }
        }
    }
}
