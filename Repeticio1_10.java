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
public class Repeticio1_10 {
 public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     int num;int numaleatori=(int)(Math.random()*100)+1;int cont=1;
      int Rang1=1;int Rang2=100;
     
     
     
     System.out.print("Introdueix un número entre 1 i 100: ");
     num=sc.nextInt();
     
     

      while(num>=0 && num<=100){
             
        if(num<Rang1 || num>Rang2){
             
             System.out.println("Esta fora de rang");
             System.out.print("Introdueix un número entre "+Rang1+" i " +Rang2+ " : ");
             num=sc.nextInt();
              
        }else if(numaleatori<num){
                
            cont++;
                System.out.println("El numero secret es menor");    
                Rang2=num-1;
                System.out.print("Introdueix un número entre "+Rang1+" i "+Rang2+" :");
                num=sc.nextInt();
         
         
        }else if(numaleatori==num){
             
                System.out.println("Enhorabona has encertat el número secret en "+cont+" intents.");
                break;

        }else if(numaleatori>num){
            
                cont++;
                System.out.println("El numero secret es major");    
                Rang1=num+1;
                System.out.print("Introdueix un número entre "+Rang1+" i "+Rang2+" :");
                num=sc.nextInt();
         
              
              
          } 
         } 
     
      
      } 
 } 

