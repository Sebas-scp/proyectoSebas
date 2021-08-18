package Proyecto6;

public class NotaControlador {
    private Nota nota;
    private SistemaNotasInterfaz nv;
    boolean modoGrafico=true;
    
    public NotaControlador(){
        nota = new Nota(0);
        nv = new SistemaNotasInterfaz(nota,modoGrafico);
    }
    
    public void iniciar() {
        int op;
        do {
            op = nv.getOpcion();
            switch (op) {
                case 1:
                    if(nota.getArregloNotas().length==0){
                        int cant = nv.leaTamanoArreglo();
                        double[] elNuevoArreglo = new double[cant];
                        nota.setArregloNotas(elNuevoArreglo);
                    }
                    
                    nv.leaNota();
                    break;
                case 2:
                    nv.muestreNotas();
                    break;
                default:
            }
        } while (op != 3);
    }
}
