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
        //String URL_PRINCIPAL = "http://localhost:8080/WSRestSpringBD/pagos/ListarEspecialidades";
        String URL_PRINCIPAL = "http://localhost:8080/WSRestSpringBD/Alumno/ListarAlumnosxEspec/";
        try {
            /*Persona objPersona = new Persona();
            objPersona.setNombre("abcc");
            objPersona.setPassword("aB5c$cc");
            */      
            RestTemplate restTemplate = new RestTemplate();
            String result = restTemplate.getForObject(URL_PRINCIPAL+"E03", String.class);
            System.out.println(result);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
    
}
