import java.util.Scanner;

public class MadLib {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter an adjective: ");
    String adjective = sc.nextLine();

    System.out.print("Enter a noun: ");
    String noun = sc.nextLine();


    System.out.print("Enter a exclamative phrase: ");
    String exclamation = sc.nextLine();
    
    System.out.print("Enter a verb ending in -ing ");
    String verb = sc.nextLine();
  }
  
}
