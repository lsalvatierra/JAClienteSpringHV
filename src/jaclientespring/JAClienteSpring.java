/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jaclientespring;

import entidades.Persona;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author LuisAngel
 */
public class JAClienteSpring {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String URL_PRINCIPAL = "http://localhost:8080/WSSpringHibernateValidation/persona/";
        try {
            Persona objPersona = new Persona();
            objPersona.setNombre("a");            
            RestTemplate restTemplate = new RestTemplate();
            restTemplate.postForEntity(URL_PRINCIPAL + "crear", objPersona, Persona.class);
            System.out.println("Correctamente Agregado");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
    
}
