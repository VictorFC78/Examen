
package componentes.clases.base;

import java.awt.Color;
import java.io.Serializable;


public class DosColores implements Serializable{
    private Color colorFondo;
    private Color colorTexto;
    public DosColores(Color colorFondo,Color colorTexto){
        this.colorFondo=colorFondo;
        this.colorTexto=colorTexto;
        
    }

    public Color getColorFondo() {
        return colorFondo;
    }

    public Color getColorTexto() {
        return colorTexto;
    }

    public void setColorFondo(Color colorFondo) {
        this.colorFondo = colorFondo;
    }

    public void setColorTexto(Color colorTexto) {
        this.colorTexto = colorTexto;
    }
    
}
