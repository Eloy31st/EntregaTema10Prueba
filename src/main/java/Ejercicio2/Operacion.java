package Ejercicio2;

public class Operacion {
    private int numero1;
    private int numero2;

    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public int suma() throws DesbordaCapacidadExcepcion{
        numero1 = numero1 + numero2;
        if(numero1 > Integer.MAX_VALUE || numero1 < Integer.MIN_VALUE) {
            throw new DesbordaCapacidadExcepcion();
        }else{
            return numero1;
        }
    }

    public int resta() throws DesbordaCapacidadExcepcion{
        numero1 = numero1 - numero2;
        if(numero1 > Integer.MAX_VALUE || numero1 < Integer.MIN_VALUE) {
            throw new DesbordaCapacidadExcepcion();
        }else{
            return numero1;
        }
    }

    public int multiplicacion() throws DesbordaCapacidadExcepcion{
        numero1 = numero1 * numero2;
        if(numero1 > Integer.MAX_VALUE || numero1 < Integer.MIN_VALUE) {
            throw new DesbordaCapacidadExcepcion();
        }else{
            return numero1;
        }
    }
}
