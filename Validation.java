package neppo.ic;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

public class Validation {


    public String inputData(String msg, String msg2, int min, int max) {
        String dado = null;
        do {            
            dado = JOptionPane.showInputDialog(msg);
            if(dado.length() < min || dado.length() > max || dado == null || dado.equals("")){
                JOptionPane.showMessageDialog(null, msg2);
            }
        } while (dado.length() < min || dado.length() > max || dado == null || dado.equals(""));

        return dado;
    }
    public String inputDataEmail(String msg, int min, int max) {
        String dado;
        
            do {
                
               dado = JOptionPane.showInputDialog(msg); 
               if(dado.length() < min || dado.length() > max || !(dado.contains("@"))){
                   JOptionPane.showMessageDialog(null, "E-mail Incorreto!");
               }
            } while(dado.length() < min || dado.length() > max || !(dado.contains("@")));

        return dado;
    }
    

    public Integer inputDataInt(String msg, String msg2, int min, int max) {
        Integer dado;
        do {
            
            dado = Integer.parseInt(JOptionPane.showInputDialog(msg));
            if(dado < min || dado > max){
                JOptionPane.showMessageDialog(null, msg2);
            }
        } while (dado < min || dado > max);
        return dado;
    }
    
}


