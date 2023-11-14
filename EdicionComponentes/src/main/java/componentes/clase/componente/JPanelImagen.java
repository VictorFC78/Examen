
package componentes.clase.componente;

import componentes.clases.base.ImagenFondo;
import java.awt.AlphaComposite;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.io.File;
import java.io.Serializable;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author 34675
 */
public class JPanelImagen extends JPanel implements Serializable{
    //private ImagenFondo fondoImagen;
    private ImagenFondo imagenFondo;
    public JPanelImagen(){
        
    }

    public ImagenFondo getImagenFondo() {
        return imagenFondo;
    }

    public void setImagenFondo(ImagenFondo imagenFondo) {
        this.imagenFondo = imagenFondo;
    }
    

    @Override//metodo para pintar el archivo en el panel
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); 
        //para no crear un fallo comprobamos que el archivo existe y hay imagen, y pintamos imagen
        if (imagenFondo!=null && imagenFondo.getRutaImagen().exists() && imagenFondo.getRutaImagen() != null ){
            //creamos una imagen con la ruta que tenemos en el objeto imagen fondo
            ImageIcon imagen= new ImageIcon(imagenFondo.getRutaImagen().getAbsolutePath());
            g.drawImage(imagen.getImage(), 0, 0, null);
            Graphics2D g2d = (Graphics2D) g;
            g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER,
            imagenFondo.getOpacidad()));
            g.drawImage(imagen.getImage(), 0, 0, null);g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1));
        
        }
    }
    
}
