/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prueba;

import com.mycompany.examandesinf.logica.LogicaNegocio;
import gui.PantallaPrincipal;
import java.util.Set;

/**
 *
 * @author 34675
 */
public class Pruebas {
    public static void main(String[] args) {
        LogicaNegocio.initialite();
        PantallaPrincipal pantalla=new PantallaPrincipal();
        pantalla.setVisible(true);
    }
}
