/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidad;

/**
 *
 * @author DaniL
 */
public class MasterNoOficial extends Master{
    private String titulo;

    public MasterNoOficial(String titulo, String especialidad, String codigo) {
        super(especialidad, codigo);
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
}
