
package Models;

public class Solicitud {
    private int piso;
    private String direccion;

    public int getPiso() {
        return piso;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Solicitud(int piso, String direccion) {
        this.piso = piso;
        this.direccion = direccion;
    }
    
    
}
