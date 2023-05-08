/*
 RESUMO		 : Construção dos comandos paraa união e intersecção das listas
 PROGRAMADORA: Luiza Felix
 DATA		 : 07/05/2023
 */

package controller;

import br.edu.fateczl.listas.Lista;
import br.edu.fateczl.pilhas.Pilha;

public class Controller {

	private static Lista a = new Lista(), b = new Lista() ;
	private static Lista u = new Lista(), i = new Lista() ;
	
	
	public Controller() {
		super();
	}
	
	public static void loadlistas() {
//		segundo os dados que foram requisitados no enunciado
		int[] veta = {16, 7, 9, 12, 8, 5, 3};
		int[] vetb = {7, 3, 2, 6, 9};
		for(int dado : veta) {
			a.addfirst(dado);
		}
		for(int dado : vetb) {
			b.addfirst(dado);
		}
		
		System.out.println("As listas foram carregadas!\n\tA: " + a.toString() + "\n\tB: " + b.toString());
	}

	public static void interseccao() throws Exception {
		Pilha aux = new Pilha();
		int zb = b.size(), za = a.size();
		
		for(int ia = 0; ia <za; ia++) {
			for (int ib = 0; ib <zb; ib++) {
				if(b.get(ib).equals(a.get(ia))){
					aux.push(b.get(ib));
					a.remove(ia);
					b.remove(ib);
					
					zb = b.size();
					za = a.size();
				}	
			}
		}
		while(!aux.vazia()) {
			i.addfirst(aux.pop());
		}
		
		System.out.println("A lista de interseccao foi carregada!\n\tI: " + i.toString());
	}
	
	public static void uniao() {
		
		onion(i);
		onion(b);
		onion(a);
		
		System.out.println("A lista de uniao foi carregada!\n\tU: " + u.toString());
		
	}
	
	private static void onion(Lista lista) {
		
		Pilha aux = new Pilha();
		int size = lista.size();
		
		for(int i=0; i<size;i++){	
			try {
				aux.push(lista.get(i));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		while(!aux.vazia()) {
			try {
				u.addfirst(aux.pop());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
			

}
