package br.senai.sp.poo_introduction.Model;

import java.util.Scanner;

public class Register {

    /** Declara Flag */
    boolean flag = true;

    /** Instance Scanner */
    Scanner teclado = new Scanner(System.in);

    /** Instance Output */
    Output objOutput = new Output();


    public void BothRegister(){
        flag = false;
        RegisterAluno();
        RegisterProf();
    }

    public void RegisterProf (){


        /** Instance Teacher */
        Teacher objTeacher = new Teacher(); // Vitor

        System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");
        System.out.println("Hello Teacher, What is your name: ");
        objTeacher.name = teclado.next();
        System.out.println("How old are you: ");
        objTeacher.age = teclado.nextInt();
        System.out.println("What is your email: ");
        objTeacher.email = teclado.next();
        System.out.println("What is your phone number: ");
        objTeacher.phoneNumber = teclado.nextInt();
        System.out.println("What is you specialist: ");
        objTeacher.specialist = teclado.next();
        System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");

        if (flag) {
            objOutput.PrintTeacher(objTeacher);
        }
    }

    public void RegisterAluno(){
        /** Instance Student */
        Student objStudent = new Student();

        System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");
        System.out.println("Hello Student, What is your name: ");
        objStudent.name = teclado.next();
        System.out.println("How old are you: ");
        objStudent.age = teclado.nextInt();
        System.out.println("What is your email: ");
        objStudent.email = teclado.next();
        System.out.println("What is your grade1: ");
        objStudent.grade1 = teclado.nextInt();
        System.out.println("What is your grade2: ");
        objStudent.grade2 = teclado.nextInt();
        System.out.println("What is you frequency: ");
        objStudent.frequency = teclado.nextInt();
        System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");

        objOutput.PrintStudent(objStudent);

    }



}
