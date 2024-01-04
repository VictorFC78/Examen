/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examandesinf.logica;

import com.mycompany.examendesinf.dto.Personal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.Set;

/**
 *
 * @author 34675
 */
public class LogicaNegocio {
    private static List<Personal> lstPersonal=new ArrayList<>();
    private static Set<String> lstDepartamentos=new HashSet<>();

    private static void fillPersonal() {
        lstPersonal.add(new Personal("09769763D","John","Goodman","INF",53));
        lstPersonal.add(new Personal("09769764X","Mary","Shelley","INF",52));
        lstPersonal.add(new Personal("09664141P","John","Goodman","COC",75));
        lstPersonal.add(new Personal("09807741D","Oscar","Adria","COC",51));
        lstPersonal.add(new Personal("76435234F","Benicio","Del Toro","INF",56));
        lstPersonal.add(new Personal("71502672L","Susan","Sarandon","ART",77));
        lstPersonal.add(new Personal("09621532K","Rose","Nylan","ART",46));
        lstPersonal.add(new Personal("10215412J","Jermaine","jackson","ART",46));
        lstPersonal.add(new Personal("45012423A","Charlie","Kaufman","ART",65));

    }
    
    public static void initialite(){
        fillPersonal();
        rellenarListaDepartamentos();
    }
    private static void rellenarListaDepartamentos(){
         for (Personal p:lstPersonal){
          lstDepartamentos.add(p.getCodDepartamento());
      }
    }
    public static List<Personal> getLstPersonal(){
        return lstPersonal;
    }
    public static Set<String> getListaDepartamentos(){
      return lstDepartamentos;
    }
    public static double edadMediaDepartamento(String depto){
//        int numPersonas=0;
//        int sumaEdades=0;
//        for (Personal p:lstPersonal){
//            if (p.getCodDepartamento().equals(depto)){
//                numPersonas++;
//                sumaEdades+=p.getEdad();
//            }
//        }
//        if (numPersonas==0) return 0;
//        else return sumaEdades/numPersonas;
        OptionalDouble doble=lstPersonal.stream().filter(d->d.getCodDepartamento().equals(depto))
                .mapToInt(p->p.getEdad()).average();
        return doble.isPresent()?doble.getAsDouble():0;
    }
    public static List<Personal> getListaPersonalDepartamento(String depto){
        List<Personal> lista=new ArrayList<>();
        for (Personal p:lstPersonal){
            if (p.getCodDepartamento().equalsIgnoreCase(depto))lista.add(p);
        }
        return lista;
    }

    public static boolean existeDepartamento(String dpto) {
        for (String d:lstDepartamentos){
            if (d.equals(dpto))return true;
        }
        return false;
    }
}
