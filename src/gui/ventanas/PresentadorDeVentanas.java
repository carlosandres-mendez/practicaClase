import javax.swing.JFrame;
public class PresentadorDeVentanas{
   public static void main(String argv[]){
     
      // Se crea una ventana con el titulo especifico
      JFrame ventanaPrincipal = new JFrame("VENTANA PRINCIPAL");
      JFrame ventanaSecundaria = new JFrame("VENTANA SECUNDARIA");
      ventanaPrincipal.setBounds(430,400,200,200);
      
      // La siguiente instrucción indica que al cerrar esta ventana
      // el programa finalizará de forma similar a como lo hace
      // el System.exit(0)
      ventanaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      ventanaSecundaria.setBounds(235,205,250,100);
      ventanaPrincipal.setVisible(true);
      ventanaSecundaria.setVisible(true);
      // Note que las dos ventanas aparecen a la vez
   }
}