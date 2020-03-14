 
public class Ciudadano {

    private String nombre;
    private int edad;
    private int anios_exp;

    public Ciudadano(){
    }

    public Ciudadano(String nombre, int edad, int anios_exp){
        this.nombre = nombre;
        this.edad = edad;
        this.anios_exp = anios_exp;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getAnios_exp() {
        return anios_exp;
    }

    public void setAnios_exp(int anios_exp) {
        this.anios_exp = anios_exp;
    }
}
