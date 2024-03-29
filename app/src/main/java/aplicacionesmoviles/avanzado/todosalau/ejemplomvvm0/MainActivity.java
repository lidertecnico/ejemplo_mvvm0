package aplicacionesmoviles.avanzado.todosalau.ejemplomvvm0;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import aplicacionesmoviles.avanzado.todosalau.ejemplomvvm0.viewmodel.PersonaViewModel;

// Definición de la clase MainActivity que extiende de AppCompatActivity
public class MainActivity extends AppCompatActivity {

    // Declaración de los elementos de la interfaz de usuario
    private EditText editTextNombre, editTextEdad;
    private TextView textViewInfo;
    private Button buttonGuardar;

    // Instancia de PersonaViewModel
    private PersonaViewModel personaViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Establece el layout de la actividad

        // Vinculación de los elementos de la interfaz de usuario con los objetos Java
        editTextNombre = findViewById(R.id.editTextNombre);
        editTextEdad = findViewById(R.id.editTextEdad);
        textViewInfo = findViewById(R.id.textViewInfo);
        buttonGuardar = findViewById(R.id.buttonGuardar);

        // Inicialización de PersonaViewModel mediante ViewModelProvider
        personaViewModel = new ViewModelProvider(this).get(PersonaViewModel.class);
        personaViewModel.init("Nombre por defecto", 0); // Inicialización de PersonaViewModel con valores predeterminados

        // Método para actualizar la interfaz de usuario con los datos de la persona
        actualizarUI();

        // Definición de la acción del botón guardar
        buttonGuardar.setOnClickListener(view -> {
            // Obtención del nombre y la edad ingresados por el usuario
            String nombre = editTextNombre.getText().toString();
            int edad = Integer.parseInt(editTextEdad.getText().toString());
            // Establecimiento del nombre y la edad en el ViewModel
            personaViewModel.setNombre(nombre);
            personaViewModel.setEdad(edad);
            // Actualización de la interfaz de usuario con los nuevos datos
            actualizarUI();
        });
    }

    // Método para actualizar la interfaz de usuario con los datos de la persona
    private void actualizarUI() {
        textViewInfo.setText("Nombre: " + personaViewModel.getNombre() + "\nEdad: " + personaViewModel.getEdad());
    }
}