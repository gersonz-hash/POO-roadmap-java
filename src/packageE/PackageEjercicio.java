package packageE;

public class PackageEjercicio {

    public static void ejecutar() {

        System.out.println("--------Ejercicio 1: contar paquete-----------");

        Package[] paquetes = Package.getPackages();
        int contador = 0;

        for (Package pkg : paquetes) {
            if(pkg.getName().contains("typeCasting") ||
               pkg.getName().contains("classesAndObjects") ||
               pkg.getName().contains("packageE") ||
               pkg.getName().contains("claseMain")) {

                System.out.println("Paquete: " + pkg.getName());
                contador++;
            }
        }

        System.out.println("Total de paquetes: " + contador);

        // ✅ EJERCICIO 2
        System.out.println("---------Ejercicio 2: Buscar paquete-----------");

        String buscar = "classesAndObjects";
        boolean encontrado = false;

        for (Package pkg : paquetes) {
            if (pkg.getName().contains(buscar)) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("El paquete " + buscar + " SI existe");
        } else {
            System.out.println("El paquete " + buscar + " NO existe");
        }
    }
}


