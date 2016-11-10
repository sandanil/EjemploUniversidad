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
public class Estudio {
    private String codigo;
    //private Facultad facultad;
    private ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
    
    public void mostrar(){
        System.out.println(" Código: "+this.codigo);
        //System.out.println(" Cuidad: "+this.facultad);
        System.out.println(" Cuidad: "+this.alumnos);
    }
    
    public Estudio(String codigo /*, Facultad facultad*/) {
        this.codigo = codigo;
        //this.facultad = facultad;
    }

    /*public Facultad getFacultad() {
        return facultad;
    }

    public void setFacultad(Facultad facultad) {
        this.facultad = facultad;
    }*/
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }
    
    public void addAlumno(Alumno a){
        this.alumnos.add(a);
    }
}
