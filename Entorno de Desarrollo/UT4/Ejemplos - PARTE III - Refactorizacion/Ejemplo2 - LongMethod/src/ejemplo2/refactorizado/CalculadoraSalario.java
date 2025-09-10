/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo2.refactorizado;

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
        double salarioBase = calcularSalarioBase(horasTrabajadas, tarifaPorHora);
        double bonificacion = calcularBonificaciones(horasTrabajadas, tarifaPorHora, esFestivo, salarioBase);
        double salarioTotal = salarioBase + bonificacion;

        System.out.println("El salario total es: " + salarioTotal);
    }

    /**
     * Calcula el salario base con base en las horas trabajadas y la tarifa por
     * hora.
     *
     * @param horasTrabajadas El número de horas trabajadas.
     * @param tarifaPorHora La tarifa de pago por hora.
     * @return El salario base.
     */
    private double calcularSalarioBase(int horasTrabajadas, double tarifaPorHora) {
        return horasTrabajadas * tarifaPorHora;
    }

    /**
     * Calcula las bonificaciones basadas en horas extras y si es día festivo.
     *
     * @param horasTrabajadas El número de horas trabajadas.
     * @param tarifaPorHora La tarifa de pago por hora.
     * @param esFestivo Indica si se trabajó durante un día festivo.
     * @param salarioBase El salario base calculado.
     * @return El total de bonificaciones.
     */
    private double calcularBonificaciones(int horasTrabajadas, double tarifaPorHora, boolean esFestivo, double salarioBase) {
        double bonificacion = 0.0;
        bonificacion += calcularBonificacionPorHorasExtras(horasTrabajadas, tarifaPorHora);
        if (esFestivo) {
            bonificacion += salarioBase * 0.5; // Bonificación del 50% del salario base por trabajar en un día festivo
        }
        return bonificacion;
    }

    /**
     * Calcula la bonificación por horas extras.
     *
     * @param horasTrabajadas El número de horas trabajadas.
     * @param tarifaPorHora La tarifa de pago por hora.
     * @return La bonificación por horas extras.
     */
    private double calcularBonificacionPorHorasExtras(int horasTrabajadas, double tarifaPorHora) {
        if (horasTrabajadas > 40) {
            int horasExtras = horasTrabajadas - 40;
            return horasExtras * tarifaPorHora * 0.5;
        }
        return 0.0;
    }
}
