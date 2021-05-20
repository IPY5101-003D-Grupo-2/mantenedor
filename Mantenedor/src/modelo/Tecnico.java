package modelo;

public class Tecnico {

    private String run;
    private String email;
    private String HorarioTrabajo;
    private String nombre;
    private String apellido;
    private String fono;
    private String password;

    public Tecnico() {
        this.run = "no info";
        this.email = "no info";
        this.HorarioTrabajo = "no info";
        this.nombre = "no info";
        this.apellido = "no info";
        this.fono = "no info";
        this.password = "no info";
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

    public String getHorarioTrabajo() {
        return HorarioTrabajo;
    }

    public void setHorarioTrabajo(String HorarioTrabajo) {
        this.HorarioTrabajo = HorarioTrabajo;
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
        return "Tecnico{" + "run=" + run + ", email=" + email + ", HorarioTrabajo=" + HorarioTrabajo + ", nombre=" + nombre + ", apellido=" + apellido + ", fono=" + fono + ", password=" + password + '}';
    }

}
