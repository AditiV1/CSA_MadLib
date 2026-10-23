public class runner{
  public static void main(String[] args){
        inputCollection scanned = new inputCollection();
        
        String [] storageList = scanned.inputCol().split(",");
        
        String adjective = storageList[0];
        String noun = storageList[1];

        System.out.println(adjective + noun);
        
    }
}
