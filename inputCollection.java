import java.util.Scanner;

public class inputCollection {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);

      String adjective =  "_________(Adjective) ";
      String noun = "_______(Noun) ";
      String exclamation =  "_________(Exclamative) ";
      String ingVerb = "______(Verb ending in -ing)";
      String pluralNoun = "______(Plural Noun)";
      String pastVerb = "______(Verb in past tense)";
      String place = "______(Place)"; 

      System.out.print("Enter an adjective: ");
      adjective = sc.nextLine();

      System.out.print("Enter a noun: ");
      noun = sc.nextLine();

      System.out.print("Enter a exclamative phrase: ");
      exclamation = sc.nextLine();
      
      System.out.print("Enter a verb ending in -ing: ");
      ingVerb = sc.nextLine();

      System.out.print("Enter a plural noun:");
      pluralNoun = sc.nextLine();
    
      System.out.print("Enter a verb in the past tense:");
      pastVerb = sc.nextLine();

      System.out.print("Enter a place:");
      place = sc.nextLine();
    }
    
}
