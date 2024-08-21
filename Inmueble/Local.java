package actividad4.Inmueble;

public class Local extends Inmueble {
    enum tipo {INTERNO, CALLE}; // Tipo de inmueble especificado como un valor enumerado
    
    protected tipo tipoLocal; // Atributo que identifica el tipo de inmueble

    /**
     * Constructor de la clase Local
     * @param identificadorInmobiliario Parámetro que define el
     * identificador inmobiliario de un local
     * @param área Parámetro que define el área de un local
     * @param dirección Parámetro que define la dirección donde se
     * encuentra localizado un local
     * @param tipoLocal Parámetro que define el tipo de local (interno o
     * que da a la calle)
     */
    public Local(int identificadorInmobiliario, int área, String dirección,
                 tipo tipoLocal) {
        // Invoca al constructor de la clase padre
        super(identificadorInmobiliario, área, dirección);
        this.tipoLocal = tipoLocal;
    }

    /**
     * Método que muestra en pantalla los datos de un local
     */
    void imprimir() {
        super.imprimir(); // Invoca al método imprimir de la clase padre
        System.out.println("Tipo de local = " + tipoLocal);
    }
}
