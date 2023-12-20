/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semaforos;

/**
 *
 * @author 34675
 */
public class PrincipalPinPanPunSynchro {
    public static void main(String[] args) {
        EscribirPinPanPunSyncro escritor=new EscribirPinPanPunSyncro();
        HiloPin hiloPin=new HiloPin(escritor);
        Thread hiloPan=new Thread(new HiloPan(escritor));
        Thread hiloPun=new Thread(()->{
            for (int i=0;i<10;i++){
                escritor.escribirPun();
            }
        });
        hiloPun.start();
        hiloPin.start();
        hiloPan.start();
    }
}
