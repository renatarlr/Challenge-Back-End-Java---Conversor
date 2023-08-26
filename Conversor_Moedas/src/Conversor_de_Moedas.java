import javax.swing.JOptionPane;


public class Conversor_de_Moedas {

	public static void main(String[] args) {  
	  while (true) {
	
		String moeda;
		moeda = JOptionPane.showInputDialog ("Escolha a opção de conversão desejada:"
				+ "\n1 Dolar"
				+ "\n2 Euro"
				+ "\n3 Libra Esterlina"
				+ "\n4 Iene"
				+ "\n5 Peso Argentino ");	
		
		int opcao;
		opcao = Integer.parseInt(moeda);
		
		if(opcao == 1) {
			String valor;
			valor = JOptionPane.showInputDialog("Digite o valor em reais que deseja converter");
			double valorReal = Double.parseDouble(valor);
			final double dolar = 4.900;
			double valorConvertido = valorReal / dolar;
			valorConvertido=(double) Math.round(valorConvertido * 100d) / 100;
			String msg;
			msg= "O valor em Dolar é: " + valorConvertido;
			JOptionPane.showMessageDialog(null, msg);
			int resposta = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
            if (JOptionPane.OK_OPTION == resposta) {
            } else {
                JOptionPane.showMessageDialog(null, "Programa finalizado");
                break;
              }
			
        }
        
		if(opcao == 2) {
			String valor;
			valor = JOptionPane.showInputDialog("Digite o valor em reais que deseja converter");
			double valorReal = Double.parseDouble(valor);
			final double euro = 5.380;
			double valorConvertido = valorReal / euro;
			valorConvertido=(double) Math.round(valorConvertido * 100d) / 100;
			String msg;
			msg= "O valor em Euro é: " + valorConvertido;
			JOptionPane.showMessageDialog(null, msg);
			int resposta = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
            if (JOptionPane.OK_OPTION == resposta) {
            } else {
                JOptionPane.showMessageDialog(null, "Programa finalizado");
                break;
              }
	   }
		
		if(opcao == 3) {
			String valor;
			valor = JOptionPane.showInputDialog("Digite o valor em reais que deseja converter");
			double valorReal = Double.parseDouble(valor);
			final double libra = 6.240;
			double valorConvertido = valorReal / libra;
			valorConvertido=(double) Math.round(valorConvertido * 100d) / 100;
			String msg;
			msg= "O valor em Libra Esterlina é: " + valorConvertido;
			JOptionPane.showMessageDialog(null, msg);
			int resposta = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
            if (JOptionPane.OK_OPTION == resposta) {

            } else {
                JOptionPane.showMessageDialog(null, "Programa finalizado");
                break;
              }
		}
		
		if(opcao == 4) {
			String valor;
			valor = JOptionPane.showInputDialog("Digite o valor em reais que deseja converter");
			double valorReal = Double.parseDouble(valor);
			final double iene = 0.034;
			double valorConvertido = valorReal / iene;
			valorConvertido=(double) Math.round(valorConvertido * 100d) / 100;
			String msg;
			msg= "O valor em Iene é: " + valorConvertido;
			JOptionPane.showMessageDialog(null, msg);
			int resposta = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
            if (JOptionPane.OK_OPTION == resposta) {

            } else {
                JOptionPane.showMessageDialog(null, "Programa finalizado");
                break;
            }
		}
		
		if(opcao == 5) {
			String valor;
			valor = JOptionPane.showInputDialog("Digite o valor em reais que deseja converter");
			double valorReal = Double.parseDouble(valor);
			final double peso = 0.017;
			double valorConvertido = valorReal / peso;
			valorConvertido=(double) Math.round(valorConvertido * 100d) / 100;
			String msg;
			msg= "O valor em Peso Argentino é: " + valorConvertido;
			JOptionPane.showMessageDialog(null, msg);
			 int resposta = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
             if (JOptionPane.OK_OPTION == resposta) {

             } else {
                 JOptionPane.showMessageDialog(null, "Programa finalizado");
                 break;
              }
	    }
	  }  
    }
	public static boolean checar(String input) {
        try {
            double x = Double.parseDouble(input);
            if (x >= 0 || x < 0) ;
            return true;
           } catch (NumberFormatException e) {
              return false;
             }
        }
	}

	
	

	


