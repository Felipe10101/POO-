package co.edu.uniquindio.poo;

import java.util.Scanner;


class Estudiante {
    public String id;
    public String nombres;
    public String apellidos;
    public String correo;
    public String telefono;
    public int edad;

//class Estudiante{
//    private String id;
//    private String nombre;
//    private String apellido;
//    private String correo;
//    private String telefono;
//    private int edad;

    public Estudiante(String idParam, String nombresParam, String apellidosParam, String correoParam, String telefonoParam, int edadParam) {
        id = idParam;
        nombres = nombresParam;
        apellidos = apellidosParam;
        correo = correoParam;
        telefono = telefonoParam;
        edad = edadParam;
    }
    //public Estudiante(String id, String nombres, String apellidos, String correo, String telefono, int edad) {
    //        this.id = id;
    //        this.nombres = nombres;
    //        this.apellidos = apellidos;
    //        this.correo = correo;
    //        this.telefono = telefono;
    //        this.edad = edad;

    public void mostrarInformacion() {
        System.out.println("ID: " + id);
        System.out.println("Nombres: " + nombres);
        System.out.println("Apellidos: " + apellidos);
        System.out.println("Correo: " + correo);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Edad: " + edad);
    }
}

public class AplicacionEstudiante {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese ID del estudiante: ");
        String id = scanner.nextLine();

        System.out.print("Ingrese nombres: ");
        String nombres = scanner.nextLine();

        System.out.print("Ingrese apellidos: ");
        String apellidos = scanner.nextLine();

        System.out.print("Ingrese correo: ");
        String correo = scanner.nextLine();

        System.out.print("Ingrese teléfono: ");
        String telefono = scanner.nextLine();

        System.out.print("Ingrese edad: ");
        int edad = scanner.nextInt();

        Estudiante estudiante = new Estudiante(id, nombres, apellidos, correo, telefono, edad);

        System.out.println("\nInformación del estudiante:");
        estudiante.mostrarInformacion();

        scanner.close();
    }
}