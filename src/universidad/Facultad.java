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
public class Facultad {
    private static int num_estudios;
    private String direccion;
    private String cuidad;
    private ArrayList<Estudio> estudios = new ArrayList<Estudio>();


    public Facultad(String direccion, String cuidad) {
        this.direccion = direccion;
        this.cuidad = cuidad;
        num_estudios++;
    }
    
    public void Facultad(){
    }
    
    public void mostrar(){
        System.out.println(" Dirección: "+this.direccion);
        System.out.println(" Cuidad: "+this.cuidad);
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCuidad() {
        return cuidad;
    }

    public void setCuidad(String cuidad) {
        this.cuidad = cuidad;
    }
    
    public void addEstudio(Estudio e){
        this.estudios.add(e);
    }
}
