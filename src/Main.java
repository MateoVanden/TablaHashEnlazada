import java.util.Scanner;

//Clase Main
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int op;
        TablaEncadenada tablaEncadenada = new TablaEncadenada();
        do {
            System.out.println("MENU DE SOCIOS: ");
            System.out.println("1. Agregar un socio: ");
            System.out.println("2.Buscar un socio: ");
            System.out.println("3.Eliminar un socio: ");
            System.out.println("4.Salir: ");
            op = scanner.nextInt();
            switch (op){
                case 1:
                    System.out.println("Ingrese los datos del socio: ");
                    System.out.println("Codigo de socio: ");
                    int codigo = scanner.nextInt();
                    scanner.nextLine();
                    while(codigo<0){
                        System.out.println("El numero del socio tiene que ser mayor a 0: ");
                        codigo = scanner.nextInt();
                        scanner.nextLine();
                    }
                    System.out.println("Ingrese el nombre del socio: ");
                    String nombreSocio= scanner.nextLine();
                    System.out.println("Ingrese la edad del socio: ");
                    int edadSocio = scanner.nextInt();
                    while(edadSocio<0){
                        System.out.println("Edad incorrecta, vuelva a ingresarla: ");
                        edadSocio = scanner.nextInt();;
                        scanner.nextLine();
                    }
                    System.out.println("Ingrese la fecha actual, con dia, mes y año: ");
                    int d = scanner.nextInt();
                    int m = scanner.nextInt();
                    int a = scanner.nextInt();

                    TipoSocio socioNuevo = new TipoSocio(nombreSocio,codigo,edadSocio,d,m,a);
                    tablaEncadenada.insertar(socioNuevo);
                    System.out.println("Socio ingresado");
                    socioNuevo.muestra();
                break;
                case 2:
                    System.out.println("Ingrese el codigo del socio que desea buscar: ");
                    int numero = scanner.nextInt();
                    scanner.nextLine();

                    Elemento buscarSocio = tablaEncadenada.buscar(numero);
                    if(tablaEncadenada.buscar(numero)!=null){
                        System.out.println("Socio: "+buscarSocio.getSocio().getNombre());
                        System.out.println("Edad: "+buscarSocio.getSocio().getEdad());
                    }else{
                        System.out.println("No se encontro el codigo ingresado: "+ numero);
                    }
                    break;
                case 3:
                    System.out.println("Ingrese el codigo del socio que desea eliminar: ");
                    int num = scanner.nextInt();
                    scanner.nextLine();

                    tablaEncadenada.eliminar(num);
                    break;
                case 4:
                    System.out.println("Muchas gracias por usar el programa ");
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }
        }while (op!=4);
    }
}
