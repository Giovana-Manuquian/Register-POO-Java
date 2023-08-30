package br.senai.sp.poo_introduction.Model;

public class Output {

    public void PrintTeacher(Teacher objTeacher){


        /** Print Information */

        System.out.println("Teacher's name is: " + objTeacher.name );
        System.out.println("Your age is: " + objTeacher.age);
        System.out.println("Your email: " + objTeacher.email);
        System.out.println("Your WhatsApp: " + objTeacher.phoneNumber);
        System.out.println("Your Specialist: " + objTeacher.specialist);
    }

    public void PrintStudent(Student objStudent){

        /** Print Information */

        System.out.println("Student's name is: " + objStudent.name );
        System.out.println("Your age is: " + objStudent.age);
        System.out.println("Your email: " + objStudent.email);
        System.out.println("Your Grade 1 and Grade 2: " + objStudent.grade1 + ", " + objStudent.grade2);
        System.out.println("Your Frequency: " + objStudent.frequency);
    }


}
