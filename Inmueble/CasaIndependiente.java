package actividad4.Inmueble;

public class CasaIndependiente extends CasaUrbana {
    // Atributo que identifica el valor por área de una casa independiente
    protected static double valorArea = 3000000;

    /**
     * Constructor de la clase CasaIndependiente
     * @param identificadorInmobiliario Parámetro que define el
     * identificador inmobiliario de una casa independiente
     * @param área Parámetro que define el área de una casa independiente
     * @param dirección Parámetro que define la dirección donde se
     * encuentra localizada una casa independiente
     * @param númeroHabitaciones Parámetro que define el número de
     * habitaciones que tiene una casa independiente
     * @param númeroBaños Parámetro que define el número de baños
     * que tiene una casa independiente
     * @param númeroPisos Parámetro que define el número de pisos
     * que tiene una casa independiente
     */
    public CasaIndependiente(int identificadorInmobiliario, int área,
                             String dirección, int númeroHabitaciones, int númeroBaños, int
                             númeroPisos) {
        // Invoca al constructor de la clase padre
        super(identificadorInmobiliario, área, dirección,
              númeroHabitaciones, númeroBaños, númeroPisos);
    }

    /**
     * Método que muestra en pantalla los datos de una casa independiente
     */
    void imprimir() {
        super.imprimir(); // Invoca al método imprimir de la clase padre
        System.out.println();
    }
}
