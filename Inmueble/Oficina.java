package actividad4.Inmueble;

public class Oficina extends Local {
    // Atributo que identifica el valor por área de una oficina
    protected static double valorArea = 3500000;

    // Atributo que identifica si una oficina pertenece o no al gobierno
    protected boolean esGobierno;

    /**
     * Constructor de la clase Oficina
     * @param identificadorInmobiliario Parámetro que define el
     * identificador inmobiliario de una oficina
     * @param área Parámetro que define el área de una oficina
     * @param dirección Parámetro que define la dirección donde se
     * encuentra localizada una oficina
     * @param tipoLocal Parámetro que define el tipo de una oficina
     * (interna o que da a la calle)
     * @param esGobierno Parámetro que define un valor booleano para
     * determinar si la oficina es del gobierno o no
     */
    public Oficina(int identificadorInmobiliario, int área, String dirección,
                   tipo tipoLocal, boolean esGobierno) {
        // Invoca al constructor de la clase padre
        super(identificadorInmobiliario, área, dirección, tipoLocal);
        this.esGobierno = esGobierno;
    }

    /**
     * Método que muestra en pantalla los datos de una oficina
     */
    void imprimir() {
        super.imprimir(); // Invoca al método imprimir de la clase padre
        System.out.println("Es oficina gubernamental = " + esGobierno);
        System.out.println();
    }
}
