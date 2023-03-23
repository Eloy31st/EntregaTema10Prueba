package Ejercicio1;

public class Calculo {
    private int numero;

    public Calculo(int numero) {
        this.numero = numero;
    }

    public void raizCuadrada() throws Exception{
        if(numero < 0) {
            throw new Exception("La raiz cuadrada no está definida para un número negativo");
        }else{
            System.out.println("La raiz cuadrada de " + numero + " es " + Math.sqrt(numero));
        }
    }
}
