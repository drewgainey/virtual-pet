package virtualPet;

public class Pet {

	private int thirst;
	private int hunger;
	private int waste;
	private int boredom;
	private int energy;

	public Pet(int thirst, int hunger, int waste, int boredom, int energy) {
		this.thirst = thirst;
		this.hunger = hunger;
		this.waste = waste;
		this.boredom = boredom;
		this.energy = energy;

	}

	public int getThirst() {
		return thirst;
	}

	public int getHunger() {
		return hunger;
	}

	public int getWaste() {
		return waste;
	}

	public int getBoredom() {
		return boredom;
	}

	public int getEnergy() {
		return energy;
	}

	public void tick(int time) {
		thirst = thirst + time;
		hunger = hunger + time;
		waste = waste + time;
		boredom = boredom + time;
		energy = energy + time;
	}

	public void feed() {
		if (energy < 100) {
			hunger = 0;
			thirst = thirst + 10;
			waste = waste + 10;
		} else {
			System.out.println("Your Pet Needs to Sleep!");
			System.out.println("They are refusing to do anything untill they sleep");
			System.out.println("");
		}
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
	}

	public void play() {
		if (energy < 100) {
			boredom = 0;
			hunger = hunger + 10;
			energy = energy + 10;
		} else {
			System.out.println("Your Pet Needs to Sleep!");
			System.out.println("They are refusing to do anything untill they sleep");
			System.out.println("");
		}
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
	}

	public void sleep() {
		energy = 0;
		hunger = hunger + 10;
		thirst = thirst + 10;
		System.out.println("               _");
		System.out.println("             ,/A\\,");
		System.out.println("           .//`_`\\\\,");
		System.out.println("         ,//`____-`\\\\,");
		System.out.println("       ,//`[_ROVER_]`\\\\,");
		System.out.println("     ,//`=  ==  __-  _`\\\\,");
		System.out.println("    //|__=  __- == _  __|\\\\");
		System.out.println("    ` |  __ .-----.  _  | `");
		System.out.println("      | - _/       \\-   |");
		System.out.println("      |__  | .---. | __=|");
		System.out.println("      |  _=|/)   (\\|    |");
		System.out.println("      |-__ (/ a a \\) -__|");
		System.out.println("      |___ /`\\_Y_/`\\____|");
		System.out.println("           \\)8===8(/");
	}

	public void drink() {
		if (energy < 100) {
			thirst = 0;
			System.out.println("                ______    ____ ");
			System.out.println("              :  ;;;;\\__/:  ;\\  ");
			System.out.println("               \\;__/.... :  _/;");
			System.out.println("              ___:__ ..__\\_/__;");
			System.out.println("              |  ## `--'   ##|;");
			System.out.println("              |_____/~;\\_____|;");
			System.out.println("                /~~~_ _ ~~   /");
			System.out.println("                // (_:_)   \\\\");
			System.out.println("          _     // ,'~ `,_\\\\~\\_");
			System.out.println("         //     ~~`,---,'~~~   \\");
			System.out.println("___     //         ~~~~      ;; \\_  __");
			System.out.println("/_\\/____::_        ,(:;:  __    ;; \\/;;\\  __");
			System.out.println("\\_/) _  :: (       ; ;;:    \\    / ;:;;::-,-'");
			System.out.println("   |[-]_::-|       : :;;:   /  * | ;:;;:;'");
			System.out.println("   | :__:: |       :.`,:::  : +  : /___:'");
			System.out.println("   |[_ ] [\\|       ;. ;--`:_:.  *| /   /");
			System.out.println("   |__| |_]|    ,-' . :uu-'/     \\|UUU/");
			System.out.println("   |_______|   ;_|_|_/    :_;_;_;_:");
			System.out.println("    [=====]");
		} else {
			System.out.println("Your Pet Needs to Sleep!");
			System.out.println("They are refusing to do anything untill they sleep");
			System.out.println("");
		}
	}

	public void bathroom() {
		if (energy < 100) {
			waste = 0;
		} else {
			System.out.println("Your Pet Needs to Sleep!");
			System.out.println("They are refusing to do anything untill they sleep");
			System.out.println("");
		}
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
	}

}
