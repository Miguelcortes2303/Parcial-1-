/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca.parcial.pkg1.miguel.cortes;

/**
 *
 * @author Miguel Cortes 
 */
public class Usuario {
    private String username;
    private String password;
    private String ocupation;

    public Usuario(String username, String password, String ocupation) {
        this.username = username;
        this.password = password;
        this.ocupation = ocupation;
    }
    
    
   

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getOcupation() {
        return ocupation;
    }
    

}
