
package estacionamentojava;

import javax.swing.JOptionPane;


public class Estacionamentojava {

    
    public static void main(String[] args) {
        
        String modelo,placa;
        double ent,sai,vtotal,tempo;
        
      modelo = JOptionPane.showInputDialog("Informe o modelo: ");
      
      placa = JOptionPane.showInputDialog("Informe a placa: ");
        
      ent = Double.parseDouble(JOptionPane.showInputDialog("Informe a hora de entrada:"));
      
      sai = Double.parseDouble(JOptionPane.showInputDialog("Informe a hora de saida:")); 
      
      tempo = sai - ent;
      vtotal = Math.ceil(tempo)* 4 ;
      
      JOptionPane.showMessageDialog(null,"Modelo: " + modelo+"\nPlaca: " + placa+"\nEntrada: " + ent+ "\nSaída:" +sai + "\nTempo que ficou:" + tempo+
              "\nPagar: " +vtotal);
       
        
    }
    
}
