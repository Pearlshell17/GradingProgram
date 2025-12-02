/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gradingprogram;

/**
 *
 * @author 40195067
 */
import java.util. Scanner;
        
public class GradingProgram {

    public static void main(String[] args) {
        
        Scanner grade = new Scanner (System.in);
        int x;
       
        System.out.println("Enter the grade scored in programming class (0-100): ");
        x = grade.nextInt();
        
        if (x == 100){
            System.out.println("the user has got a perfect score.");
        }
        else if( x >= 90 && x <= 100 ){
            System.out.println("the user has scored a grade A.");
        }
        else if( x >= 0 && x <= 59 ){
            System.out.println("the user has scored a grade F.");
        }
        else if  ( x >= 60 && x <= 69 ){
            System.out.println("the user has scored a grade D.");
        }
        else if( x >= 70 && x <= 79 ){
            System.out.println("the user has scored a grade C.");
        }
        else if ( x >= 80 && x <= 89 ){
            System.out.println("the user has scored a grade B.");
        }
}
}
