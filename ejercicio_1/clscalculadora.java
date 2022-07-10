/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_1;

import javax.swing.JOptionPane;
import javax.swing.*;

/**
 *
 * @author Henry
 */
public class clscalculadora {

    public clscalculadora() {
    }

    public void iniciarprograma() {

        String menu = """
                                seleccione una opcion:
                   
                                1. realizar una operacion 
                                2. salir 
                   
                                 """;

        String opcion = "";

        do {

            opcion = JOptionPane.showInputDialog(menu);

            switch (opcion) {

                case "1":
                    menu_operaciones();
                    break;

                case "2":
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "opcion incorrecta");

            }

        } while (!opcion.equals("2"));

        JOptionPane.showMessageDialog(null, "muchas gracias por su tiempo");

    }

    public static void menu_operaciones() {

        String menu_2 = """
                                seleccione una opcion:
                   
                                1. suma 
                                2. resta 
                                3. multiplicacion
                                4. division
                                5. potencia
                                6. raiz cuadrada 
                                7. salir 
                            
                   
                                 """;

        String opcion_2 = "";

        opcion_2 = JOptionPane.showInputDialog(menu_2);

        switch (opcion_2) {

            case "1":
                try {
                double a = Double.parseDouble(JOptionPane.showInputDialog(null, "Inserte el primer numero "));
                double b = Double.parseDouble(JOptionPane.showInputDialog(null, "Inserte el segundo numero"));
                double resultado = a + b;
                JOptionPane.showMessageDialog(null, "El resultado de la suma es " + String.format(java.util.Locale.US, "%.2f", resultado));
                menu_operaciones();
                break;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "debes ingresar un valor numerico");
                menu_operaciones();
            }

            case "2":
                try {
                double c = Double.parseDouble(JOptionPane.showInputDialog(null, "Inserte el primer numero "));
                double d = Double.parseDouble(JOptionPane.showInputDialog(null, "Inserte el segundo numero"));
                double resultado_resta = c - d;
                JOptionPane.showMessageDialog(null, "El resultado de la resta es " + String.format(java.util.Locale.US, "%.2f", resultado_resta));
                menu_operaciones();
                break;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "debes ingresar un valor numerico");
                menu_operaciones();
            }

            case "3":
                try {
                double e = Double.parseDouble(JOptionPane.showInputDialog(null, "Inserte el primer numero "));
                double f = Double.parseDouble(JOptionPane.showInputDialog(null, "Inserte el segundo numero"));
                double resultado_multiplicacion = e * f;
                JOptionPane.showMessageDialog(null, "El resultado de la multiplicacion es " + String.format(java.util.Locale.US, "%.2f", resultado_multiplicacion));
                menu_operaciones();
                break;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "debes ingresar un valor numerico");
                menu_operaciones();
            }

            case "4":
                try {
                double g = Double.parseDouble(JOptionPane.showInputDialog(null, "Inserte el primer numero "));
                double h = Double.parseDouble(JOptionPane.showInputDialog(null, "Inserte el segundo numero"));
                if (h != 0) {
                    double resultado_division = g / h;
                    JOptionPane.showMessageDialog(null, "El resultado de la division es " + String.format(java.util.Locale.US, "%.2f", resultado_division));

                } else {
                    JOptionPane.showMessageDialog(null, "no se puede dividir por cero ");
                }
                menu_operaciones();
                break;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "debes ingresar un valor numerico");
                menu_operaciones();
            }

            case "5":
                try {
                double base,
                        exponente,
                        potencia;
                base = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor de base"));
                exponente = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor de exponente"));
                potencia = Math.pow(base, exponente);
                JOptionPane.showMessageDialog(null, "El resultado de la potencia es " + String.format(java.util.Locale.US, "%.2f", potencia));
                menu_operaciones();
                break;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "debes ingresar un valor numerico");
                menu_operaciones();
            }

            case "6":
                try {
                double numero,
                        raiz_cuadrada;
                numero = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor de numero"));
                if (numero >= 0) {
                    raiz_cuadrada = Math.sqrt(numero);
                } else {
                    raiz_cuadrada = Math.sqrt(-numero);
                    JOptionPane.showMessageDialog(null, "ra\u00EDz imaginaria");
                }
                JOptionPane.showMessageDialog(null,
                        "Valor de raiz cuadrada: " + String.format(java.util.Locale.US, "%.2f", raiz_cuadrada));
                menu_operaciones();
                break;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "debes ingresar un valor numerico");
                menu_operaciones();
            }

            case "7":
                break;

            default:
                JOptionPane.showMessageDialog(null, "opcion incorrecta");               
        }

        JOptionPane.showMessageDialog(null, "muchas gracias por su tiempo");

    }

}
