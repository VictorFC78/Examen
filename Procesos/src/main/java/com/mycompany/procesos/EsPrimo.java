/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.procesos;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author 34675
 */
public class EsPrimo {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int valor=0;
        try {
            valor=sc.nextInt();
            if(esPrimo(valor))System.out.println("1");
            else System.out.println("0");
            sc.close();
        } catch (InputMismatchException e) {
            System.err.println("No es un numero");
            sc.close();
        }
        
    }

    private static boolean esPrimo(int valor) {
        if(valor>1){
            int hasta = (int) Math.sqrt(valor);
            for (int i = 2; i <= hasta; i++) {
                if (valor % i == 0)
                    return false;
            }
            return true;
        }else return false;
    }
    
}
