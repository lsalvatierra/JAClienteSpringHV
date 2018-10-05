/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlRootElement;


/**
 *
 * @author LuisAngel
 */
@XmlRootElement(name = "persona")
public class Persona implements Serializable {
    //private static final long serialVerisionUID = 1L;
    private String nombre;
    
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
