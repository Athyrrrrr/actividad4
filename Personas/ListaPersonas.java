package actividad4.Personas;

import java.util.*;

/**
 * Esta clase denominada ListaPersonas define un vector de Personas.
 * @version 1.2/2020
 */
public class ListaPersonas {
    Vector listaPersonas; // Atributo que identifica un vector de personas

    /**
     * Constructor de la clase ListaPersonas
     */
    public ListaPersonas() {
        listaPersonas = new Vector(); // Crea el vector de personas
    }

    /**
     * Metodo que permite agregar una persona al vector de personas
     * @param p Parametro que define la persona a agregar al vector de personas
     */
    public void anadirPersona(Persona p) {
        listaPersonas.add(p);
    }

    /**
     * Metodo que permite eliminar una persona del vector de personas
     * @param i Parametro que define la posición a eliminar en el vector de personas
     */
    public void eliminarPersona(int i) {
        listaPersonas.removeElementAt(i);
    }

    /**
     * Metodo que permite eliminar todos los elementos del vector de personas
     */
    public void borrarLista() {
        listaPersonas.removeAllElements();
    }
}
