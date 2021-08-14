package quiz2;

public class EquipoSonidoControlador {
    private EquipoSonido equipoSonido;
    private EquipoSonidoVista nv;
    
    public EquipoSonidoControlador(){
        equipoSonido = new EquipoSonido(0);
        nv = new EquipoSonidoVista(equipoSonido);
    }
    
    public void iniciar() {
        int op;
        do {
            op = nv.getOpcion();
            switch (op) {
                case 1:
                    if(equipoSonido.getArregloAudios().length==0){
                        int cant = vista.leaTamanoArreglo();
                        double[] elNuevoArreglo = new double[cant];
                        equipoSonido.setArregloAudios(elNuevoArreglo);
                    }
                    
                    nv.leaNota();
                    break;
                case 2:
                    vista.reproducirAudiosOrden();
                    break;
                    
                case 3:
                    vista.reproducirAudiosAleatorio();
                    break;
                    
                case 4:
                    equipoSonido.radio.reproducir();
                    break;
                default:
            }
        } while (op != 3);
    }
}
