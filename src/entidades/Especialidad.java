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
@XmlRootElement(name = "especialidad")
public class Especialidad  implements Serializable {
    private String IdEspecialidad;
    private String NomEspecialidad;
    private Double CostoEspecialidad;

    public String getIdEspecialidad() {
        return IdEspecialidad;
    }

    public void setIdEspecialidad(String IdEspecialidad) {
        this.IdEspecialidad = IdEspecialidad;
    }

    public String getNomEspecialidad() {
        return NomEspecialidad;
    }

    public void setNomEspecialidad(String NomEspecialidad) {
        this.NomEspecialidad = NomEspecialidad;
    }

    public Double getCostoEspecialidad() {
        return CostoEspecialidad;
    }

    public void setCostoEspecialidad(Double CostoEspecialidad) {
        this.CostoEspecialidad = CostoEspecialidad;
    }
    
    
}
