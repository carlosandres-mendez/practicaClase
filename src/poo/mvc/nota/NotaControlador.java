package poo.mvc.nota;


public class NotaControlador{ 
    int variablePrueba;
  
    public void iniciar(){
     Nota nota = new Nota(2);
     NotaVista nv = new NotaVista (nota);
     int op;
     do {
       op = nv.getOpcion();
       switch (op){
         case 1: nv.leaNota();
         break;
         case 2: nv.muestreNotas();
         break;
         default:
       }
     }while (op != 3);
  }
}