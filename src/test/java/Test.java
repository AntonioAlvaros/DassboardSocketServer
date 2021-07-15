
import java.io.IOException;
import java.sql.Timestamp;
import java.util.Calendar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author usuario
 */
public class Test {
    
      public static void main(String[] args) throws IOException {
  
          
          
          
      }
      
      
      public static Float convertAmount(String val) {
        char char0 = '0';
        String decimalValue = val.substring(val.length() - 2, val.length());
        String enterValue = val.substring(0, val.length() - 2);
        String finalenterValue = "";
        for (int i = 0; i <= enterValue.length(); i++) {
            if (enterValue.charAt(i) == char0) {
                continue;
            } else {
                finalenterValue = enterValue.substring(i, enterValue.length());
              
                 break;
                
            }
           
        }
        return Float.valueOf(finalenterValue + "." + decimalValue);
    }
      
    
}
