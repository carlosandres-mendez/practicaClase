package nota;


public class Nota_C{ 
    int variablePrueba;
  
    public void iniciar(){
     Nota objetoProgramaNota = new Nota(2);
     Nota_V nv = new Nota_V (objetoProgramaNota);
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