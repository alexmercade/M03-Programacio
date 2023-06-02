/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.estructuresrepeticio1;

/**
 *
 * @author Alex
 */
import java.util.Scanner;
public class Repeticio1_9 {
    public static void main(String[] args) {
       int num;int cont=0;int num2;
       Scanner sc=new Scanner(System.in);
        System.out.print("Introdueix N: ");
        num=sc.nextInt();
        long resultat=num;
        num2=num;    
       
        while(cont<10){
        num=num2+num;
        resultat*=num;
        cont++;
        }
       
       
        System.out.println(resultat);
       
   
   
}
}