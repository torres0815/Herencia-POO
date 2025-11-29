public class Prueba {
    public static void main (String[] args){
        // 1. Crear instancias de todas las clases
        Persona vecina = new Persona ("Luisa", "Asenjo Martínez", 1978);
        Alumno unAlumno = new Alumno ("Juan", "Ugarte López", 1985);
        unAlumno.ponGrupo("66", 'M'); // Asignar grupo al alumno

        Empleado unEmpleado = new Empleado("Carlos", "Ruiz Pérez", 1980, "1234567890");

        Profesor unProfesor = new Profesor("Ana", "García López", 1975, "0987654321", "Matemáticas");

        Bedel unBedel = new Bedel("Miguel", "Sánchez Gil", 1968, "1122334455", "Edificio Principal");

        // 2. Imprimir una lista con los datos completos de cada instancia
        System.out.println("--- LISTA DE PERSONAS Y EMPLEADOS ---");
        
        System.out.println("\n--- Persona (Vecina) ---");
        vecina.imprime();

        System.out.println("\n--- Alumno (Juan) ---");
        unAlumno.imprime();
        unAlumno.imprimeGrupo();

        System.out.println("\n--- Empleado (Carlos) ---");
        unEmpleado.imprime();

        System.out.println("\n--- Profesor (Ana) ---");
        unProfesor.imprime();

        System.out.println("\n--- Bedel (Miguel) ---");
        unBedel.imprime();
    }
}
