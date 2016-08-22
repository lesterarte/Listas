
package proyecto_listas;

public class Notas {
   private String cuenta; 
   private double nota;

    public Notas(String cuenta, double nota) {
        this.cuenta = cuenta;
        this.nota = nota;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Notas{" + "cuenta=" + cuenta + ", nota=" + nota + '}';
    }
   
    
}
