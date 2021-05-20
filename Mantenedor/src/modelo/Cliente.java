package modelo;

public class Cliente {

    private String run;
    private String email;
    private String direccion;
    private String nombre;
    private String apellido;
    private String fono;
    private String password;

    public Cliente() {
        this.run = "No info";
        this.email = "No info";
        this.direccion = "No info";
        this.nombre = "No info";
        this.apellido = "No info";
        this.fono = "No info";
        this.password = "No info";
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRun() {
        return run;
    }

    public void setRun(String run) {
        this.run = run;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getFono() {
        return fono;
    }

    public void setFono(String fono) {
        this.fono = fono;
    }

    @Override
    public String toString() {
        return "Cliente{" + "run=" + run + ", email=" + email + ", direccion=" + direccion + ", nombre=" + nombre + ", apellido=" + apellido + ", fono=" + fono + ", password=" + password + '}';
    }

}
