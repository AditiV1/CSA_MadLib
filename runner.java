public class runner{
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

        storyGeneration print = new storyGeneration(adjective, noun, exclamation, ingVerb, pluralNoun, pastVerb. place);
        System.out.println(print);
        
    }
    
}
