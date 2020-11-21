public class VariosEjemplos{

  public static void main (String []args){
    String s = "hola";
    String s1 = "hola";
    String s2 = s1;
    
     if (s1.equals(s2)){
      System.out.println("s1 y s2 son iguales");
    }else{
      System.out.println("s1 y s2 NO son iguales");
    }
    
    
    if (s.equals(s1)){
      System.out.println("s y s1 son iguales");
    }else{
      System.out.println("s y s1 NO son iguales");
    }
    
    /////////////////////REEMPLAZAR///////////////////////
    String s3 = s2.replace('h', 'b');
    
    System.out.println("s1 es " + s1);
    System.out.println("s2 es " + s2);
    System.out.println("s3 es " + s3);  
    
    ////////////////////CONSTRUCTORES//////////////////////
    
    char []arreglo = {' ','h',' ','o',' ','l',' ','a',' ','!',' '};
    String s4 = new String(arreglo);
    
    System.out.println("s4 es \"" + s4 + "\" de tamano " + s4.length());  
    
    ////////////////////TRIM//////////////////////
    
    String s5 = s4.trim();
    System.out.println("s5 es \"" + s5 + "\" de tamano " + s5.length());  
    
    ////////////////////SUBSTRING//////////////////////
    
    String s6 = s.substring(0,2);
    System.out.println("s6 es \"" + s6 + "\" de tamano " + s6.length());  
    
    ////////////////////EQUALS IGNORE CASE//////////////////////
    
    String s7 = "HOLA";
    if (s7.equalsIgnoreCase(s)){
      System.out.println("s7 dice lo mismo que s: " + s + " y " + s7); 
    }else{
      System.out.println("s7 dice lo mismo que s: " + s + " y " + s7); 
    }
    
    ////////////////////EMPIEZA y TERMINA CON//////////////////////
    
     s7 = "hola";
    if (s7.startsWith("ho")){
      System.out.println("s7 empieza con ho"); 
    }
    if (s7.endsWith("ola")){
      System.out.println("s7 termina con la"); 
    }
              
    ////////////////////MAYUSCULAS Y MINUSCULAS//////////////////////          
    
    System.out.println("s7 a minusculas es " + s7.toLowerCase());
    System.out.println("s7 a mayusculas es " + s7.toUpperCase());
              
    ////////////////////SPLIT//////////////////////  
              
    String s8 = "dividir-estas-palabras";
              
    String division[] = s8.split("-");
                
    for (int i = 0; i < division.length; i++){
      System.out.println(i + " " + division[i]);
    }
    
  }
}