package aplicacionesmoviles.avanzado.todosalau.ejemplomvvm0.modelo;

// Definición de la clase Persona
public class Persona {
    // Atributos privados de la clase Persona
    private String nombre;
    private int edad;

    // Constructor de la clase Persona que recibe nombre y edad
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Método para obtener el nombre de la persona
    public String getNombre() {
        return nombre;
    }

    // Método para establecer el nombre de la persona
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Método para obtener la edad de la persona
    public int getEdad() {
        return edad;
    }

    // Método para establecer la edad de la persona
    public void setEdad(int edad) {
        this.edad = edad;
    }
}