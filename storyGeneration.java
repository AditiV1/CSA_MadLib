public class storyGeneration{
    public String storyGen(String adjective, String noun, String exclamation, String ingVerb, String pluralNoun, String pastVerb, String place){
        String finalSentence = ("Today in computer science class, I tried to run my "+ adjective + " new program. Just as I clicked execution, the screen froze because a stray "+ noun + " broke the compiler!\r\n" + //
                        "My partner gasped, "+ exclamation + " and started "+ ingVerb + " the power button to fix it. Suddenly, the monitor refreshed and displayed a massive list of missing  "+ pluralNoun + ".\r\n" + //
                        "Luckily, we "+ pastVerb + " the syntax error just in time and walked over to "+ place + " to celebrate our passing grade.");
        return finalSentence;
    }
}
  
