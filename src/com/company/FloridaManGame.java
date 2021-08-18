package com.company;

public class FloridaManGame {

}

/*The class responsible for playing the game!

This class will utilize the other two classes to handle the game experience.
This is where a majority of your game logic should be taking place...not in Main!
Game Workflow
1. The game welcomes the user to the game and explains how it works.
2. The game then enters a loop that continues until there are no more questions in the bank.
3. The game pulls an element from the ArrayList of headlines
4. The game shows the redacted headline with the keyword missing
5. The game shows the 4 possible keywords
6. The game prompts the user to type in the keyword they think it is
7. The game compares their response to the actual keyword for that headline
    •If correct: Should let the user know they were correct
    •If incorrect: Let the user know they were wrong and what the keyword really was
8. Show their current tally of correct and incorrect guesses
9. The game outputs how many questions remain in the bank
10. Cycle repeats until there are no more questions in bank - resulting in breaking out of the loop
11. The game will prompt the user if they would like to play again. If yes, the method calls itself over. If not, the application is free to exit
*/
