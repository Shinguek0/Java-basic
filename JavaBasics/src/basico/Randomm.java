package basico;

import java.util.Random;

public class Randomm {

	public static void main(String[] args) {
		Random rand = new Random();
		int x = 100;
		// porcentagen de acerto
		if (rand.nextInt(100) < 50) {
			System.out.println("sim");
		}else {
			System.out.println("nao");
		}
		
		//numero aleatorio
		for (int i = 0; i < 100; i++) {
		System.out.println(rand.nextInt(x));
		}

	}
	
}
