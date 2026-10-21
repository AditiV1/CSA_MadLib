import java.util.Scanner;

public class inputCollection {
    public String inputCol(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an adjective: ");
        String adjective = sc.nextLine();

        System.out.print("Enter a noun: ");
        String noun = sc.nextLine();

        return adjective;
        return noun;
    }
    public static void main(String[] args){
        inputCollection scanned = new inputCollection();
        inputCollection.inputCol();
        
    }
}
