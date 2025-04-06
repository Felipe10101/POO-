package co.edu.uniquindio.poo.model;

public class Torneo {
    private String nombre;
    private String fechaInicio;
    private List<Equipo> listEquipos;

    public Torneo (String nombre, String fechaInicio) {
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.listEquipos = listEquipos;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getFechaInicio() {
        return fechaInicio;
    }
    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

}
