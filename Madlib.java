public class Madlib{
    public String printMadlib(String adjective, String noun, String exclamation, String verbing, String pluralNoun, String pastTense, String Place){
        String finalSentence = ("Today in computer science class, I tried to run my "+ adjective + " new program. Just as I clicked execution, the screen froze because a stray "+ noun + " broke the compiler!\r\n" + //
                        "My partner gasped, "+ exclamation + " and started "+ verbing + " the power button to fix it. Suddenly, the monitor refreshed and displayed a massive list of missing  "+ pluralNoun + ".\r\n" + //
                        "Luckily, we "+ pastTense + " the syntax error just in time and walked over to "+ Place + " to celebrate our passing grade.");
        return finalSentence;
    }
    public static void main(String[]args){
        

        Madlib newMadLib = new Madlib();
        System.out.println(newMadLib.printMadlib(adjective, noun, exclamation, verbing, pluralNoun, pastTense, Place));
    }
}
  
