/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semaforos;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 34675
 */
public class EscritorPinPanPunSemaforos {
//creamos los semaforos para la coordinacion una para cada escritura
    Semaphore semaforopin=new Semaphore(1);//el primero en escribir
    Semaphore semaforopan=new Semaphore(0);
    Semaphore semaforopun=new Semaphore(0);//el primero en escribir
    public EscritorPinPanPunSemaforos() {
    }
    public void  escribirPin(){
        try {
            semaforopin.acquire();
        } catch (InterruptedException ex) {
        }
        System.out.println("PIN");
        semaforopan.release();
    }
    public void escribirPan(){
        try {
            semaforopan.acquire();
        } catch (InterruptedException ex) {
        }
        semaforopun.release();
        System.out.println("PAN");
    }
    public void escribirPun(){
        try {
            semaforopun.acquire();
        } catch (InterruptedException ex) {
        }
        System.out.println("PUN");
        semaforopin.release();
    }
}
