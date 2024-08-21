package actividad4.CarreraCiclistica;

public class Escalador extends Ciclista {
    // Atributo que define la aceleracion promedio de un escalador
    private double aceleracionPromedio;
    // Atributo que define el grado de rampa soportado por un escalador
    private double gradoRampa;

    /**
     * Constructor de la clase Escalador
     * @param identificador Parametro que define el identificador de un escalador
     * @param nombre Parametro que define el nombre de un escalador
     * @param aceleracionPromedio Parametro que define la aceleracion promedio de un escalador
     * @param gradoRampa Parametro que define el grado de rampa de un escalador
     */
    public Escalador(int identificador, String nombre, double aceleracionPromedio, double gradoRampa) {
        super(identificador, nombre);
        this.aceleracionPromedio = aceleracionPromedio;
        this.gradoRampa = gradoRampa;
    }

    /**
     * Metodo que devuelve la aceleracion promedio de un escalador
     * @return La aceleracion promedio de un escalador
     */
    protected double getAceleracionPromedio() {
        return aceleracionPromedio;
    }

    /**
     * Metodo que establece la aceleracion promedio de un escalador
     * @param aceleracionPromedio Parametro que especifica la aceleracion promedio de un escalador
     */
    protected void setAceleracionPromedio(double aceleracionPromedio) {
        this.aceleracionPromedio = aceleracionPromedio;
    }

    /**
     * Metodo que devuelve el grado de rampa soportado de un escalador
     * @return El grado de rampa soportado de un escalador
     */
    protected double getGradoRampa() {
        return gradoRampa;
    }

    /**
     * Metodo que establece el grado de rampa soportado por un escalador
     * @param gradoRampa Parametro que especifica el grado de rampa soportado por un escalador
     */
    protected void setGradoRampa(double gradoRampa) {
        this.gradoRampa = gradoRampa;
    }

    /**
     * Metodo que muestra en pantalla los datos de un escalador
     */
    protected void imprimir() {
        super.imprimir(); // Invoca el metodo imprimir de la clase padre
        System.out.println("Aceleracion promedio = " + aceleracionPromedio);
        System.out.println("Grado de rampa = " + gradoRampa);
    }

    /**
     * Metodo que devuelve el tipo de ciclista
     * @return Un valor String con el texto "Es un escalador"
     */
    protected String imprimirTipo() {
        return "Es un escalador";
    }
}
