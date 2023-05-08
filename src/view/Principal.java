/*
 RESUMO		 : Execução da matemática discreta das listas
 PROGRAMADORA: Luiza Felix
 DATA		 : 07/05/2023
 */

package view;

import javax.swing.JOptionPane;

import controller.Controller;

public class Principal {

	public static void main(String[] args) {
		int opcao = 0;
		do {
			opcao = Integer.parseInt(JOptionPane.showInputDialog("1. Carregar as listas\n2. Apresentar a lista de intersecção\n3. Apresentar a lista de união\nPara SAIR digite 0;"));
			
			switch(opcao) {
			case 1:
				Controller.loadlistas();
				break;
			case 2:
				try {
					Controller.interseccao();
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;
			case 3:
				try {
					Controller.uniao();;
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;
			case 0:
				System.out.println("Programa finalizado com sucesso!");
			}
		}	while(opcao!=0);

	}
}
