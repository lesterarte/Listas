
package proyecto_listas;

public class Alumno {
    
    private String nombre, cuenta,carrera; 

    public Alumno(String nombre, String cuenta, String carrera) {
        this.nombre = nombre;
        this.cuenta = cuenta;
        this.carrera = carrera;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    
     
    
    
}
