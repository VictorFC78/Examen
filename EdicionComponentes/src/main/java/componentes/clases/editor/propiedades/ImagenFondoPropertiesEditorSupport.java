/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package componentes.clases.editor.propiedades;

import componente.clases.editor.ImagenFondoJpanel;
import componentes.clases.base.ImagenFondo;
import java.awt.Component;
import java.beans.PropertyEditorSupport;

/**
esta es la clase que nos va a generar en editor de propiedades dentro de nuestro componente
* personalizado, ha de sobreescribir al menos 4 metodos
* supportsCustomEditor que indica que soporta un editor
* getCustomEditor recupera el editor
* getJavaInitializationString() el mas importante es el encargado de inicalizar el editor, mostrarlo cuando lo invocamos
* getValue nos devuelve el valor que se elige en el editor
 */
public class ImagenFondoPropertiesEditorSupport extends PropertyEditorSupport {
    //creamos un panel para devolverlo mediante el metodo getCustonEditor
    private ImagenFondoJpanel imagenFondoJpanel=new ImagenFondoJpanel();
            
    @Override
    public boolean supportsCustomEditor() {
        return true;//es decir si soporta un editor personalizado
    }

    @Override
    public Component getCustomEditor() {//devuelve una copia del editor de propiedades personalizado
        return imagenFondoJpanel; 
    }
    /*
    para este metodo antes de nada tenemos que crear un beaninfo de nuestro componente para poder enlazar
    este metodo para poder enlazar el editor con el componente, el editor del beaninfo se busca objeto 
    es decir las propiedades elegidas FOndoImagen y clase de editor de proipiedades y asociarlos con
    esta clase poniendo la ruta entera, es decir paquete en el que se encuentra
    lo que tiene que devolver exaactamente es la inicializacion de la propiedades que se han elegido en el
    editor persinalizado, es dedie el objeto que nos devuelve el editor de propiedades,mediante un string se crea e inicializa di
    dicho componente, para ser correcto tiene que incluir los paquetes de la clases que componen el objeto ya que ala ser
    un string no reliza ningun import, si no pusieramos el paquete al inicializar la propiedad no encontaria la clase
    */
    @Override
    public String getJavaInitializationString() {
        ImagenFondo imagenFondo=imagenFondoJpanel.getSelectedValue();
        return "new componentes.clases.base.ImagenFondo( "+"new java.io.File(\""+imagenFondo.getRutaImagen().getAbsolutePath().replace("\\", "\\\\")+"\"),"+imagenFondo.getOpacidad()+"f)";
    }

    @Override
    public Object getValue() {//devuelve las propiedades que sean seleccionado en el editor
        return imagenFondoJpanel.getSelectedValue(); 
    }
    
    
}
