import java.util.Scanner;

public class inputCollection {
    public String inputCol(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an adjective: ");
        String adjective = sc.nextLine();

        System.out.print("Enter a noun: ");
        String noun = sc.nextLine();

        System.out.print("Enter a exclamative phrase: ");
        String exclamation = sc.nextLine();
        
        System.out.print("Enter a verb ending in -ing: ");
        String ingVerb = sc.nextLine();

        System.out.print("Enter a plural noun:");
        String pluralNoun = sc.nextLine();
        
        System.out.print("Enter a verb in the past tense:");
        String pastVerb = sc.nextLine();

        System.out.print("Enter a place:");
        String place = sc.nextLine();

        String storageUnit = adjective + "," + noun + "," + exclamation + "," + ingVerb + "," + pluralNoun + "," + pastVerb + "," + place;

        sc.close();

        return storageUnit;
    }
    
}
