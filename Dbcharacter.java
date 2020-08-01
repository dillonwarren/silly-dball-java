import java.util.Random;
import java.util.Scanner;
class Dbcharacter {
    private String name;
    private int strength;
	private int ki;



    public Dbcharacter(String name, int strength, int ki){
        this.name = name;
        this.strength = strength;
        this.ki = ki;
    }
    public void getStats(){
        System.out.println(this.name + " has a strength of  " + this.strength + " and has a ki level of " + this.ki);
    }
   
    






    public static void main(String[] args)  {
    	
        Random rand = new Random();

        Dbcharacter buu = new Dbcharacter("Majin buu", rand.nextInt(10),rand.nextInt(10));
        Dbcharacter vegeta = new Dbcharacter("Vegeta", rand.nextInt(10),rand.nextInt(10));
        Dbcharacter piccolo = new Dbcharacter("Piccolo", rand.nextInt(10),rand.nextInt(10));
        buu.getStats();
        vegeta.getStats();
        piccolo.getStats();
        Scanner sc = new Scanner(System.in);
    	System.out.println("Who is your favorite character? ");
        String favCharacter = sc.next();
        System.out.println("Your favorite character is  "+favCharacter);
        
        



    }
}
