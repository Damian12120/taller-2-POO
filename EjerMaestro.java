/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package maestro;

/**
 *
 * @author PERSONAL
 */
public class EjerMaestro {
    // Atributos
    private String nombre;
    private int edad;
    private String asignaturaPrincipal;

    // Constructor
    public EjerMaestro(String nombre, int edad, String asignaturaPrincipal) {
        this.nombre = nombre;
        this.edad = edad;
        this.asignaturaPrincipal = asignaturaPrincipal;
    }

    // Método para mostrar detalles del maestro
    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad + ", Asignatura Principal: " + asignaturaPrincipal);
    }

    // Método para enseñar
    public void ensenar() {
        System.out.println("El maestro " + nombre + " está enseñando " + asignaturaPrincipal + ".");
    }

    // Método para calificar
    public void calificar(String estudiante, int nota) {
        System.out.println("El maestro " + nombre + " ha calificado a " + estudiante + " con una nota de " + nota + ".");
    }

    // Main para probar la clase Maestro
    public static void main(String[] args) {
        EjerMaestro maestro1 = new EjerMaestro("Juan Pérez", 45, "Matemáticas");
        EjerMaestro maestro2 = new EjerMaestro("Ana Gómez", 38, "Historia");

        maestro1.mostrarDetalles();
        maestro1.ensenar();
        maestro1.calificar("Pedro", 95);

        maestro2.mostrarDetalles();
        maestro2.ensenar();
        maestro2.calificar("María", 88);
    }
}
