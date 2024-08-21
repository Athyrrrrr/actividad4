package actividad4;

/**
 * Esta clase denominada Cuenta modela una cuenta bancaria con los
 * atributos saldo, número de consignaciones, número de retiros, tasa
 * anual de interés y comisión mensual.
 * @version 1.2/2020
 */
public class Cuenta {
    /* Atributo que define el sueldo de una cuenta bancaria */
    protected float saldo; 

    /* Atributo que define el número de consignaciones realizadas en
     * una cuenta bancaria 
     */
    protected int númeroConsignaciones = 0;

    // Atributo que define el número de retiros de una cuenta bancaria
    protected int númeroRetiros = 0;

    // Atributo que define la tasa anual de intereses de una cuenta bancaria
    protected float tasaAnual;

    /* Atributo que define la comisión mensual que se cobra a una
     * cuenta bancaria 
     */
    protected float comisiónMensual = 0;

    /**
     * Constructor de la clase Cuenta
     * @param saldo Parámetro que define el saldo de la cuenta
     * @param tasaAnual Parámetro que define la tasa anual de interés de
     * la cuenta
     */
    public Cuenta(float saldo, float tasaAnual) {
        this.saldo = saldo;
        this.tasaAnual = tasaAnual;
    }

    /**
     * Método que recibe una cantidad de dinero a consignar y actualiza
     * el saldo de la cuenta
     * @param saldo Parámetro que define la cantidad de dinero a
     * consignar en la cuenta
     */
    public void consignar(float cantidad) {
        saldo = saldo + cantidad; /* Se actualiza el saldo con la cantidad
                                   * consignada 
                                   */
        // Se actualiza el número de consignaciones realizadas en la cuenta
        númeroConsignaciones = númeroConsignaciones + 1;
    }

    /**
     * Método que recibe una cantidad de dinero a retirar y actualiza el
     * saldo de la cuenta
     * @param cantidad Parámetro que define la cantidad de dinero a retirar
     * de la cuenta
     */
    public void retirar(float cantidad) {
        float nuevoSaldo = saldo - cantidad;
        /* Si la cantidad a retirar no supera el saldo, el retiro no se puede
         * realizar 
         */
        if (nuevoSaldo >= 0) {
            saldo -= cantidad;
            númeroRetiros = númeroRetiros + 1;
        } else {
            System.out.println("La cantidad a retirar excede el saldo actual.");
        }
    }

    /**
     * Método que calcula el interés mensual de la cuenta a partir de la tasa
     * anual aplicada
     */
    public void calcularInterés() {
        float tasaMensual = (tasaAnual / 100) / 12; /* Convierte la tasa anual en
                                                    * mensual 
                                                   */
        float interesMensual = saldo * tasaMensual;
        saldo += interesMensual; /* Actualiza el saldo aplicando el interés
                                  * mensual 
                                  */
    }

    /**
     * Método que genera un extracto aplicando al saldo actual una
     * comisión y calculando sus intereses
     */
    public void extractoMensual() {
        saldo -= comisiónMensual;
        calcularInterés();
    }
}
