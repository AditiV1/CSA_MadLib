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
    
    public static void main(String[] args){
        inputCollection scanned = new inputCollection();
        
        String [] storageList = scanned.inputCol().split(",");
        
        String adjective = storageList[0];
        String noun = storageList[1];
        String exclamation = storageList[2];
        String ingVerb = storageList[3];
        String pluralNoun = storageList[4];
        String pastVerb = storageList[5];
        String place = storageList[6];

        System.out.println(adjective + noun + exclamation + ingVerb + pluralNoun + pastVerb +place);
        
    }
}
