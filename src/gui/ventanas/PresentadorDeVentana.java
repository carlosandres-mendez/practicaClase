import javax.swing.JFrame; // Hay que incluir la clase JFrame
public class PresentadorDeVentana {

   public static void main(String argv[]){
      // Se crea una ventana con el titulo especifico
      JFrame ventana = new JFrame("VENTANA PARA GRAFICAR");
      // Se asigna el tamaño que tendrá al desplegar por primera vez
      // definiento el ancho y su altura
      ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      ventana.setSize(400,600);
      ventana.setVisible(true);
   }
}