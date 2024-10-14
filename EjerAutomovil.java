/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package automovil;

/**
 *
 * @author PERSONAL
 */
public class EjerAutomovil {
    // Atributos
    private String marca;
    private String modelo;
    private double precio;

    // Constructor
    public EjerAutomovil(String marca, String modelo, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    // Método para mostrar detalles del automóvil
    public void mostrarDetalles() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Precio: $" + precio);
    }

    // Método para encender el automóvil
    public void encender() {
        System.out.println("El automóvil " + marca + " " + modelo + " ha sido encendido.");
    }

    // Método para acelerar el automóvil
    public void acelerar(int velocidad) {
        System.out.println("El automóvil " + marca + " " + modelo + " está acelerando a " + velocidad + " km/h.");
    }

    // Main para probar la clase Automovil
    public static void main(String[] args) {
        EjerAutomovil auto1 = new EjerAutomovil("Toyota", "Corolla", 20000.0);
        EjerAutomovil auto2 = new EjerAutomovil("Honda", "Civic", 25000.0);

        auto1.mostrarDetalles();
        auto1.encender();
        auto1.acelerar(60);

        auto2.mostrarDetalles();
        auto2.encender();
        auto2.acelerar(80);
    }
}
