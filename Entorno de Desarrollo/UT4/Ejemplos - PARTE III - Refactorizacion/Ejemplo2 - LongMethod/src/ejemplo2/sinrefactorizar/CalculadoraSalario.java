/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo2.sinrefactorizar;

/**
 * Clase para calcular el salario con base en las horas trabajadas, la tarifa
 * por hora y si es día festivo.
 */
public class CalculadoraSalario {

    /**
     * Calcula el salario total basado en las horas trabajadas, la tarifa por
     * hora y si es día festivo.
     *
     * @param horasTrabajadas El número de horas trabajadas.
     * @param tarifaPorHora La tarifa de pago por hora.
     * @param esFestivo Indica si se trabajó durante un día festivo.
     */
    public void calcularSalario(int horasTrabajadas, double tarifaPorHora, boolean esFestivo) {
        double salarioBase = horasTrabajadas * tarifaPorHora;
        double bonificacion = 0.0;

        if (horasTrabajadas > 40) {
            // Bonificación por horas extras
            int horasExtras = horasTrabajadas - 40;
            bonificacion += horasExtras * tarifaPorHora * 0.5;
        }

        if (esFestivo) {
            // Bonificación del 50% del salario base por trabajar en un día festivo
            bonificacion += salarioBase * 0.5;
        }

        double salarioTotal = salarioBase + bonificacion;

        System.out.println("El salario total es: " + salarioTotal);
    }
}
