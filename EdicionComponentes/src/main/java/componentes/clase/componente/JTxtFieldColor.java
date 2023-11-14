
package componentes.clase.componente;

import componentes.clases.base.DosColores;
import java.awt.Color;
import java.io.Serializable;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;



public class JTxtFieldColor extends JTextField implements Serializable {
    private String formato;

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    
     public JTxtFieldColor(){
         super();
         /*Document es elque regristra los cambios que se producen en un JtextField,para saber cuando se produce un cambio en
         el JtxtField tenemos que recuperar el Document asociaado a nuestro JTxtField mediante super.getDocument(),una vez
         los tenemos tenemos que añadirle un escuchador de eventos de cambio de estado del Document mediante 
         addDocumentListener(DocumentListenet),el parametro de DocumentLIstener lo hacemos mediante una clase anonima
         y sobreescribimos los metodos de la interface para realizar los cambios que deseamos en el JTxTField
         */
         super.getDocument().addDocumentListener(new DocumentListener(){

             @Override
             public void insertUpdate(DocumentEvent e) {
                 realizarCambios();
             }

             @Override
             public void removeUpdate(DocumentEvent e) {
                 realizarCambios();
             }

             @Override
             public void changedUpdate(DocumentEvent e) {
                 realizarCambios();
             }

             private void realizarCambios() {
                 if(!getText().matches(formato)){
                     setBackground(Color.red);
                 }else{
                     setBackground(Color.green);   
                }
             }
         });
     }
}
