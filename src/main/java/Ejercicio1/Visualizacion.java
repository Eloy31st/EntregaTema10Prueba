package Ejercicio1;

import java.util.Scanner;

public class Visualizacion {
    public void menu() throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int numero = sc.nextInt();
        Calculo calculo = new Calculo(numero);
        calculo.raizCuadrada();
    }
}
