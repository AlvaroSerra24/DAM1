/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo4.refactorizado;

/**
 * Clase que representa los datos necesarios para generar un reporte de ventas.
 */
public class DatosReporteVentas {
    String fechaInicio;
    String fechaFin;
    int ventasTotales;
    int ventasOnline;
    int ventasTienda;
    double ingresosTotales;
    double ingresosOnline;
    double ingresosTienda;
    boolean incluirDetalles;

    /**
     * Constructor para crear una instancia de DatosReporteVentas.
     *
     * @param fechaInicio La fecha de inicio del período del reporte.
     * @param fechaFin La fecha de fin del período del reporte.
     * @param ventasTotales El total de ventas en el período.
     * @param ventasOnline El total de ventas realizadas online.
     * @param ventasTienda El total de ventas realizadas en tienda.
     * @param ingresosTotales El total de ingresos generados.
     * @param ingresosOnline Los ingresos generados por ventas online.
     * @param ingresosTienda Los ingresos generados por ventas en tienda.
     * @param incluirDetalles Si se incluyen detalles en el reporte.
     */
    public DatosReporteVentas(String fechaInicio, String fechaFin, int ventasTotales, int ventasOnline, int ventasTienda, double ingresosTotales, double ingresosOnline, double ingresosTienda, boolean incluirDetalles) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.ventasTotales = ventasTotales;
        this.ventasOnline = ventasOnline;
        this.ventasTienda = ventasTienda;
        this.ingresosTotales = ingresosTotales;
        this.ingresosOnline = ingresosOnline;
        this.ingresosTienda = ingresosTienda;
        this.incluirDetalles = incluirDetalles;
    }
}

