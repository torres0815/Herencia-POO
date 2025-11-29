public class Empleado extends Persona {
    protected String numSeguridadSocial;

    public Empleado() {
        super();
    }

    public Empleado(String nombre, String apellidos, int anyoNacimiento, String numSeguridadSocial) {
        super(nombre, apellidos, anyoNacimiento);
        this.numSeguridadSocial = numSeguridadSocial;
    }

    @Override
    public void imprime() {
        super.imprime();
        System.out.println("Numero de Seguridad Social: " + numSeguridadSocial);
    }
}
