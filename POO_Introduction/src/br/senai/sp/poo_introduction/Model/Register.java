package br.senai.sp.poo_introduction.Model;

import java.util.Scanner;

public class Register {

//    public void Register(){
//
//    }

    public void RegisterProf(){

        /**Instanciar Scanner*/
        Scanner teclado = new Scanner(System.in);

        /**Instanciar Teacher*/
        Teacher objTeacher = new Teacher();

        System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*");
        System.out.print("Hello Teacher, what's your name? ");
        objTeacher.name = teclado.next();
        System.out.print("How old are you? ");
        objTeacher.age = teclado.nextInt();
        System.out.print("What's your email? ");
        objTeacher.email = teclado.next();
        System.out.print("What's your phone number? ");
        objTeacher.phoneNumber = teclado.nextLong();
        System.out.print("What's your specialty? ");
        objTeacher.specialty = teclado.next();
        System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*");

        System.out.println("The name of the teacher is: " + objTeacher.name);
        System.out.println("The age is: " + objTeacher.age);
        System.out.println("The email is: " + objTeacher.email);
        System.out.println("The phone number is: " + objTeacher.phoneNumber);
        System.out.println("The teacher's specialty is: " + objTeacher.specialty);
    }

    public void RegisterStudent(){

        /**Instanciar Scanner*/
        Scanner teclado = new Scanner(System.in);

        /**Instanciar Student*/
        Student objStudent = new Student();

        System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*");
        System.out.print("Hello Student, what's your name? ");
        objStudent.name = teclado.next();
        System.out.print("How old are you? ");
        objStudent.age = teclado.nextInt();
        System.out.print("What's your email? ");
        objStudent.email = teclado.next();
        System.out.print("What's your grade 1? ");
        objStudent.grade1 = teclado.nextInt();
        System.out.print("What's your grade 2? ");
        objStudent.grade2 = teclado.nextInt();
        System.out.print("What's your frequency? ");
        objStudent.frequency = teclado.nextInt();

        System.out.println("The name of the teacher is: " + objStudent.name);
        System.out.println("The age is: " + objStudent.age);
        System.out.println("The email is: " + objStudent.email);
        System.out.println("The phone number is: " + objStudent.grade1);
        System.out.println("The teacher's specialty is: " + objStudent.grade2);
        System.out.println("The teacher's specialty is: " + objStudent.frequency);
    }

    public void BothRegister(){
        RegisterProf();
        RegisterStudent();
    }

}
