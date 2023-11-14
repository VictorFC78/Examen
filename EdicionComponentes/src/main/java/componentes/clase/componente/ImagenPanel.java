/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package componentes.clase.componente;

import java.awt.Graphics;
import java.io.File;
import java.io.Serializable;
import javax.swing.JPanel;

/**
 *
 * @author 34675
 */
public class ImagenPanel extends JPanel implements Serializable {
    
    private File rutaImagen;
    public ImagenPanel(){
        
    }

    public File getRutaImagen() {
        return rutaImagen;
    }

    public void setRutaImagen(File rutaImagen) {
        this.rutaImagen = rutaImagen;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); 
        if (rutaImagen!=null && rutaImagen.exists()){
            
        }
    }
    
}
