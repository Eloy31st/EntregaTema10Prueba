package Ejercicio2;

public class DesbordaCapacidadExcepcion extends Exception{
    public DesbordaCapacidadExcepcion() {
        System.out.println("El resultado desborda la capacidad de esta calculadora");
    }
}
