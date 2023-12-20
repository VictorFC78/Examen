/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semaforos;

/**
 *
 * @author 34675
 */
public class HiloPan implements Runnable {
    private EscribirPinPanPunSyncro escritor;

    public HiloPan(EscribirPinPanPunSyncro escritor) {
        this.escritor = escritor;
    }

    @Override
    public void run() {
        for(int i=0;i<10;i++){
            escritor.escribirPan();
        }
    }
    
}
