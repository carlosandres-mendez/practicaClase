/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andres
 */
public class MisArtes {

    public static void main(String[] args) {
        //ABABABABABABABABA
        for (int i = 0; i < 15; i++) {
            //System.out.print("A");
            //System.out.print("B");
        }

        //ABABABABABABABABA
        boolean siEsPar = true;

        for (int i = 0; i < 30; i++) {
            if (siEsPar) {
                //System.out.print("A");
                siEsPar = false;
            } else {
                //System.out.print("B");
                siEsPar = true;
            }
        }
        
        
        /*
        A           i=0
        AA          i=1
        AAA         i=2
        AAAA        i=3
        AAAAA       i=4
         */
        for (int i = 0; i < 20; i++) {

            for (int j = 0; j < (i + 1); j++) {
                System.out.print("A");
            }
            System.out.println();
        }
        

        /*
        AAA           
        AAA           
        AAA  
         */
        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {
                System.out.print("A");
            }
            System.out.println();
        }



        
        //ABABABABABABABABA
        for (int i = 0; i < 15; i++) {
            System.out.print("A");
            System.out.print("B");
        }

        int i = 0;
        while (i < 15) {
            System.out.print("A");
            System.out.print("B");
            i++;
        }

        
        
        
        /*
        AAA  i = 0         
        AAA  i = 1         
        AAA  i = 2
         */
        for (int k = 0; k < 3; k++) {

            for (int j = 0; j < 3; j++) {
                System.out.print("A");
            }
            System.out.println();
        }

        int k = 0;
        while (k < 3) {
            for (int j = 0; j < 3; j++) {
                System.out.print("A");
            }
            System.out.println();
            k++;
        }

        int p = 0;
        while (p < 3) {
            int j = 0;
            while (j < 3) {
                System.out.print("A");
                j++;
            }
            System.out.println();
            p++;
        }

        
        
        
        
        
       /* 
        for (int p = 0; p < 7; p++) {

            for (int j = 0; j < 7; j++) {
                if(p==j || p==6)
                    System.out.print("*");
                else 
                    System.out.print(" ");
            }
            
            System.out.println();
        }*/
    }
}
