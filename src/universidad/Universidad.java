/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidad;

import java.util.ArrayList;

/**
 *
 * @author DaniL
 */
public class Universidad {
    static ArrayList<Facultad> facultades = new ArrayList<Facultad>();
    
    public static void rellenarDatos(){
        Facultad fa;
        Estudio gra, maspos, masnoof;
        Alumno alumreg, alumbec, aluminter;
        
        for (int i = 0; i < 10; i++) {
            fa = new Facultad("Calle "+(i+1),"Ciudad "+(i+1)); //Tenemos un constructor, no hace falta los de abajo.
            //fa.setDireccion("Calle "+(i+1));
            //fa.setCuidad("Ciudad "+(i+1));
            gra = new Grado((int) (Math.random()*5),"Code GRA "+1+i);
            maspos = new MasterPostgrado("Estudios Previos "+(i+1),"Especialidad PG "+(i+1),"Code PG "+2+i);
            masnoof = new MasterNoOficial("Título "+(i+1),"Especialidad NOF "+(i+1),"Code NOF "+3+i);
            
            alumreg = new Regular("Alumno Regular "+(i+1),(int) (Math.random()*28));
            alumbec = new Becario("Departamento "+(i+1),"Alumno Becario "+(i+1),(int) (Math.random()*35));
            aluminter = new Intercambio("Universidad Origen "+(i+1),"Alumno Intercambio "+(i+1),(int) (Math.random()*26));
            
            maspos.addAlumno(alumreg);
            maspos.addAlumno(aluminter);
            masnoof.addAlumno(alumbec);
            
            fa.addEstudio(gra);
            fa.addEstudio(maspos);
            fa.addEstudio(masnoof);
          
            facultades.add(fa);
        }
    }
//----------------------------------------------------------------------------------------------------
    public static void mostrarFacultades(){
        System.out.println("Facultades: ");
        for (Facultad facultade : facultades) {
            facultade.mostrar();
            System.out.println("");
        }
    }
//----------------------------------------------------------------------------------------------------
    public static void mostrarAlumnosporEstudio(Estudio est){
        
    }
//----------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------
    public static void main(String[] args) {
        rellenarDatos();
        mostrarFacultades();
        //mostrarAlumnosporEstudio(  );
    }
    
}
