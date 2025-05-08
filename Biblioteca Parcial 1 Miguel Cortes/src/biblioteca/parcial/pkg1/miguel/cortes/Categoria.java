/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca.parcial.pkg1.miguel.cortes;

/**
 *
 * @author Estudiante
 */
public class Categoria {
    public String categoria;

    public Categoria(String categoria) {
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }
    public void agregarCategoria(Libros libros) {
        libros.add(libros);
    }
       
   public void mostrarCategoria(Iterable<Libros> libros) {
        System.out.println("Categoria seleccionada:" + categoria);
        for (Libros l : libros) {
            System.out.println(l);
        }
   }  
}
