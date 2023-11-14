
package componentes.clases.base;

import java.io.File;
import java.io.Serializable;

/**
clase base para objeto de utilizacion en otra clase para crear componente propio
 */
public class ImagenFondo implements Serializable {
    private File rutaImagen;
    private float opacidad;

    public ImagenFondo(File rutaImagen, float opacidad) {
        this.rutaImagen = rutaImagen;
        this.opacidad = opacidad;
    }

    public File getRutaImagen() {
        return rutaImagen;
    }

    public void setRutaImagen(File rutaImagen) {
        this.rutaImagen = rutaImagen;
    }

    public float getOpacidad() {
        return opacidad;
    }

    public void setOpacidad(float opacidad) {
        this.opacidad = opacidad;
    }
    
}
