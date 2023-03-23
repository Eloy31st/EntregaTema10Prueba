package Ejercicio2;

import java.util.Scanner;

public class Calculadora {
    public void menu() {
        Scanner sc = new Scanner(System.in);
        int numero1 = 0;
        int numero2 = 0;
        String operador = "";
        boolean salir = false;
        Operacion operacion = new Operacion(numero1, numero2);
        try {
            System.out.println("Introduce un número: ");
            operacion.setNumero1(sc.nextInt());
        } catch (Exception e) {
            System.out.println("Valor introducido incorrecto. Inténtelo de nuevo...");
            salir = true;
        }
        while(!salir) {
            System.out.println("¿operador? (+ - * / % o s para salir)");
            operador = sc.next();
            if(operador.equals("s")) {
                System.out.println("Saliendo...");
                break;
            }
            try {
                System.out.println("Introduce un número: ");
                operacion.setNumero2(sc.nextInt());
            } catch (Exception e) {
                System.out.println("Valor introducido incorrecto. Inténtelo de nuevo...");
                operador = "s";
            }
            try {
                switch (operador) {
                    case "+":
                        System.out.println(operacion.suma());
                        break;
                    case "-":
                        System.out.println(operacion.resta());
                        break;
                    case "*":
                        System.out.println(operacion.multiplicacion());
                        break;
                    case "/":
                        try {
                            System.out.println("Dividiendo " + operacion.getNumero1() + " entre " + operacion.getNumero2());
                            operacion.setNumero1(operacion.getNumero1() / operacion.getNumero2());
                        } catch (ArithmeticException e) {
                            System.out.println("La división por cero no está definida");
                        }
                        System.out.println(operacion.getNumero1());
                        break;
                    case "%":
                        operacion.setNumero1(operacion.getNumero1() % operacion.getNumero2());
                        System.out.println(operacion.getNumero1());
                        break;
                    default:
                        System.out.println("Operador incorrecto");
                        break;
                }
            } catch (DesbordaCapacidadExcepcion e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

