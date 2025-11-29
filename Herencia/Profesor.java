public class Profesor extends Empleado {
    protected String departamento;

    public Profesor() {
        super();
    }

    public Profesor(String nombre, String apellidos, int anyoNacimiento, String numSeguridadSocial, String departamento) {
        super(nombre, apellidos, anyoNacimiento, numSeguridadSocial);
        this.departamento = departamento;
    }

    @Override
    public void imprime() {
        super.imprime();
        System.out.println("Departamento: " + departamento);
    }
}
