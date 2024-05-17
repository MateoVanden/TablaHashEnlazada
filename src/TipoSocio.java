public class TipoSocio {
    class Fecha {
        int dia;
        int mes;
        int anno;

        Fecha(int d, int m, int a) {
            dia = d;
            mes = m;
            anno = a;
        }

        public String toString() {
            return " " + dia + "-" + mes + "-" + anno;
        }
    };

    int codigo;
    private String nombre;
    private int edad;
    Fecha f;

    public TipoSocio(String nombre, int codigo, int edad, int d, int m, int a) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.edad = edad;
        f = new Fecha(d, m, a);
    }

    public int getCodigo() {
        return codigo;
    }

    public void muestra(){
        System.out.println("\n Nombre: " + nombre +  "Codigo: " + codigo+ "edad: " + edad +"Fecha: " + f);
    }
}
