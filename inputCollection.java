import java.util.Scanner; // import scanner class for user input

public class inputCollection {
    public String inputCol(){
        Scanner sc = new Scanner(System.in); // initialize scanner object
        
        // get adjective
        System.out.print("Enter an adjective: ");
        String adjective = sc.nextLine();
        // get noun
        System.out.print("Enter a noun: ");
        String noun = sc.nextLine();
        // get exclamation
        System.out.print("Enter a exclamative phrase: ");
        String exclamation = sc.nextLine();
        // get ing verb
        System.out.print("Enter a verb ending in -ing: ");
        String ingVerb = sc.nextLine();
        // get plural noun
        System.out.print("Enter a plural noun:");
        String pluralNoun = sc.nextLine();
        // get past verb
        System.out.print("Enter a verb in the past tense:");
        String pastVerb = sc.nextLine();
        // get place
        System.out.print("Enter a place:");
        String place = sc.nextLine();
        // combine all indvidual inputs into string
        String storageUnit = adjective + "," + noun + "," + exclamation + "," + ingVerb + "," + pluralNoun + "," + pastVerb + "," + place;

        sc.close();

        return storageUnit; // return combined string to the caller
    }
    
    public static void main(String[] args){
        inputCollection scanned = new inputCollection(); // create instance of the class
        // call inputCol method and split resulting string back into an array
        String [] storageList = scanned.inputCol().split(",");
        // extract each individual value from array into its own variable
        String adjective = storageList[0];
        String noun = storageList[1];
        String exclamation = storageList[2];
        String ingVerb = storageList[3];
        String pluralNoun = storageList[4];
        String pastVerb = storageList[5];
        String place = storageList[6];
        // print result
        System.out.println(adjective + noun + exclamation + ingVerb + pluralNoun + pastVerb +place);
        
    }
}
