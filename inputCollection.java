import java.util.Scanner;

public class inputCollection {
    public String inputCol(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an adjective: ");
        String adjective = sc.nextLine();

        System.out.print("Enter a noun: ");
        String noun = sc.nextLine();

        String storageUnit = adjective + "," + noun;

        sc.close();

        return storageUnit;
    }
    
    public static void main(String[] args){
        inputCollection scanned = new inputCollection();
        
        String [] storageList = scanned.inputCol().split(",");
        
        String adjective = storageList[0];
        String noun = storageList[1];

        System.out.println(adjective + noun);
        
    }
}
