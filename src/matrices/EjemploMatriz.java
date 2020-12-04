package matrices;

/**
 *
 * @author carlosandres.mendez
 */
public class EjemploMatriz {
    public static void main(String args[]){ 
        
        int[][] arreglo = new int[4][4];
        
        arreglo[2][0]=2;
        arreglo[2][1]=3;
        arreglo[2][2]=3;
        arreglo[2][3]=1;
        
        int[][] arreglo2 = {{2,3,6,0}, {2,8,9,1}, {0,3,3,1}, {6,3,4,1}};
        
        arreglo2[2][0]=7;
        arreglo2[2][2]=5;
        
        for(int k=0;k<arreglo.length;k++){
            for(int i=0;i<arreglo[k].length;i++){
                arreglo[k][i]=1;
            }
        }
        
        for(int k=0;k<arreglo.length;k++){
            for(int i=0;i<arreglo[k].length;i++){
                System.out.print(arreglo[k][i]);
            }
            System.out.println();
        }
        
    }
}
