package co.edu.uniquindio.poo;

public class Nino {
    private String nombre;
    private int edad;
    private char genero;
    private String documento;
    private String alergias;
    private String nombreAcudiente;
    private String numeroContacto;

        public Nino(String nombre, int edad, char genero, String documento, String alergias, String nombreAcudiente, String numeroAcudiente){
            this.nombre = nombre;
            this.edad = edad;
            this.genero = genero;
            this.documento = documento;
            this.alergias = alergias;
            this.nombreAcudiente = nombreAcudiente;
            this.numeroContacto = numeroAcudiente;
        }

    @Override
    public String toString() {
        return "Nino{" +
                "nombre ='" + nombre + '\'' +
                "edad ='" + edad + '\'' +
                "genero ='" + genero + '\'' +
                "documento ='" + documento + '\'' +
                "alergias ='" + alergias + '\'' +
                "nombreAcudiente ='" + nombreAcudiente + '\'' +
                "numeroAcudiente ='" + numeroContacto + '\'' +
                '}';
    }
}