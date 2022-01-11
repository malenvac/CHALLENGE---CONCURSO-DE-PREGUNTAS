package Entidades;

public class Jugador {
    //
    private Integer id;
    private String nombre;
    private int acumuladoPremio;

    // constructor
    public Jugador() {
    }

    public Jugador(Integer id, String nombre, int acumuladoPremio) {
        this.id = id;
        this.nombre = nombre;
        this.acumuladoPremio = acumuladoPremio;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAcumuladoPremio() {
        return acumuladoPremio;
    }

    public void setAcumuladoPremio(int acumuladoPremio) {
        this.acumuladoPremio = acumuladoPremio;
    }


}