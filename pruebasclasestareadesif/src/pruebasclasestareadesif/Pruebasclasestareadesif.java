
package pruebasclasestareadesif;

import java.util.Calendar;
import java.util.Date;

public class Pruebasclasestareadesif {

  
    public static void main(String[] args) {
        
     //devuelve el dia de la semana en un entero que va 1 domingo a sabaso 7
       Calendar c=Calendar.getInstance();
       c.set(2023,Calendar.NOVEMBER, 3);
       int i=c.get(Calendar.DAY_OF_WEEK);
        System.out.println(i);
        String fecha="LMJ";
        System.out.println();
        
       
       
        
}
    private static int[] convertirDatosFechas(String fecha){
        int[] datos=new int[3];
        StringBuffer aux=new StringBuffer(4);
        int j=0;
        
        char c='/';
        //recorremos por primera vez el string hasta encontrar /
        for (int i=0;i<fecha.length();i++){
            if(fecha.charAt(i)!=c){
            aux.append(fecha.charAt(i));
            }else{
                datos[j]=Integer.parseInt(aux.toString());
                int capacity=aux.capacity();
                aux.delete(0, capacity-1);
                j++;
            }
    }
        datos[j]=Integer.parseInt(aux.toString());
        return datos;
}
    private static char diaDelaSemana(int valor){
        switch(valor){
            case 1 -> {
                return 'D';
            }
            case 2 -> {
                return 'L';
            }
            case 3 -> {
                return 'M';
            }
            case 4 -> {
                return 'X';
            }
            case 5 -> {
                return 'J';
            }
            case 6 -> {
                return 'V';
            }
        }
        return 'S';
    }
}