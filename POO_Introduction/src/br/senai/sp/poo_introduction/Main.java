package br.senai.sp.poo_introduction;

import br.senai.sp.poo_introduction.Model.Register;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /**Instancia Scanner*/
        Scanner teclado = new Scanner(System.in);

        /**Instancia Register*/
        Register objRegister = new Register();

        int opcao = 0;

        System.out.println("Digite a opção que deseja fazer o cadastro? \n" +
                "1 - Cadastro de Professores \n" +
                "2 - Cadastro de Alunos \n" +
                "3 - Cadasrtrar Ambos \n" +
                "Opção: "
                );
        opcao = teclado.nextInt();


        if (opcao==1){
            objRegister.RegisterProf();
        }else if(opcao==2) {
            objRegister.RegisterStudent();
        } else if (opcao==3) {
            objRegister.BothRegister();
        } else {
            System.out.println("Digite uma opção válida");
        }

    }

}
