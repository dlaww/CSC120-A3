import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

class Conversation {

  public static void main(String[] arguments) {
    // create an array for the canned responses
    String[] randomResponds = {
    "Mm-hm", 
    "Interesting", 
    "Wow really?", 
    "Tell me more...", 
    "Nice!"};

    Conversation obj = new Conversation();
    Scanner input = new Scanner(System.in);

    // Ask user number of rounds of conversation (int)
    System.out.println("How many rounds of conversation would you like? (Enter an int)");
    // User imputs int
    int numRounds = input.nextInt();
    input.nextLine();

    // Print short greeting
    System.out.println("Hey! How can I help?");

    // create for loop to loop conversation until rounds are complete
    for (int i = 0; i < numRounds; i++) {
      // user inputs
      String userResponse = input.nextLine();
      // if statement here, looking for conditions of mirrored words
      // else, system responds
      int randomIndex = (int)(Math.random()*randomResponds.length);
      System.out.println(randomResponds[randomIndex]);

    }
    
   

    
    // Accept conversation input and respond until number of rounds is complete
    // Be able to mirror words and repeat sentences back
    //while (rounds =! numRounds) {
      // Human inputs line of text
      // If it contains I/me/am/you/mine/your, mirror back that they said, replacing that word
    //}
   // conversation = userInput.nextString
    // Say goodbye and print conversation transcript
      // need to store conversation in a list? 
  }
   // create an array for the mirrored responses for ease of replacement
    // using the splitter method
    // still need to include this within the for loop

}
