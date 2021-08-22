package basico;

public class SwitchCase {

	public static void main(String[] args) {
		int vida = 100;
		
		for (int i =0; i < 100; i++) {
		switch(vida) {
			case 90:
				System.out.println(vida + " noventa");
				break;
			case 50:
				System.out.println(vida+ " cinquenta");
				break;
			default:
				System.out.println(vida);
				break;
			}
		vida--;
		}

	}

}
