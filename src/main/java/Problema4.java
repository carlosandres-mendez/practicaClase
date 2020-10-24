/**
 *
 * @author carlosandres.mendez
 */
//   Determina si un año es biciesto o no
public class Problema4 {
    
    public static boolean biciesto(int anno){
        boolean resultado = false;
        boolean cond1= false, cond2= false, cond3= false;
        
        double residuo = anno % 4;
        if(residuo==0){
            cond1=true;
        }
        
        residuo = anno % 100;
        if(residuo==0){
            cond2=true;
        }
        
        residuo = anno % 400;
        if(residuo==0){
            cond3=true;
        }
        
        if(cond1 && (!cond2 || cond3))
            resultado=true;
        return resultado;
    }
    
    public static void main(String[] args) {
        System.out.println("2016: "+biciesto(2016)); 
        System.out.println("2017: "+biciesto(2017));
        System.out.println("2018: "+biciesto(2018));
        System.out.println("2019: "+biciesto(2019));
        System.out.println("2020: "+biciesto(2020));
    }
}
