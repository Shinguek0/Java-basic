package basico;

import java.util.Scanner;

public class Scannerutil {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String nome = "";
		
		int x = 0;
		while(x == 0) {
			System.out.println("Digite um nome: ");
			nome = in.nextLine();
			System.out.println(nome);
			if (nome.equals("wagner")) {
				x++;
			}
		}
		System.out.println("Sim, " +nome + " acerto!!");
		
		
	}
}