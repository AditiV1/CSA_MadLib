// class for the story
public class storyGeneration{
    // method to make the story using the words passed in
    public String storyGen(String adjective, String noun, String exclamation, String verbing, String pluralNoun, String pastTense, String Place){
        // putting the story sentences together with the variables
        String finalSentence = ("Today in computer science class, I tried to run my "+ adjective + " new program. Just as I clicked execution, the screen froze because a stray "+ noun + " broke the compiler!\r\n" + //
                        "My partner gasped, "+ exclamation + " and started "+ verbing + " the power button to fix it. Suddenly, the monitor refreshed and displayed a massive list of missing  "+ pluralNoun + ".\r\n" + //
                        "Luckily, we "+ pastTense + " the syntax error just in time and walked over to "+ Place + " to celebrate our passing grade.");
         // return the finished story
        return finalSentence;
    }
}
  
