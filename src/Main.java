public class Main {
    public static void main(String[] args) throws Exception {
        TablaEncadenada tablaEncadenada = new TablaEncadenada();

        TipoSocio socio1 = new TipoSocio("Mateo", 300, 21, 22, 9, 2004);
        TipoSocio socio2 = new TipoSocio("Samuel", 250, 20, 11, 6, 2004);
        TipoSocio socio3 = new TipoSocio("Agustin", 451, 54, 15, 07, 1970);

        tablaEncadenada.insertar(socio2);
        tablaEncadenada.insertar(socio1);
        tablaEncadenada.insertar(socio3);

        tablaEncadenada.eliminar(250);
        tablaEncadenada.eliminar(600);

        tablaEncadenada.buscar(250);

        socio1.muestra();
        socio2.muestra();
        socio3.muestra();
    }
}
