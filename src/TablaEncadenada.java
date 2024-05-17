public class TablaEncadenada {
    private Elemento[] tabla;
    int M;
    double R = 0.618034;
    int numElementos;
    

    public TablaEncadenada() // constructor
    {
        this.M = 97;
        this.tabla = new Elemento[M];
        this.numElementos = 0;
        for (int k = 0; k < M; k++)
        tabla[k] = null;
    }

    int dispersion(long x) {
        double t;
        int v;
        t = R * x - Math.floor(R * x);
        v = (int) (M * t);
        return v;
    }

    public void insertar(TipoSocio s) {
        int posicion;
        Elemento nuevo;
        posicion = dispersion(s.getCodigo());
        nuevo = new Elemento(s);
        nuevo.sgte = tabla[posicion];
        tabla[posicion] = nuevo;
        numElementos++;
    }
    public void eliminar(int codigo){
      
        int posicion=dispersion(codigo);
        Elemento actual=tabla[posicion];
        Elemento anterior=null;
        
        if(tabla[posicion]!=null){
        while((actual.sgte!=null) && (actual.getSocio().getCodigo()!= codigo)){
        anterior=actual;
        actual=actual.sgte;
        }
             if (actual.getSocio().getCodigo()!= codigo){
             System.out.println("No se encuentra en la tabla el socio " + codigo);}
             else{
                if (anterior == null){ // primer nodo 
               tabla[posicion] = actual.sgte;
                }else{
                anterior.sgte=actual.sgte;
                }
                actual = null;
                 numElementos--;
                 System.out.println("Se elimino el socio " + codigo);
             }
             
             }
              else{
        System.out.println("No existe el socio " + codigo);
        }
                  { 
        }
      }
      

    public Elemento buscar(int codigo) {
        Elemento p = null;
        int posicion;
        posicion = dispersion(codigo);

        if (tabla[posicion] != null) {
            p = tabla[posicion];
            while ((p.sgte != null) && p.socio.codigo != codigo){
                p = p.sgte;
                }
            if (p.socio.codigo != codigo){
                p = null;
                }
        }

        return p;
    }

}
