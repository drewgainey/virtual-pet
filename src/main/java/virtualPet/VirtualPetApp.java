package virtualPet;

import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) throws InterruptedException {

		Scanner input = new Scanner(System.in);

		System.out.println("Welcome to Virtual Pet!!!");
		Thread.sleep(2000);
		System.out.println("Now is time to name your new pet!");
		System.out.println("Please enter their name");
		String name = input.nextLine();
		Thread.sleep(2000);
		System.out.println(
				"           ____,'`-, \r\n      _,--'   ,/::.; \r\n   ,-'       ,/::,' `---.___        ___,_ \r\n  "
						+ " |       ,:';:/        ;'\"`;\"`--./ ,-^.;--. \r\n   |:     ,:';,'         '         `.   ;`   `-. \r\n   "
						+ " \\:.,:::/;/ -:.                   `  | `     `-. \r\n     \\:::,'//__.;  ,;  ,  ,  :.`-.   :. |  ;       :."
						+ " \r\n      \\,',';/O)^. :'  ;  :   '__` `  :::`.       .:' ) \r\n      |,'  |\\__,: ;      ;  '/O)`.   :::`; "
						+ "      ' ,' \r\n           |`--''            \\__,' , ::::(       ,' \r\n           `    ,            `--' ,: "
						+ ":::,'\\   ,-' \r\n            | ,;         ,    ,::'  ,:::   |,' \r\n            |,:        .(          ,:::| "
						+ "  ` \r\n            ::'_   _   ::         ,::/:| \r\n           ,',' `-' \\   `.      ,:::/,:| \r\n          | "
						+ ": _  _   |   '     ,::,' ::: \r\n          | \\ O`'O  ,',   ,    :,'   ;:: \r\n           \\ `-'`--',:' ,' , ,,'"
						+ "      :: \r\n            ``:.:.__   ',-','        ::' \r\n               `--.__, ,::.         ::' \r\n    "
						+ "               |:  ::::.       ::' \r\n                   |:  ::::::    ,::' ");
		System.out.println("Hello " + name);
		Pet myPet = new Pet(50, 50, 50, 50, 50);
		while (true) {
			System.out.println("Here is " + name + "'s current need levels");
			System.out.println("Thirst:" + myPet.getThirst());
			System.out.println("Hunger:" + myPet.getHunger());
			System.out.println("Waste:" + myPet.getWaste());
			System.out.println("Boredom:" + myPet.getBoredom());
			System.out.println("Energy:" + myPet.getEnergy());
			System.out.println("");
			System.out.println("What would you like to do with " + name + "?");
			System.out.println("");
			System.out.println("1: Feed them");
			System.out.println("2: Play with them");
			System.out.println("3: Let them sleep");
			System.out.println("4: Drink a Mojito");
			System.out.println("5: Let them anwser natures call");

			int choice = input.nextInt();
			if (choice == 1) {
				myPet.feed();
			} else if (choice == 2) {
				myPet.play();
			} else if (choice == 3) {
				myPet.sleep();
			} else if (choice == 4) {
				myPet.drink();
			} else {
				myPet.bathroom();
			}
			myPet.tick(10);

		}
	}
}
