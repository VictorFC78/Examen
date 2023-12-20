/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semaforos;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 34675
 */
public class EscribirPinPanPunSyncro {
private int contador;
    public EscribirPinPanPunSyncro() {
        contador=0;
    }
    public synchronized void escribirPin(){
        while(contador!=0){
            try {
                wait();
            } catch (InterruptedException ex) {
            }
        }
        System.out.println("PIN");
        contador++;
        notifyAll();
    }
    public synchronized void escribirPan(){
        while(contador!=1){
            try {
                wait();
            } catch (InterruptedException ex) {
            }
        }
        contador++;
        System.out.println("PAN");
        notifyAll();
    }
    public synchronized void escribirPun(){
        while(contador!=2){
            try {
                wait();
            } catch (InterruptedException ex) {
            }
        }
        contador=0;
        System.out.println("PUN");
        notifyAll();
    }
}
