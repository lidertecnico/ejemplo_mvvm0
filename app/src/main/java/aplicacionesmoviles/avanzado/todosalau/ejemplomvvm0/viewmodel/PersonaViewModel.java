package aplicacionesmoviles.avanzado.todosalau.ejemplomvvm0.viewmodel;

import androidx.lifecycle.ViewModel;

import aplicacionesmoviles.avanzado.todosalau.ejemplomvvm0.modelo.Persona;

// Definición de la clase PersonaViewModel que extiende de ViewModel
public class PersonaViewModel extends ViewModel {
    // Atributo privado de tipo Persona
    private Persona persona;

    // Método para inicializar la Persona con un nombre y una edad
    public void init(String nombre, int edad) {
        persona = new Persona(nombre, edad);
    }

    // Método para obtener el nombre de la persona
    public String getNombre() {
        return persona.getNombre();
    }

    // Método para establecer el nombre de la persona
    public void setNombre(String nombre) {
        persona.setNombre(nombre);
    }

    // Método para obtener la edad de la persona
    public int getEdad() {
        return persona.getEdad();
    }

    // Método para establecer la edad de la persona
    public void setEdad(int edad) {
        persona.setEdad(edad);
    }
}