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
    
}
