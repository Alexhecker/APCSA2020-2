package Unit0;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

public class AsciiArt
{
	public static void main ( String[] args )
	{
		System.out.println("Your Name \n\n" );
		System.out.println("What type of ANIMAL YOU WILL DRAW" );
		System.out.println("\n\n\n\n" );
		house(3);
		house(7);


	}
	public static void house(int x) {
		System.out.println("     /\\      " );
		System.out.println("    /  \\     " );
		System.out.println("   /    \\    " );
		System.out.println("  /      \\    " );
		System.out.println(" /        \\    " );
		System.out.println("/          \\    " );
		for (int i = 0; i < x; i++) {
			System.out.println("|          |");
		}
		System.out.println("|   ~~~~   |");
		System.out.println("|   |  |   |");
		System.out.println("~~~~~~~~~~~~~");
	}
}