/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package usabilidadapp;

import java.util.ArrayList;
import java.util.Scanner;

public class UsabilidadApp {

    private static ArrayList<String> tareas = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer después de leer el número

            switch (opcion) {
                case 1:
                    agregarTarea(scanner);
                    break;
                case 2:
                    mostrarTareas();
                    break;
                case 3:
                    marcarTareaComoCompletada(scanner);
                    break;
                case 4:
                    eliminarTarea(scanner);
                    break;
                case 5:
                    System.out.println("Saliendo de la aplicacion. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opcion no valida. Intentalo de nuevo.");
            }
        } while (opcion != 5);
    }

    private static void mostrarMenu() {
        System.out.println("\n--- Aplicacion de Lista de Tareas ---");
        System.out.println("1. Agregar Tarea");
        System.out.println("2. Mostrar Tareas");
        System.out.println("3. Marcar Tarea como Completada");
        System.out.println("4. Eliminar Tarea");
        System.out.println("5. Salir");
        System.out.print("Seleccione una opcion: ");
    }

    private static void agregarTarea(Scanner scanner) {
        System.out.print("Ingrese la nueva tarea: ");
        String nuevaTarea = scanner.nextLine();
        tareas.add(nuevaTarea);
        System.out.println("Tarea agregada con exito: " + nuevaTarea);
    }

    private static void mostrarTareas() {
        if (tareas.isEmpty()) {
            System.out.println("No hay tareas en la lista.");
        } else {
            System.out.println("Lista de Tareas:");
            for (int i = 0; i < tareas.size(); i++) {
                System.out.println((i + 1) + ". " + tareas.get(i));
            }
        }
    }

    private static void marcarTareaComoCompletada(Scanner scanner) {
        mostrarTareas();
        if (!tareas.isEmpty()) {
            System.out.print("Ingrese el numero de la tarea completada: ");
            int numeroTarea = scanner.nextInt();
            if (numeroTarea >= 1 && numeroTarea <= tareas.size()) {
                String tareaCompletada = tareas.remove(numeroTarea - 1);
                System.out.println("¡Bien hecho! Tarea completada: " + tareaCompletada);
            } else {
                System.out.println("Numero de tarea no valido.");
            }
        }
    }

    private static void eliminarTarea(Scanner scanner) {
        mostrarTareas();
        if (!tareas.isEmpty()) {
            System.out.print("Ingrese el número de la tarea a eliminar: ");
            int numeroTarea = scanner.nextInt();
            if (numeroTarea >= 1 && numeroTarea <= tareas.size()) {
                String tareaEliminada = tareas.remove(numeroTarea - 1);
                System.out.println("Tarea eliminada: " + tareaEliminada);
            } else {
                System.out.println("Numero de tarea no valido.");
            }
        }
    }
}
