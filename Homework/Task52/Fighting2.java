import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

public class Fighting2 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String [] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
					
		System.out.println("Enter player 1 name");
		String name = sc.nextLine();
		Player p1 = new HumanPlayer(name);
		// режим
		System.out.println("Enter game mode:");
		Class<Player> ec = (Class<Player>) Class.forName("DummyBot");
		Player p2 = ec.getDeclaredConstructor(String.class).newInstance("DummyBot");
		while (p1.isAlive() && p2.isAlive()) {
			
			System.out.print(p1.getName() + " turn>");
			p1.kick(p2);
			
			// Поменяй местами для следующего шага
			
			Player p = p1;
			p1 = p2;
			p2 = p;
			
			System.out.println();
						
		}
	}
}