/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.procesos;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 34675
 */
public class SonPrimos {
    public static void main(String[] args) {
        String nombreClase=EsPrimo.class.getName();
        for (int i=0;i<args.length;i++){
            ProcessBuilder process=new ProcessBuilder("java",nombreClase);//crea el proceso que inicia la clase
            process.directory(new File("/target/classes/com/mycompany/procesos"));//directorio ejecucion donde esta .class
            try {
                Process proceso=process.start();//iniciael procesp
                enviarDatosHijo(args[i], proceso.getOutputStream());
                recicirDatoHijo(proceso.getInputStream(), System.out);
                recicirDatoHijo(proceso.getErrorStream(), System.err);
            } catch (IOException ex) {
            }
        }
    }
    private static void  enviarDatosHijo(String dato,OutputStream out){
        try (PrintWriter prw = new PrintWriter(out)) {
            prw.print(dato);
        }
        
    }
    private static void recicirDatoHijo(InputStream input,PrintStream pst){
        
        try (BufferedReader brf = new BufferedReader(new InputStreamReader(input))) {
            String dato;
            while((dato=brf.readLine())!=null){
                pst.println(dato);
            }
        } catch (IOException ex) {
        }
    }
}
