public class Bedel extends Empleado {
    protected String zonaAsignada;

    public Bedel() {
        super();
    }

    public Bedel(String nombre, String apellidos, int anyoNacimiento, String numSeguridadSocial, String zonaAsignada) {
        super(nombre, apellidos, anyoNacimiento, numSeguridadSocial);
        this.zonaAsignada = zonaAsignada;
    }

    @Override
    public void imprime() {
        super.imprime();
        System.out.println("Zona Asignada: " + zonaAsignada);
    }
}
