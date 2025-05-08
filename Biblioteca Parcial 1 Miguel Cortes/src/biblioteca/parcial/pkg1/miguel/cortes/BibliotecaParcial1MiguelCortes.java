/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package biblioteca.parcial.pkg1.miguel.cortes;
import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class BibliotecaParcial1MiguelCortes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su nombre de usuario");
        String nombre = sc.nextLine();
        
        System.out.println("Ahora ingrese su password");
        String contraseña = sc.nextLine();
        
        System.out.println("Es usted estudiante o docente");
        System.out.println("1. Estudiante");
        System.out.println("2. Docente");
        int opcion = sc.nextInt();
        sc.nextLine();
        switch (opcion) {
            case 1:
                System.out.println("Bienvenido estudiante");
                break;
            case 2:
                System.out.println("Bienvenido docente");
                break;
        }
        
        System.out.println("Ingrese la categoria del libro que desea registrar");
        System.out.println("1. Matematicas");
        System.out.println("2. Ciencias");
        System.out.println("3. Biologia");
        sc.nextLine();
        
        switch (opcion) {
            case 1:
                System.out.println("Ha seleccionada la categoria (Matematicas)");
                break;
            case 2:
                System.out.println("Ha seleccionada la categoria (Ciencias)");
                break;
            case 3:
                System.out.println("Ha seleccionada la categoria (Biologia)");
                break;
        }
        System.out.println("Ingrese el nombre del libro");
        String nombrelibro = sc.nextLine();
        System.out.println("El libro ha sido registrado exitosamente, !!hasta luego!!");
            
        
        
    }
    
}
