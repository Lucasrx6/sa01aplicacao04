package br.com.senaitagua.sa1.app4;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double valor1, valor2;
		
		valor1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de passageiros especiais"));
		valor2 = 5000/valor1;
		
		if(valor1 <= 0){
			JOptionPane.showMessageDialog(null, "Quantidade incorrento");
		}
		else if (valor1 > 17) {
			JOptionPane.showMessageDialog(null, "Quantidade incorrento");
		}
		
		else {
			JOptionPane.showMessageDialog(null, "O valor dividido para os passageiros especiais foi de "+ valor2 + " reais");
		}
	}

}
