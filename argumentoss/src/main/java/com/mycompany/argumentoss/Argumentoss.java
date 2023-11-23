/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.argumentoss;

/**
 *
 * @author Usuario
 */
public class Argumentoss {

    public static void main(String[] args) {
        
        String argumento1;
        String argumento2;
        
        argumento1 = args[0];
       // argumento2 = args[1];
        
        System.out.println("Argumento 1: "+ argumento1);
      //  System.out.println("Argumento 2: "+ argumento2);
        
        switch(argumento1){
            case "1":{
                System.out.println("Idioma Español");
                break;
            }
            case "2":{
                System.out.println("Hi! I'm Sandra");
                break;
            }
            default:{
                System.out.println("Argumento incorrecto");
            }
        }
    }
}
