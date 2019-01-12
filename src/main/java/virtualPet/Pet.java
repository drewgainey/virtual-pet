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
		hunger = 0;
		thirst = thirst + 10;
		waste = waste + 10;
	}

	public void play() {
		boredom = 0;
		hunger = hunger + 10;
		energy = energy + 10;
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
		thirst = 0;
		System.out.println("                ______    ____ "  );
		System.out.println("              :  ;;;;\\__/:  ;\\  "  );
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
	}

	public void bathroom() {
		waste = 0; 
	}

}
