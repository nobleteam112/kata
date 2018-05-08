
package codekata;

/**
 *
 * @author rabaj
 */
public class Solucion {
    
    public String lectura (int x) {
        switch (x) {
            case 1: return "uno";
            case 2: return "dos";
            case 3: return "tres";
            case 4: return "cuatro";
            case 5: return "cinco";
            case 6: return "seis";
            case 7: return "siete";
            case 8: return "ocho";
            case 9: return "nueve";
            case 10: return "diez";
            case 11: return "once";
            case 12: return "doce";
            case 13: return "trece";
            case 14: return "catorce";
            case 15: return "quince";
            case 16: return "dieciseis";
            case 17: return "diecisiete";
            case 18: return "dieciocho";
            case 19: return "diecinueve";
            case 20: return "veinte";
            case 30: return "treinta";
            case 40: return "cuarenta";
            case 50: return "cincuenta";
            case 60: return "sesenta";
            case 70: return "setenta";
            case 80: return "ocheta";
            case 90: return "noventa";
            case 100: return "cien";
            case 1000: return "mil";           
        }
       
      for (int i = 1; i <= 9; i ++){
         int j = i * 10;
            if ((x >= j) && (x < j + 10)){
                int r = x - j;
                return lectura(j) + (r > 0 ? (" y " + lectura(r)): "");  
            }
        }
       
      for (int i = 1; i <= 9; i ++){
         int j = i * 100;
            if ((x >= j) && (x < j + 100)){
                int r = x - j;
                return lectura(i) + " cientos" + (r > 0 ? (" " + lectura(r)): "");  
            }
        }
       
      for (int i = 1; i <= 9; i ++){
         int j = i * 1000;
            if ((x >= j) && (x < j + 1000)){
                int r = x - j;
                return lectura(i) + " mil" + (r > 0 ? (" " + lectura(r)): "");       
            }               
        }
    
       String output = "";
       int cnt = 0;
       while ( x > 0){
           int y = x % 1000;
           x /= 1000;
           if ( y > 0 ) {
               String t = "";
               if (cnt == 1) t = "mil";
               output = lectura(y) + t + output;
           }
           cnt ++;
       }
      if ((output.length() - 1) == ' ') {
        return output.substring(0, output.length() - 1);
    }
      System.out.println(output);
      return (output);
      
}
    String numeroALetra (int num){
        return lectura(num);
    }
}
