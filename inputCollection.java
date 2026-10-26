import java.util.Scanner; // import scanner class for user input

public class inputCollection {
    public String inputCol(){
        Scanner sc = new Scanner(System.in); // initialize scanner object
        
        // get adjective - sneha
        System.out.print("Enter an adjective: ");
        String adjective = sc.nextLine();
        // get noun - sneha 
        System.out.print("Enter a noun: ");
        String noun = sc.nextLine();
        // get exclamation - aditi
        System.out.print("Enter a exclamative phrase: ");
        String exclamation = sc.nextLine();
        // get ing verb - aditi
        System.out.print("Enter a verb ending in -ing: ");
        String ingVerb = sc.nextLine();
        // get plural noun - aditi
        System.out.print("Enter a plural noun:");
        String pluralNoun = sc.nextLine();
        // get past verb - aditi and sneha
        System.out.print("Enter a verb in the past tense:");
        String pastVerb = sc.nextLine();
        // get place - aditi and sneha
        System.out.print("Enter a place:");
        String place = sc.nextLine();
        // combine all indvidual inputs into string - aditi
        String storageUnit = adjective + "," + noun + "," + exclamation + "," + ingVerb + "," + pluralNoun + "," + pastVerb + "," + place;

        sc.close();

        return storageUnit; // return combined string to the caller - aditi
    }
    
}
